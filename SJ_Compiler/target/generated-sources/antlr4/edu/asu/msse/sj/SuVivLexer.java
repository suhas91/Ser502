// Generated from SuViv.g4 by ANTLR 4.5.3
package edu.asu.msse.sj;



import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SuVivLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		FN_CALL=10, FUNCTION=11, SEMICOLON=12, ASSIGN=13, STACK=14, PUSH=15, POP=16, 
		VAR=17, ELSE=18, IF=19, BOOL=20, LOGICALOP=21, COMPARISON=22, MULT=23, 
		PLUSMIN=24, ID=25, STRING=26, INT=27, SPACES=28;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"FN_CALL", "FUNCTION", "SEMICOLON", "ASSIGN", "STACK", "PUSH", "POP", 
		"VAR", "ELSE", "IF", "BOOL", "LOGICALOP", "COMPARISON", "MULT", "PLUSMIN", 
		"ID", "STRING", "INT", "SPACES"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "','", "')'", "'{'", "'}'", "'while'", "'print'", "'.'", 
		"'()'", "'call'", "'function'", "';'", "'='", "'STACK'", "'push'", "'pop'", 
		"'var'", "'else'", "'if'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "FN_CALL", 
		"FUNCTION", "SEMICOLON", "ASSIGN", "STACK", "PUSH", "POP", "VAR", "ELSE", 
		"IF", "BOOL", "LOGICALOP", "COMPARISON", "MULT", "PLUSMIN", "ID", "STRING", 
		"INT", "SPACES"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public SuVivLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SuViv.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\36\u00c1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25"+
		"\u008d\n\25\3\26\3\26\3\26\3\26\3\26\5\26\u0094\n\26\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\5\27\u009f\n\27\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\7\32\u00a7\n\32\f\32\16\32\u00aa\13\32\3\33\3\33\3\33\7\33\u00af"+
		"\n\33\f\33\16\33\u00b2\13\33\3\33\3\33\3\34\6\34\u00b7\n\34\r\34\16\34"+
		"\u00b8\3\35\6\35\u00bc\n\35\r\35\16\35\u00bd\3\35\3\35\2\2\36\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36\3\2\13\4\2>"+
		">@@\4\2,,\61\61\4\2--//\5\2C\\aac|\6\2\62;C\\aac|\6\2\"\"C\\aac|\7\2\""+
		"\"\62;C\\aac|\3\2\62;\5\2\13\f\17\17\"\"\u00ca\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\3;\3\2\2\2\5=\3\2\2\2\7?\3\2"+
		"\2\2\tA\3\2\2\2\13C\3\2\2\2\rE\3\2\2\2\17K\3\2\2\2\21Q\3\2\2\2\23S\3\2"+
		"\2\2\25V\3\2\2\2\27[\3\2\2\2\31d\3\2\2\2\33f\3\2\2\2\35h\3\2\2\2\37n\3"+
		"\2\2\2!s\3\2\2\2#w\3\2\2\2%{\3\2\2\2\'\u0080\3\2\2\2)\u008c\3\2\2\2+\u0093"+
		"\3\2\2\2-\u009e\3\2\2\2/\u00a0\3\2\2\2\61\u00a2\3\2\2\2\63\u00a4\3\2\2"+
		"\2\65\u00ab\3\2\2\2\67\u00b6\3\2\2\29\u00bb\3\2\2\2;<\7*\2\2<\4\3\2\2"+
		"\2=>\7.\2\2>\6\3\2\2\2?@\7+\2\2@\b\3\2\2\2AB\7}\2\2B\n\3\2\2\2CD\7\177"+
		"\2\2D\f\3\2\2\2EF\7y\2\2FG\7j\2\2GH\7k\2\2HI\7n\2\2IJ\7g\2\2J\16\3\2\2"+
		"\2KL\7r\2\2LM\7t\2\2MN\7k\2\2NO\7p\2\2OP\7v\2\2P\20\3\2\2\2QR\7\60\2\2"+
		"R\22\3\2\2\2ST\7*\2\2TU\7+\2\2U\24\3\2\2\2VW\7e\2\2WX\7c\2\2XY\7n\2\2"+
		"YZ\7n\2\2Z\26\3\2\2\2[\\\7h\2\2\\]\7w\2\2]^\7p\2\2^_\7e\2\2_`\7v\2\2`"+
		"a\7k\2\2ab\7q\2\2bc\7p\2\2c\30\3\2\2\2de\7=\2\2e\32\3\2\2\2fg\7?\2\2g"+
		"\34\3\2\2\2hi\7U\2\2ij\7V\2\2jk\7C\2\2kl\7E\2\2lm\7M\2\2m\36\3\2\2\2n"+
		"o\7r\2\2op\7w\2\2pq\7u\2\2qr\7j\2\2r \3\2\2\2st\7r\2\2tu\7q\2\2uv\7r\2"+
		"\2v\"\3\2\2\2wx\7x\2\2xy\7c\2\2yz\7t\2\2z$\3\2\2\2{|\7g\2\2|}\7n\2\2}"+
		"~\7u\2\2~\177\7g\2\2\177&\3\2\2\2\u0080\u0081\7k\2\2\u0081\u0082\7h\2"+
		"\2\u0082(\3\2\2\2\u0083\u0084\7V\2\2\u0084\u0085\7T\2\2\u0085\u0086\7"+
		"W\2\2\u0086\u008d\7G\2\2\u0087\u0088\7H\2\2\u0088\u0089\7C\2\2\u0089\u008a"+
		"\7N\2\2\u008a\u008b\7U\2\2\u008b\u008d\7G\2\2\u008c\u0083\3\2\2\2\u008c"+
		"\u0087\3\2\2\2\u008d*\3\2\2\2\u008e\u008f\7c\2\2\u008f\u0090\7p\2\2\u0090"+
		"\u0094\7f\2\2\u0091\u0092\7q\2\2\u0092\u0094\7t\2\2\u0093\u008e\3\2\2"+
		"\2\u0093\u0091\3\2\2\2\u0094,\3\2\2\2\u0095\u0096\7?\2\2\u0096\u009f\7"+
		"?\2\2\u0097\u009f\t\2\2\2\u0098\u0099\7>\2\2\u0099\u009f\7?\2\2\u009a"+
		"\u009b\7@\2\2\u009b\u009f\7?\2\2\u009c\u009d\7#\2\2\u009d\u009f\7?\2\2"+
		"\u009e\u0095\3\2\2\2\u009e\u0097\3\2\2\2\u009e\u0098\3\2\2\2\u009e\u009a"+
		"\3\2\2\2\u009e\u009c\3\2\2\2\u009f.\3\2\2\2\u00a0\u00a1\t\3\2\2\u00a1"+
		"\60\3\2\2\2\u00a2\u00a3\t\4\2\2\u00a3\62\3\2\2\2\u00a4\u00a8\t\5\2\2\u00a5"+
		"\u00a7\t\6\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2"+
		"\2\2\u00a8\u00a9\3\2\2\2\u00a9\64\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac"+
		"\7$\2\2\u00ac\u00b0\t\7\2\2\u00ad\u00af\t\b\2\2\u00ae\u00ad\3\2\2\2\u00af"+
		"\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3\3\2"+
		"\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b4\7$\2\2\u00b4\66\3\2\2\2\u00b5\u00b7"+
		"\t\t\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8"+
		"\u00b9\3\2\2\2\u00b98\3\2\2\2\u00ba\u00bc\t\n\2\2\u00bb\u00ba\3\2\2\2"+
		"\u00bc\u00bd\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf"+
		"\3\2\2\2\u00bf\u00c0\b\35\2\2\u00c0:\3\2\2\2\n\2\u008c\u0093\u009e\u00a8"+
		"\u00b0\u00b8\u00bd\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}