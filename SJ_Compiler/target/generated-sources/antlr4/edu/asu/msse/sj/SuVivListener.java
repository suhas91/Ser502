// Generated from SuViv.g4 by ANTLR 4.5.3
package edu.asu.msse.sj;



import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SuVivParser}.
 */
public interface SuVivListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SuVivParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(SuVivParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link SuVivParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(SuVivParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link SuVivParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(SuVivParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SuVivParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(SuVivParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SuVivParser#functionstmt}.
	 * @param ctx the parse tree
	 */
	void enterFunctionstmt(SuVivParser.FunctionstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SuVivParser#functionstmt}.
	 * @param ctx the parse tree
	 */
	void exitFunctionstmt(SuVivParser.FunctionstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SuVivParser#ifelseStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfelseStmt(SuVivParser.IfelseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SuVivParser#ifelseStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfelseStmt(SuVivParser.IfelseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SuVivParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(SuVivParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SuVivParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(SuVivParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SuVivParser#elseStmt}.
	 * @param ctx the parse tree
	 */
	void enterElseStmt(SuVivParser.ElseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SuVivParser#elseStmt}.
	 * @param ctx the parse tree
	 */
	void exitElseStmt(SuVivParser.ElseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SuVivParser#whileloop}.
	 * @param ctx the parse tree
	 */
	void enterWhileloop(SuVivParser.WhileloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link SuVivParser#whileloop}.
	 * @param ctx the parse tree
	 */
	void exitWhileloop(SuVivParser.WhileloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link SuVivParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(SuVivParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SuVivParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(SuVivParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SuVivParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(SuVivParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SuVivParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(SuVivParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SuVivParser#stackOp}.
	 * @param ctx the parse tree
	 */
	void enterStackOp(SuVivParser.StackOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SuVivParser#stackOp}.
	 * @param ctx the parse tree
	 */
	void exitStackOp(SuVivParser.StackOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SuVivParser#push}.
	 * @param ctx the parse tree
	 */
	void enterPush(SuVivParser.PushContext ctx);
	/**
	 * Exit a parse tree produced by {@link SuVivParser#push}.
	 * @param ctx the parse tree
	 */
	void exitPush(SuVivParser.PushContext ctx);
	/**
	 * Enter a parse tree produced by {@link SuVivParser#pop}.
	 * @param ctx the parse tree
	 */
	void enterPop(SuVivParser.PopContext ctx);
	/**
	 * Exit a parse tree produced by {@link SuVivParser#pop}.
	 * @param ctx the parse tree
	 */
	void exitPop(SuVivParser.PopContext ctx);
	/**
	 * Enter a parse tree produced by {@link SuVivParser#stkassign}.
	 * @param ctx the parse tree
	 */
	void enterStkassign(SuVivParser.StkassignContext ctx);
	/**
	 * Exit a parse tree produced by {@link SuVivParser#stkassign}.
	 * @param ctx the parse tree
	 */
	void exitStkassign(SuVivParser.StkassignContext ctx);
	/**
	 * Enter a parse tree produced by {@link SuVivParser#funcall}.
	 * @param ctx the parse tree
	 */
	void enterFuncall(SuVivParser.FuncallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SuVivParser#funcall}.
	 * @param ctx the parse tree
	 */
	void exitFuncall(SuVivParser.FuncallContext ctx);
	/**
	 * Enter a parse tree produced by {@link SuVivParser#relationexp}.
	 * @param ctx the parse tree
	 */
	void enterRelationexp(SuVivParser.RelationexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SuVivParser#relationexp}.
	 * @param ctx the parse tree
	 */
	void exitRelationexp(SuVivParser.RelationexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SuVivParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SuVivParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SuVivParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SuVivParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SuVivParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterRelation(SuVivParser.RelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SuVivParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitRelation(SuVivParser.RelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SuVivParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpression(SuVivParser.SimpleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SuVivParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpression(SuVivParser.SimpleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SuVivParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(SuVivParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SuVivParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(SuVivParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link SuVivParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(SuVivParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SuVivParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(SuVivParser.FactorContext ctx);
}