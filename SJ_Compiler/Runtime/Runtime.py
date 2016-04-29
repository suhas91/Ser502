import sys
import operator
import re


sys.setrecursionlimit(50);

# module to pass an operator

ops = {"+": operator.add,
       "-": operator.sub,
       "*": operator.mul,
       "/": operator.div,
       ">": operator.gt,
       "<": operator.lt,
       ">=": operator.ge,
       "<=": operator.le,
       "==": operator.eq,
       "!=": operator.ne,
       }

# tokens of lexer
OPERATORS = 'OPERATORS'
INT = 'INT'
ID = 'ID'
STRING = 'STRING'
PUSH = 'PUSH'
PRINT = 'PRINT'
ASSIGN = 'ASSIGN'
CONDITION = 'CONDITION'
IFTRUE = 'IFTRUE'
IFFALSE = 'IFFALSE'
GOTO = 'GOTO'
BOOLEAN = 'BOOLEAN'
ENDC = 'ENDC'
BEGIN_FUNC = "BEGIN_FUNC"
FUNCTION = 'FUNCTION'
END_FUNC = 'END_FUNC'
CALL_FUNCT = 'CALL_FUNCT'
RETURN = 'RETURN'
STACK = 'RESSTACK'
ASSIGNSTACK = 'ASSIGNSTACK'
POP = 'POP'

token_expressions = [
    (r'[ \n\t]+',                   None),
    (r'//.*',                       None),
    (r'\+',                         OPERATORS),
    (r'-',                          OPERATORS),
    (r'\*',                         OPERATORS),
    (r'/',                          OPERATORS),
    (r'<=',                         OPERATORS),
    (r'<',                          OPERATORS),
    (r'>=',                         OPERATORS),
    (r'>',                          OPERATORS),
    (r'!=',                         OPERATORS),
    (r'==',                         OPERATORS),
    (r'TRUE',                       BOOLEAN),
    (r'FALSE',                      BOOLEAN),
    (r'POP',                        POP),
    (r'PUSH',                       PUSH),
    (r'ASSIGNSTACK',                ASSIGNSTACK),
    (r'ASSIGN',                     ASSIGN),
    (r'PRINT',                      PRINT),
    (r'CONDITION.+',                CONDITION),
    (r'GOTO.+',                     GOTO),
    (r'IFTRUE',                     IFTRUE),
    (r'IFFALSE',                    IFFALSE),
    (r'ENDC.+',                     ENDC),
    (r'BEGIN_FUNC',                 BEGIN_FUNC),
    (r'FUNCTION.+',                 FUNCTION),
    (r'END_FUNC',                   END_FUNC),
    (r'CALL_FUNCT.+',               CALL_FUNCT),
    (r'RESSTACK',                   STACK),
    (r'[0-9]+',                     INT),
    (r'[A-Za-z_][A-Za-z0-9_]*',     ID),
    (r'\"(\\.|[^\"])*\"',           STRING),
]


def lexer(characters, token_expressions):
    position = 0
    tokens = []
    while position < len(characters):
        match = None
        for token_expr in token_expressions:
            pattern, tag = token_expr
            regex = re.compile(pattern)
            match = regex.match(characters, position)
            if match:
                text = match.group(0)
                if tag:
                    token = (text, tag)
                    tokens.append(token)
                break
        if not match:
            sys.stderr.write('Illegal character: %s\\n' % characters[position])
            sys.exit(1)
        else:
            position = match.end(0)
    return tokens


def interpreter(tokens, stack, symbolTable, conditions, functionsTable):

    index = 0

   # Loop which iterates over the tokens
    while index < len(tokens):


        if tokens[index][1] == PUSH:

            index += 1

            # add to stack
            if tokens[index][1] == INT:
                symbol = int(tokens[index][0])
            elif tokens[index][1] == STACK:
                symbol = []
            else:
                symbol = tokens[index][0]

            stack.append(symbol)

            # Adding all Identifiers - ID to Symbol Table

            if tokens[index][1] == ID:
                if symbol not in symbolTable:
                    symbolTable[symbol] = None

        if tokens[index][1] == ASSIGN:
            symbol = stack.pop()
            value = stack.pop()
            stack.append(symbol)
            symbolTable[symbol] = value

        if tokens[index][1] == ASSIGNSTACK:
            symbol = stack.pop()
            value = stack.pop()
            stack.append(symbol)
            symbolTable[symbol].append(value)

        if tokens[index][1] == POP:
            index += 1;
            symbol = tokens[index][0];
            symbol = symbolTable[symbol].pop();
            stack.append(symbol);

        if tokens[index][1] == OPERATORS:
            item2 = stack.pop()
            item1 = stack.pop()

            if lexer(str(item2), token_expressions)[0][1] == ID:
                item2 = symbolTable[item2]

            if lexer(str(item1), token_expressions)[0][1] == ID:
                item1 = symbolTable[item1]

            op_func = ops[tokens[index][0]]
            stack.append(op_func(item1, item2)) #change

        if tokens[index][1] == IFTRUE:
            item = stack.pop()
            ifCaseTokens = []

            index += 1
            label = tokens[index][0]
            index += 1

            # updating condition with name of variable
            conditions[label] = item

            if item == False:
                stack.append(False)
                # skip to loop end
                while tokens[index][0] != "END" + label:
                    index += 1
            else:
                # get function instructions
                while tokens[index][0] != "END" + label:
                    ifCaseTokens.append(tokens[index])
                    index += 1

                # recursively execute them 
                interpreter(ifCaseTokens, stack, symbolTable, conditions, functionsTable)

                # adding condition again to the stack
                stack.append(item)

        if tokens[index][1] == IFFALSE:
            item = stack.pop()
            ifCaseTokens = []

            index += 1
            label = tokens[index][0]
            index += 1

            if item == True:
                while tokens[index][0] != "END" + label:
                    index += 1
            else:
                while tokens[index][0] != "END" + label:
                    ifCaseTokens.append(tokens[index])
                    index += 1
                interpreter(ifCaseTokens, stack, symbolTable, conditions, functionsTable)
                stack.append(item)

        if tokens[index][1] == GOTO:

            labels = tokens[index][0].split(",")
            ifTrue = labels[1]
            label = labels[2]
            if conditions[ifTrue]:
                while tokens[index][0] != "CONDITION " + label:
                    index -= 1

        if tokens[index][1] == BEGIN_FUNC:
            while tokens[index][1] != END_FUNC:
                index += 1

        if tokens[index][1] == CALL_FUNCT:

            # parse  parameters with function name
            functions = tokens[index][0][10:].strip()
            functions = functions.split(":")
            callFuncName = functions[0]
            callFuncParameters = functions[1].split(",")

            # adding function name with flag set to true to conditions
            conditions[callFuncName] = True

            tempIndex = index
            index = 0
            funcTest = "FUNCTION " + callFuncName


            # checking if dict  already has function statement list 
            if callFuncName not in functionsTable:

                # search function from beginning
                while tokens[index][0] != FUNCTION:

                    # Found then exit loop
                    if funcTest in tokens[index][0]:
                        break
                    index += 1

                functionListTokens = []

                # retrieving function statement list and storing in functionListTokens
                while tokens[index][0] != END_FUNC:
                    functionListTokens.append(tokens[index])
                    index += 1
                functionListTokens.append(tokens[index])

                functionsTable[callFuncName] = functionListTokens

            else:

                functionListTokens = functionsTable[callFuncName]

            # parsing function parameters
            functions = functionListTokens[0][0][8:].strip()
            functions = functions.split(":")
            funcName = functions[0]
            funcParameters = functions[1].split(",")

            scopedSymbolTable = symbolTable.copy()

            # matching the paramters present in symbol table
            if len(callFuncParameters) == len(funcParameters):
                for paramIndex in xrange(0, len(callFuncParameters)):
                    value = symbolTable[callFuncParameters[paramIndex]]
                    scopedSymbolTable[funcParameters[paramIndex]] = value
            else:
                print 'Parameters mismatch for the function ' + funcName
                sys.exit()

            interpreter(
                functionListTokens, stack, scopedSymbolTable, conditions, functionsTable)
            index = tempIndex
            scopedSymbolTable = {}

        if tokens[index][1] == RETURN:
            symbol = stack.pop()

            # if variable
            # find the value and print it
            if lex(str(symbol), token_exprs)[0][1] == ID:
                stack.append(symbolTable[symbol])
            else:
                stack.append(symbol)

            while tokens[index][1] != END_FUNC:
                index += 1

            # break out of the recursive function to skip execution of END_FUNC
            break

        if tokens[index][1] == END_FUNC:
            stack.append(None)

        if tokens[index][1] == PRINT:
            symbol = stack.pop()

            # if variable
            # find the value and print it
            if lexer(str(symbol), token_expressions)[0][1] == ID:
                print symbolTable[symbol]
            else:
                print symbol

        index += 1





if __name__ == "__main__":

    if len(sys.argv) <= 1:
        print "Error! No file is given for reading"
        sys.exit()

    # read the file
    with open(sys.argv[1] + ".sv.ic", "r") as myfile:
        characters = myfile.read()

    # global symbol table
    symbolTable = {}
    # global stack
    stack = []
    # conditions stack
    conditions = {}

    # get the tokens from the lexer
    tokens = lexer(characters, token_expressions)

    # starting the interpreter
    interpreter(tokens, stack, symbolTable, conditions, {})