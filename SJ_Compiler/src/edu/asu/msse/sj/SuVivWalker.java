package edu.asu.msse.sj;

import java.io.PrintWriter;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import edu.asu.msse.sj.SuVivParser.AssignmentContext;
import edu.asu.msse.sj.SuVivParser.ElseStmtContext;
import edu.asu.msse.sj.SuVivParser.ExpressionContext;
import edu.asu.msse.sj.SuVivParser.FactorContext;
import edu.asu.msse.sj.SuVivParser.FuncallContext;
import edu.asu.msse.sj.SuVivParser.FunctionstmtContext;
import edu.asu.msse.sj.SuVivParser.IfStmtContext;
import edu.asu.msse.sj.SuVivParser.IfelseStmtContext;
import edu.asu.msse.sj.SuVivParser.PopContext;
import edu.asu.msse.sj.SuVivParser.PrintContext;
import edu.asu.msse.sj.SuVivParser.PushContext;
import edu.asu.msse.sj.SuVivParser.RelationContext;
import edu.asu.msse.sj.SuVivParser.RelationexpContext;
import edu.asu.msse.sj.SuVivParser.SimpleExpressionContext;
import edu.asu.msse.sj.SuVivParser.StackOpContext;
import edu.asu.msse.sj.SuVivParser.StartContext;
import edu.asu.msse.sj.SuVivParser.StkassignContext;
import edu.asu.msse.sj.SuVivParser.StmtContext;
import edu.asu.msse.sj.SuVivParser.TermContext;
import edu.asu.msse.sj.SuVivParser.WhileloopContext;


public class SuVivWalker extends SuVivBaseListener{

	public StringBuilder stringbuilder = new StringBuilder();
	@Override
	public void enterEveryRule(ParserRuleContext arg0) {
		
		
	}
 
	@Override
	public void exitEveryRule(ParserRuleContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitErrorNode(ErrorNode arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitTerminal(TerminalNode arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterStart(StartContext ctx) {
		
		
	}

	@Override
	public void exitStart(StartContext ctx)  {
		try {
			PrintWriter writer = new PrintWriter(Constants.icFilename,"UTF-8");
			writer.write(stringbuilder.toString());
			writer.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void enterStmt(StmtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitStmt(StmtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterFunctionstmt(FunctionstmtContext ctx) {
		stringbuilder.append("\nBEGIN_FUNC");
		stringbuilder.append("\nFUNCTION ");
		stringbuilder.append(ctx.ID(0));
		stringbuilder.append(":");
		
		for(int i=1; i < ctx.ID().size(); i++ ){
			stringbuilder.append(ctx.ID(i));
			stringbuilder.append(",");
		}
		stringbuilder.setLength(stringbuilder.length()-1);	
	}

	@Override
	public void exitFunctionstmt(FunctionstmtContext ctx) {
		stringbuilder.append("\nEND_FUNC");
		
	}

	 @Override
	public void enterIfelseStmt(IfelseStmtContext ctx) {
		// TODO Auto-generated method stub
		
	}
	 @Override
	public void exitIfelseStmt(IfelseStmtContext ctx) {
		// TODO Auto-generated method stub
		
	}
	 @Override
	public void enterIfStmt(IfStmtContext ctx) {
		// TODO Auto-generated method stub
		
	}
	 @Override
	public void exitIfStmt(IfStmtContext ctx) {
		stringbuilder.append("\nENDC1");
		
	}
	 @Override
	public void enterElseStmt(ElseStmtContext ctx) {
		stringbuilder.append("\nIFFALSE C2");
	
	}
	 @Override
	public void exitElseStmt(ElseStmtContext ctx) {
		stringbuilder.append("\nENDC2");
	}
	 
	 @Override
	public void enterRelationexp(RelationexpContext ctx) {
		stringbuilder.append("\nCONDITION C0");
		
	}
	
	 @Override
	public void exitRelationexp(RelationexpContext ctx) {
		stringbuilder.append ("\nENDCONDITION");
		stringbuilder.append ("\nIFTRUE C1");
	
	}


	@Override
	public void enterWhileloop(WhileloopContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitWhileloop(WhileloopContext ctx) {
		stringbuilder.append ("\nENDC1");
		stringbuilder.append ("\nGOTO,C1,C0");
		
	}

	@Override
	public void enterPush(PushContext ctx) {
	
	}
	
	@Override
	public void exitPush(PushContext ctx) {
		stringbuilder.append("\nPUSH ");
		stringbuilder.append(ctx.INT());
		stringbuilder.append("\nPUSH ");
		stringbuilder.append(ctx.ID().getText());
		stringbuilder.append("\nASSIGNSTACK");
		
	}
	@Override
	public void enterPop(PopContext ctx) {
		
	}
	@Override
	public void exitPop(PopContext ctx) {
		stringbuilder.append("\nPOP ");
		if(ctx.ID().size() > 1){
			stringbuilder.append(ctx.ID(1).getText());
			stringbuilder.append("\nPUSH ");
			stringbuilder.append(ctx.ID(0).getText());
			stringbuilder.append("\nASSIGN");			
		}else{
				stringbuilder.append(ctx.ID(0).getText());
		}
	}
	@Override
	public void enterStkassign(StkassignContext ctx) {
		
	}
	@Override
	public void exitStkassign(StkassignContext ctx) {
		stringbuilder.append ("\nPUSH RESSTACK");
		stringbuilder.append("\nPUSH ");
		stringbuilder.append(ctx.ID().getText());
		stringbuilder.append("\nASSIGN");
		
		
	}
	
	@Override
	public void enterAssignment(AssignmentContext ctx) {
		
	}

	@Override
	public void exitAssignment(AssignmentContext ctx) {
		String id = ctx.ID().getText();
		stringbuilder.append("\nPUSH " + id );
		stringbuilder.append("\nASSIGN");
		
	}

	@Override
	public void enterPrint(PrintContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitPrint(PrintContext ctx) {			
		stringbuilder.append("\nPRINT");		
	}

	@Override
	public void enterStackOp(StackOpContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitStackOp(StackOpContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterFuncall(FuncallContext ctx) {
		stringbuilder.append("\nCALL_FUNCT ");
		stringbuilder.append(ctx.ID(0).getText()+":");
		stringbuilder.append(ctx.ID(1).getText());
		
	}

	@Override
	public void exitFuncall(FuncallContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterExpression(ExpressionContext ctx) {
		
	}

	@Override
	public void exitExpression(ExpressionContext ctx) {
		if(ctx.LOGICALOP(0)!= null)
		{
			if (ctx.LOGICALOP(0).getText().equals("and")) {
				stringbuilder.append("LOGICALAND" + "\n");
			} else if (ctx.LOGICALOP(0).getText().equals("or")) {
				stringbuilder.append("LOGICALOR" + "\n");
			}
		}
		
	}

	@Override
	public void enterRelation(RelationContext ctx) {
		
		
	}

	@Override
	public void exitRelation(RelationContext ctx) {
		if (ctx.COMPARISON() != null) {
			if(ctx.COMPARISON().toString().equals(">="))
				stringbuilder.append(">=" + "\n");
			else if(ctx.COMPARISON().toString().equals("=="))
				stringbuilder.append("\n" + "==" );
			else if(ctx.COMPARISON().toString().equals("<="))
				stringbuilder.append("\n" +"<=");
			else if(ctx.COMPARISON().toString().equals(">"))
				stringbuilder.append("\n"+ ">");
			else if(ctx.COMPARISON().toString().equals("<"))
				stringbuilder.append("\n"+"<");
			else if(ctx.COMPARISON().toString().equals("!="))
				stringbuilder.append("\n"+"!=");
		}
		
	}

	@Override
	public void enterSimpleExpression(SimpleExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitSimpleExpression(SimpleExpressionContext ctx) {
		if(ctx.PLUSMIN(0) != null)
		{
			if (ctx.PLUSMIN(0).getText().equals("+")) {
				stringbuilder.append("\n+" );
			} else if (ctx.PLUSMIN(0).getText().equals("-")) {
				stringbuilder.append("\n-");
			}
		}
		
	}

	@Override
	public void enterTerm(TermContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitTerm(TermContext ctx) 
	{
		if (ctx.MULT(0) != null) 
		{
			if (ctx.MULT(0).getText().equals("*")) 
			{
				stringbuilder.append("\n*" );
			} else if (ctx.MULT(0).getText().equals("/")) 
			{
				stringbuilder.append("\n/");
			}
		}
		
	}

	@Override
	public void enterFactor(FactorContext ctx) {
		 if(ctx.ID() != null)
		{
			stringbuilder.append("\nPUSH" + " ");
			stringbuilder.append(ctx.ID().getText());
		}
		 else if(ctx.INT() != null)
		{
			stringbuilder.append("\nPUSH" + " ");
			stringbuilder.append(ctx.INT().getText());
		}
		else if(ctx.BOOL() != null)
		{
			stringbuilder.append("\nPUSH" + " ");
			stringbuilder.append(ctx.BOOL().getText());
		}
		else if(ctx.STRING()!= null)
		{
			stringbuilder.append("\nPUSH" + " ");
			stringbuilder.append(ctx.STRING().getText());
		}
		
	}
		
	

	@Override
	public void exitFactor(FactorContext ctx) 
	{
		
}
}
