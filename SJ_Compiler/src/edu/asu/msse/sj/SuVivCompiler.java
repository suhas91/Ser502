package edu.asu.msse.sj;

import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class SuVivCompiler {

	public static void main(String[] args) throws IOException {
		ANTLRFileStream antlrFileStream = new ANTLRFileStream(Constants.srcFilename); 
		SuVivLexer lexer = new SuVivLexer(antlrFileStream);
		CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
		SuVivParser sjParser = new SuVivParser(commonTokenStream);
		
		ParseTree parsetree = sjParser.start();
		ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
		SuVivWalker sampleTokenListener = new SuVivWalker();
		parseTreeWalker.walk(sampleTokenListener, parsetree);
		

	}

}
