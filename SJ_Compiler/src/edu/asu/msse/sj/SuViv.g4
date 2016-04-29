/**
 * Define a grammar called SuViv
 */
grammar SuViv;

@lexer:: header {

}

@parser:: header {

} 
start
    : stmt+;
 
stmt
    : functionstmt
    | ifelseStmt
    | whileloop 
    | assignment 
    | print
    | expression
    | stackOp  
    | funcall
    ;


functionstmt
    : FUNCTION ID '(' (ID)(','ID)* ')' '{' stmt+ '}'
    ;

ifelseStmt
	:ifStmt (elseStmt)? ;

ifStmt
    : IF '(' relationexp ')' '{' stmt+ '}';
 
elseStmt
	:ELSE '{' stmt+ '}' ;
		 
whileloop
    : 'while' '(' relationexp ')' '{' stmt+ '}'
    ;
    
assignment
    : VAR? ID '=' expression SEMICOLON 
    | VAR? ID SEMICOLON 			  
    ;

print
    : 'print' factor+  SEMICOLON
    ;
    
stackOp
    : push 
    | pop 
    | stkassign 
    ;

push
	:ID '.' PUSH '(' INT ')' SEMICOLON ;

pop
	:(VAR? ID ASSIGN )? ID '.' POP '()' SEMICOLON ;

stkassign
	: VAR? ID ASSIGN STACK SEMICOLON ;
funcall
    : FN_CALL ID '('ID ')' SEMICOLON
    ;
    
FN_CALL
    : 'call'
    ;
    
FUNCTION: 'function' ;
SEMICOLON: ';' ;

ASSIGN: '=';

STACK: 'STACK';
PUSH: 'push';
POP: 'pop';

VAR 
    : 'var';


    
ELSE : 'else';

IF: 'if';
 
relationexp : expression;
     
expression : relation (LOGICALOP relation)*;

relation: simpleExpression (COMPARISON simpleExpression)?;

simpleExpression: term (PLUSMIN term)* ;

term: factor (MULT factor)* ; 

factor : (INT | ID | BOOL | STRING | '(' expression ')' );
	
BOOL: 'TRUE'
    | 'FALSE'
    ;
LOGICALOP : 'and'
		  | 'or'
		  ;    
		  
COMPARISON: ('==' | '<' | '>' | '<=' | '>=' | '!=');

MULT
    : '*'
    | '/'
    ;

PLUSMIN
    : '+'
    | '-'
    ;
    
    


ID: [A-Za-z_][A-Za-z0-9_]*;

STRING: '"' [A-Za-z_ ][A-Za-z0-9_ ]* '"';

INT: [0-9]+ ;

SPACES : ('\t' | '\r' | '\n' | ' ' )+ -> skip ;

 