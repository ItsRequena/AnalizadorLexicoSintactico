// Generated from C:/Users/danie/OneDrive - Universidad Rey Juan Carlos/Escritorio/AplicacionInformatica_Grupo09/src\gramatica.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, IDENTIFIER=42, NUMERIC_INTEGER_CONST=43, 
		NUMERIC_REAL_CONST=44, FIJO=45, EXPONENCIAL=46, MIXTO=47, STRING_CONST=48, 
		SIMPLE=49, DOBLE=50, COMENTARIO=51, CORCHETE=52, PARENTESIS_ASTERISCO=53, 
		WHITESPACE=54;
	public static final int
		RULE_axioma = 0, RULE_prg = 1, RULE_blq = 2, RULE_dcllist = 3, RULE_dcl = 4, 
		RULE_defcte = 5, RULE_ctelist = 6, RULE_ctelist1 = 7, RULE_simpvalue = 8, 
		RULE_defvar = 9, RULE_defvarlist = 10, RULE_defvarlist1 = 11, RULE_defproc = 12, 
		RULE_deffun = 13, RULE_formal_paramlist = 14, RULE_formal_param = 15, 
		RULE_varlist = 16, RULE_tbas = 17, RULE_sentlist = 18, RULE_sentlist1 = 19, 
		RULE_sent = 20, RULE_asig = 21, RULE_exp = 22, RULE_subpparamlist = 23, 
		RULE_explist = 24, RULE_proc_call = 25, RULE_factor = 26, RULE_op = 27, 
		RULE_inc = 28, RULE_expcond = 29, RULE_expcond1 = 30, RULE_oplog = 31, 
		RULE_factorcond = 32, RULE_opcomp = 33;
	private static String[] makeRuleNames() {
		return new String[] {
			"axioma", "prg", "blq", "dcllist", "dcl", "defcte", "ctelist", "ctelist1", 
			"simpvalue", "defvar", "defvarlist", "defvarlist1", "defproc", "deffun", 
			"formal_paramlist", "formal_param", "varlist", "tbas", "sentlist", "sentlist1", 
			"sent", "asig", "exp", "subpparamlist", "explist", "proc_call", "factor", 
			"op", "inc", "expcond", "expcond1", "oplog", "factorcond", "opcomp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'PROGRAM'", "';'", "'.'", "'BEGIN'", "'END'", "'CONST'", "'='", 
			"'VAR'", "':'", "'PROCEDURE'", "'FUNCTION'", "'('", "')'", "','", "'integer'", 
			"'real'", "'IF'", "'THEN'", "'ELSE'", "'WHILE'", "'DO'", "'REPEAT'", 
			"'UNTIL'", "'FOR'", "':='", "'+'", "'-'", "'*'", "'DIV'", "'MOD'", "'TO'", 
			"'DOWNTO'", "'OR'", "'AND'", "'NOT'", "'TRUE'", "'FALSE'", "'<'", "'>'", 
			"'<='", "'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "IDENTIFIER", "NUMERIC_INTEGER_CONST", 
			"NUMERIC_REAL_CONST", "FIJO", "EXPONENCIAL", "MIXTO", "STRING_CONST", 
			"SIMPLE", "DOBLE", "COMENTARIO", "CORCHETE", "PARENTESIS_ASTERISCO", 
			"WHITESPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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

	@Override
	public String getGrammarFileName() { return "gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    private Inicializar cabeceras;

	    private Inicializar func_proc;

	    private Inicializar prg_principal;

	    // Recibir como un parámetro del constructor el objeto real
	    public gramaticaParser ( TokenStream input, Inicializar theinfo )  {
	        this(input) ;
	        cabeceras = theinfo;
	        func_proc = theinfo;
	        prg_principal = theinfo;
	    }
	 
	public gramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class AxiomaContext extends ParserRuleContext {
		public PrgContext prg() {
			return getRuleContext(PrgContext.class,0);
		}
		public AxiomaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_axioma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterAxioma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitAxioma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitAxioma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AxiomaContext axioma() throws RecognitionException {
		AxiomaContext _localctx = new AxiomaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_axioma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			prg();
			cabeceras.ImprimeOperacion(); func_proc.ImprimeSubprograma(); prg_principal.ImprimePrograma();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrgContext extends ParserRuleContext {
		public BlqContext blq;
		public TerminalNode IDENTIFIER() { return getToken(gramaticaParser.IDENTIFIER, 0); }
		public BlqContext blq() {
			return getRuleContext(BlqContext.class,0);
		}
		public PrgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterPrg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitPrg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitPrg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrgContext prg() throws RecognitionException {
		PrgContext _localctx = new PrgContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_prg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T__0);
			setState(72);
			match(IDENTIFIER);
			setState(73);
			match(T__1);
			setState(74);
			((PrgContext)_localctx).blq = blq();
			 prg_principal.setString(((PrgContext)_localctx).blq.s + ". </div>");
			setState(76);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlqContext extends ParserRuleContext {
		public String s;
		public DcllistContext dcllist;
		public SentlistContext sentlist;
		public DcllistContext dcllist() {
			return getRuleContext(DcllistContext.class,0);
		}
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public BlqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterBlq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitBlq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitBlq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlqContext blq() throws RecognitionException {
		BlqContext _localctx = new BlqContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_blq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			((BlqContext)_localctx).dcllist = dcllist("");
			((BlqContext)_localctx).s =  ((BlqContext)_localctx).dcllist.s ;
			setState(80);
			match(T__3);
			prg_principal.incTab(); _localctx.s += "<div>" + cabeceras.getReservadas_init() + "BEGIN" + cabeceras.getReservadas_final() +"</div>";
			setState(82);
			((BlqContext)_localctx).sentlist = sentlist();
			_localctx.s += "<DIV style=\"text-indent:" + prg_principal.getContTab() +"cm\">"; _localctx.s += ((BlqContext)_localctx).sentlist.s; prg_principal.decTab();
			setState(84);
			match(T__4);
			_localctx.s += func_proc.getTabulacion_final(); _localctx.s += "<div>" + cabeceras.getReservadas_init() + "END" + cabeceras.getReservadas_final();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DcllistContext extends ParserRuleContext {
		public String h;
		public String s;
		public DclContext dcl;
		public DcllistContext dcllist;
		public DclContext dcl() {
			return getRuleContext(DclContext.class,0);
		}
		public DcllistContext dcllist() {
			return getRuleContext(DcllistContext.class,0);
		}
		public DcllistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DcllistContext(ParserRuleContext parent, int invokingState, String h) {
			super(parent, invokingState);
			this.h = h;
		}
		@Override public int getRuleIndex() { return RULE_dcllist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDcllist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDcllist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitDcllist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DcllistContext dcllist(String h) throws RecognitionException {
		DcllistContext _localctx = new DcllistContext(_ctx, getState(), h);
		enterRule(_localctx, 6, RULE_dcllist);
		try {
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__7:
			case T__9:
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				((DcllistContext)_localctx).dcl = dcl();
				_localctx.h += ((DcllistContext)_localctx).dcl.s ;
				setState(89);
				((DcllistContext)_localctx).dcllist = dcllist(_localctx.h);
				((DcllistContext)_localctx).s =  ((DcllistContext)_localctx).dcllist.s ;
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				((DcllistContext)_localctx).s =  _localctx.h ;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DclContext extends ParserRuleContext {
		public String s;
		public DefcteContext defcte;
		public DefvarContext defvar;
		public DefprocContext defproc;
		public DeffunContext deffun;
		public DefcteContext defcte() {
			return getRuleContext(DefcteContext.class,0);
		}
		public DefvarContext defvar() {
			return getRuleContext(DefvarContext.class,0);
		}
		public DefprocContext defproc() {
			return getRuleContext(DefprocContext.class,0);
		}
		public DeffunContext deffun() {
			return getRuleContext(DeffunContext.class,0);
		}
		public DclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitDcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DclContext dcl() throws RecognitionException {
		DclContext _localctx = new DclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_dcl);
		try {
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				((DclContext)_localctx).defcte = defcte();
				((DclContext)_localctx).s =  ((DclContext)_localctx).defcte.s;
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				((DclContext)_localctx).defvar = defvar();
				((DclContext)_localctx).s =  ((DclContext)_localctx).defvar.s;
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				((DclContext)_localctx).defproc = defproc();
				((DclContext)_localctx).s =  ((DclContext)_localctx).defproc.s;
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 4);
				{
				setState(104);
				((DclContext)_localctx).deffun = deffun();
				((DclContext)_localctx).s =  ((DclContext)_localctx).deffun.s ;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefcteContext extends ParserRuleContext {
		public String s;
		public CtelistContext ctelist;
		public CtelistContext ctelist() {
			return getRuleContext(CtelistContext.class,0);
		}
		public DefcteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defcte; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDefcte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDefcte(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitDefcte(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefcteContext defcte() throws RecognitionException {
		DefcteContext _localctx = new DefcteContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_defcte);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(T__5);
			((DefcteContext)_localctx).s =  "<div>" + cabeceras.getReservadas_init() + "CONST" + cabeceras.getReservadas_final() + "</div>";
			setState(111);
			((DefcteContext)_localctx).ctelist = ctelist();
			_localctx.s += "<DIV style=\"text-indent:1.25cm\">";_localctx.s += ((DefcteContext)_localctx).ctelist.s;_localctx.s += "</DIV>"; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CtelistContext extends ParserRuleContext {
		public String s;
		public Token IDENTIFIER;
		public SimpvalueContext simpvalue;
		public Ctelist1Context ctelist1;
		public TerminalNode IDENTIFIER() { return getToken(gramaticaParser.IDENTIFIER, 0); }
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public Ctelist1Context ctelist1() {
			return getRuleContext(Ctelist1Context.class,0);
		}
		public CtelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctelist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterCtelist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitCtelist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitCtelist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CtelistContext ctelist() throws RecognitionException {
		CtelistContext _localctx = new CtelistContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ctelist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			((CtelistContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			((CtelistContext)_localctx).s =  "<div>"+cabeceras.getIdentificadores_init() + (((CtelistContext)_localctx).IDENTIFIER!=null?((CtelistContext)_localctx).IDENTIFIER.getText():null) + cabeceras.getIdentificadores_final();
			setState(116);
			match(T__6);
			_localctx.s += '=';
			setState(118);
			((CtelistContext)_localctx).simpvalue = simpvalue();
			_localctx.s += ((CtelistContext)_localctx).simpvalue.s ;
			setState(120);
			match(T__1);
			_localctx.s += "; </div>";
			setState(122);
			((CtelistContext)_localctx).ctelist1 = ctelist1("");
			_localctx.s +=  ((CtelistContext)_localctx).ctelist1.s;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ctelist1Context extends ParserRuleContext {
		public String h;
		public String s;
		public Token IDENTIFIER;
		public SimpvalueContext simpvalue;
		public Ctelist1Context ctelist1;
		public TerminalNode IDENTIFIER() { return getToken(gramaticaParser.IDENTIFIER, 0); }
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public Ctelist1Context ctelist1() {
			return getRuleContext(Ctelist1Context.class,0);
		}
		public Ctelist1Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Ctelist1Context(ParserRuleContext parent, int invokingState, String h) {
			super(parent, invokingState);
			this.h = h;
		}
		@Override public int getRuleIndex() { return RULE_ctelist1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterCtelist1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitCtelist1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitCtelist1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ctelist1Context ctelist1(String h) throws RecognitionException {
		Ctelist1Context _localctx = new Ctelist1Context(_ctx, getState(), h);
		enterRule(_localctx, 14, RULE_ctelist1);
		try {
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				((Ctelist1Context)_localctx).IDENTIFIER = match(IDENTIFIER);
				_localctx.h += "<div>" + cabeceras.getIdentificadores_init() + (((Ctelist1Context)_localctx).IDENTIFIER!=null?((Ctelist1Context)_localctx).IDENTIFIER.getText():null) + cabeceras.getIdentificadores_final();
				setState(127);
				match(T__6);
				_localctx.h += '=';
				setState(129);
				((Ctelist1Context)_localctx).simpvalue = simpvalue();
				_localctx.h += ((Ctelist1Context)_localctx).simpvalue.s ;
				setState(131);
				match(T__1);
				_localctx.h += "; </div>";
				setState(133);
				((Ctelist1Context)_localctx).ctelist1 = ctelist1(_localctx.h);
				((Ctelist1Context)_localctx).s =  ((Ctelist1Context)_localctx).ctelist1.s ;
				}
				break;
			case T__3:
			case T__5:
			case T__7:
			case T__9:
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				((Ctelist1Context)_localctx).s =  _localctx.h;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpvalueContext extends ParserRuleContext {
		public String s;
		public Token NUMERIC_INTEGER_CONST;
		public Token NUMERIC_REAL_CONST;
		public Token STRING_CONST;
		public TerminalNode NUMERIC_INTEGER_CONST() { return getToken(gramaticaParser.NUMERIC_INTEGER_CONST, 0); }
		public TerminalNode NUMERIC_REAL_CONST() { return getToken(gramaticaParser.NUMERIC_REAL_CONST, 0); }
		public TerminalNode STRING_CONST() { return getToken(gramaticaParser.STRING_CONST, 0); }
		public SimpvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterSimpvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitSimpvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitSimpvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpvalueContext simpvalue() throws RecognitionException {
		SimpvalueContext _localctx = new SimpvalueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_simpvalue);
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_INTEGER_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				((SimpvalueContext)_localctx).NUMERIC_INTEGER_CONST = match(NUMERIC_INTEGER_CONST);
				((SimpvalueContext)_localctx).s =  cabeceras.getCons_init() + (((SimpvalueContext)_localctx).NUMERIC_INTEGER_CONST!=null?((SimpvalueContext)_localctx).NUMERIC_INTEGER_CONST.getText():null) + cabeceras.getCons_final();
				}
				break;
			case NUMERIC_REAL_CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				((SimpvalueContext)_localctx).NUMERIC_REAL_CONST = match(NUMERIC_REAL_CONST);
				((SimpvalueContext)_localctx).s =  cabeceras.getCons_init() + (((SimpvalueContext)_localctx).NUMERIC_REAL_CONST!=null?((SimpvalueContext)_localctx).NUMERIC_REAL_CONST.getText():null) + cabeceras.getCons_final();
				}
				break;
			case STRING_CONST:
				enterOuterAlt(_localctx, 3);
				{
				setState(143);
				((SimpvalueContext)_localctx).STRING_CONST = match(STRING_CONST);
				((SimpvalueContext)_localctx).s =  cabeceras.getCons_init() + (((SimpvalueContext)_localctx).STRING_CONST!=null?((SimpvalueContext)_localctx).STRING_CONST.getText():null) + cabeceras.getCons_final();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefvarContext extends ParserRuleContext {
		public String s;
		public DefvarlistContext defvarlist;
		public DefvarlistContext defvarlist() {
			return getRuleContext(DefvarlistContext.class,0);
		}
		public DefvarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defvar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDefvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDefvar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitDefvar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefvarContext defvar() throws RecognitionException {
		DefvarContext _localctx = new DefvarContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_defvar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(T__7);
			((DefvarContext)_localctx).s =  "<div>"+cabeceras.getReservadas_init() + "VAR" + cabeceras.getReservadas_final() + "</div>";
			setState(149);
			((DefvarContext)_localctx).defvarlist = defvarlist("");
			_localctx.s += "<DIV style=\"text-indent:1.25cm\">"; _localctx.s += ((DefvarContext)_localctx).defvarlist.s;
			setState(151);
			match(T__1);
			_localctx.s += "; </div>";_localctx.s += "</DIV>"; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefvarlistContext extends ParserRuleContext {
		public String h;
		public String s;
		public VarlistContext varlist;
		public TbasContext tbas;
		public Defvarlist1Context defvarlist1;
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public TbasContext tbas() {
			return getRuleContext(TbasContext.class,0);
		}
		public Defvarlist1Context defvarlist1() {
			return getRuleContext(Defvarlist1Context.class,0);
		}
		public DefvarlistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DefvarlistContext(ParserRuleContext parent, int invokingState, String h) {
			super(parent, invokingState);
			this.h = h;
		}
		@Override public int getRuleIndex() { return RULE_defvarlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDefvarlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDefvarlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitDefvarlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefvarlistContext defvarlist(String h) throws RecognitionException {
		DefvarlistContext _localctx = new DefvarlistContext(_ctx, getState(), h);
		enterRule(_localctx, 20, RULE_defvarlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			((DefvarlistContext)_localctx).varlist = varlist();
			((DefvarlistContext)_localctx).h =  "<div>"+((DefvarlistContext)_localctx).varlist.s;
			setState(156);
			match(T__8);
			_localctx.h += ':';
			setState(158);
			((DefvarlistContext)_localctx).tbas = tbas();
			_localctx.h += ((DefvarlistContext)_localctx).tbas.s;
			setState(160);
			((DefvarlistContext)_localctx).defvarlist1 = defvarlist1(_localctx.h);
			((DefvarlistContext)_localctx).s =  ((DefvarlistContext)_localctx).defvarlist1.s ;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Defvarlist1Context extends ParserRuleContext {
		public String h;
		public String s;
		public VarlistContext varlist;
		public TbasContext tbas;
		public Defvarlist1Context defvarlist1;
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public TbasContext tbas() {
			return getRuleContext(TbasContext.class,0);
		}
		public Defvarlist1Context defvarlist1() {
			return getRuleContext(Defvarlist1Context.class,0);
		}
		public Defvarlist1Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Defvarlist1Context(ParserRuleContext parent, int invokingState, String h) {
			super(parent, invokingState);
			this.h = h;
		}
		@Override public int getRuleIndex() { return RULE_defvarlist1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDefvarlist1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDefvarlist1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitDefvarlist1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Defvarlist1Context defvarlist1(String h) throws RecognitionException {
		Defvarlist1Context _localctx = new Defvarlist1Context(_ctx, getState(), h);
		enterRule(_localctx, 22, RULE_defvarlist1);
		try {
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				match(T__1);
				_localctx.h += "; </div>";
				setState(165);
				((Defvarlist1Context)_localctx).varlist = varlist();
				_localctx.h += "<div>"+ ((Defvarlist1Context)_localctx).varlist.s;
				setState(167);
				match(T__8);
				_localctx.h += ':';
				setState(169);
				((Defvarlist1Context)_localctx).tbas = tbas();
				_localctx.h += ((Defvarlist1Context)_localctx).tbas.s;
				setState(171);
				((Defvarlist1Context)_localctx).defvarlist1 = defvarlist1(_localctx.h);
				((Defvarlist1Context)_localctx).s =  ((Defvarlist1Context)_localctx).defvarlist1.s ;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				((Defvarlist1Context)_localctx).s =  _localctx.h;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefprocContext extends ParserRuleContext {
		public String s;
		public Token IDENTIFIER;
		public Formal_paramlistContext formal_paramlist;
		public BlqContext blq;
		public TerminalNode IDENTIFIER() { return getToken(gramaticaParser.IDENTIFIER, 0); }
		public Formal_paramlistContext formal_paramlist() {
			return getRuleContext(Formal_paramlistContext.class,0);
		}
		public BlqContext blq() {
			return getRuleContext(BlqContext.class,0);
		}
		public DefprocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defproc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDefproc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDefproc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitDefproc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefprocContext defproc() throws RecognitionException {
		DefprocContext _localctx = new DefprocContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_defproc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			String cabecera_p ="";
			setState(178);
			match(T__9);
			((DefprocContext)_localctx).s =  "<div>" + cabeceras.getReservadas_init() + "PROCEDURE " + cabeceras.getReservadas_final();
			setState(180);
			((DefprocContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			_localctx.s += cabeceras.getIdentificadores_init() + (((DefprocContext)_localctx).IDENTIFIER!=null?((DefprocContext)_localctx).IDENTIFIER.getText():null) + cabeceras.getIdentificadores_final(); cabecera_p =cabeceras.getIdentificadores_init() + (((DefprocContext)_localctx).IDENTIFIER!=null?((DefprocContext)_localctx).IDENTIFIER.getText():null) + cabeceras.getIdentificadores_final();
			setState(182);
			((DefprocContext)_localctx).formal_paramlist = formal_paramlist();
			_localctx.s +=((DefprocContext)_localctx).formal_paramlist.s; cabecera_p+=((DefprocContext)_localctx).formal_paramlist.s;
			setState(184);
			match(T__1);
			cabecera_p +=";"; _localctx.s += "; </div>";
			cabeceras.add(cabecera_p);
			setState(187);
			((DefprocContext)_localctx).blq = blq();
			_localctx.s += ((DefprocContext)_localctx).blq.s ;
			setState(189);
			match(T__1);
			_localctx.s += "; </div>"; func_proc.fullAdd(_localctx.s);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeffunContext extends ParserRuleContext {
		public String s;
		public Token IDENTIFIER;
		public Formal_paramlistContext formal_paramlist;
		public TbasContext tbas;
		public BlqContext blq;
		public TerminalNode IDENTIFIER() { return getToken(gramaticaParser.IDENTIFIER, 0); }
		public Formal_paramlistContext formal_paramlist() {
			return getRuleContext(Formal_paramlistContext.class,0);
		}
		public TbasContext tbas() {
			return getRuleContext(TbasContext.class,0);
		}
		public BlqContext blq() {
			return getRuleContext(BlqContext.class,0);
		}
		public DeffunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deffun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDeffun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDeffun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitDeffun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeffunContext deffun() throws RecognitionException {
		DeffunContext _localctx = new DeffunContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_deffun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			String cabecera_f =" ";
			setState(193);
			match(T__10);
			((DeffunContext)_localctx).s =  "<div>" + cabeceras.getReservadas_init() + "FUNCTION " + cabeceras.getReservadas_final();
			setState(195);
			((DeffunContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			_localctx.s += cabeceras.getIdentificadores_init() + (((DeffunContext)_localctx).IDENTIFIER!=null?((DeffunContext)_localctx).IDENTIFIER.getText():null) + cabeceras.getIdentificadores_final(); cabecera_f =cabeceras.getIdentificadores_init() + (((DeffunContext)_localctx).IDENTIFIER!=null?((DeffunContext)_localctx).IDENTIFIER.getText():null) + cabeceras.getIdentificadores_final();
			setState(197);
			((DeffunContext)_localctx).formal_paramlist = formal_paramlist();
			_localctx.s +=((DeffunContext)_localctx).formal_paramlist.s; cabecera_f+=((DeffunContext)_localctx).formal_paramlist.s;
			setState(199);
			match(T__8);
			cabecera_f +=";"; _localctx.s += ":";
			setState(201);
			((DeffunContext)_localctx).tbas = tbas();
			_localctx.s += ((DeffunContext)_localctx).tbas.s;
			setState(203);
			match(T__1);
			_localctx.s += "; </div>";
			String tipo=((DeffunContext)_localctx).tbas.s+" " ;cabeceras.add(tipo + cabecera_f);
			setState(206);
			((DeffunContext)_localctx).blq = blq();
			_localctx.s += ((DeffunContext)_localctx).blq.s ;
			setState(208);
			match(T__1);
			_localctx.s += "; </div>"; func_proc.fullAdd(_localctx.s);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Formal_paramlistContext extends ParserRuleContext {
		public String s;
		public Formal_paramContext formal_param;
		public Formal_paramContext formal_param() {
			return getRuleContext(Formal_paramContext.class,0);
		}
		public Formal_paramlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_paramlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterFormal_paramlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitFormal_paramlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitFormal_paramlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Formal_paramlistContext formal_paramlist() throws RecognitionException {
		Formal_paramlistContext _localctx = new Formal_paramlistContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_formal_paramlist);
		try {
			setState(219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				match(T__11);
				((Formal_paramlistContext)_localctx).s =  "(";
				setState(213);
				((Formal_paramlistContext)_localctx).formal_param = formal_param();
				_localctx.s += ((Formal_paramlistContext)_localctx).formal_param.s;
				setState(215);
				match(T__12);
				_localctx.s += ")";
				}
				break;
			case T__1:
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				 ((Formal_paramlistContext)_localctx).s =  "";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Formal_paramContext extends ParserRuleContext {
		public String s;
		public VarlistContext varlist;
		public TbasContext tbas;
		public Formal_paramContext formal_param;
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public TbasContext tbas() {
			return getRuleContext(TbasContext.class,0);
		}
		public Formal_paramContext formal_param() {
			return getRuleContext(Formal_paramContext.class,0);
		}
		public Formal_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterFormal_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitFormal_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitFormal_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Formal_paramContext formal_param() throws RecognitionException {
		Formal_paramContext _localctx = new Formal_paramContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_formal_param);
		try {
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				((Formal_paramContext)_localctx).varlist = varlist();
				((Formal_paramContext)_localctx).s =  ((Formal_paramContext)_localctx).varlist.s;
				setState(223);
				match(T__8);
				_localctx.s += ':';
				setState(225);
				((Formal_paramContext)_localctx).tbas = tbas();
				_localctx.s += ((Formal_paramContext)_localctx).tbas.s;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				((Formal_paramContext)_localctx).varlist = varlist();
				((Formal_paramContext)_localctx).s =  ((Formal_paramContext)_localctx).varlist.s;
				setState(230);
				match(T__8);
				_localctx.s += ':';
				setState(232);
				((Formal_paramContext)_localctx).tbas = tbas();
				_localctx.s += ((Formal_paramContext)_localctx).tbas.s;
				setState(234);
				match(T__1);
				_localctx.s += ";";
				setState(236);
				((Formal_paramContext)_localctx).formal_param = formal_param();
				_localctx.s += ((Formal_paramContext)_localctx).formal_param.s;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarlistContext extends ParserRuleContext {
		public String s;
		public Token IDENTIFIER;
		public VarlistContext varlist;
		public TerminalNode IDENTIFIER() { return getToken(gramaticaParser.IDENTIFIER, 0); }
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public VarlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterVarlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitVarlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitVarlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarlistContext varlist() throws RecognitionException {
		VarlistContext _localctx = new VarlistContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_varlist);
		try {
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				((VarlistContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				((VarlistContext)_localctx).s =  cabeceras.getIdentificadores_init() + (((VarlistContext)_localctx).IDENTIFIER!=null?((VarlistContext)_localctx).IDENTIFIER.getText():null) + cabeceras.getIdentificadores_final();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				((VarlistContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				((VarlistContext)_localctx).s =  cabeceras.getIdentificadores_init() + (((VarlistContext)_localctx).IDENTIFIER!=null?((VarlistContext)_localctx).IDENTIFIER.getText():null) + cabeceras.getIdentificadores_final();
				setState(245);
				match(T__13);
				_localctx.s += ',';
				setState(247);
				((VarlistContext)_localctx).varlist = varlist();
				_localctx.s += ((VarlistContext)_localctx).varlist.s;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TbasContext extends ParserRuleContext {
		public String s;
		public TbasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tbas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterTbas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitTbas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitTbas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TbasContext tbas() throws RecognitionException {
		TbasContext _localctx = new TbasContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_tbas);
		try {
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				match(T__14);
				((TbasContext)_localctx).s =  "integer";
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				match(T__15);
				((TbasContext)_localctx).s =  "real";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SentlistContext extends ParserRuleContext {
		public String s;
		public SentContext sent;
		public Sentlist1Context sentlist1;
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public Sentlist1Context sentlist1() {
			return getRuleContext(Sentlist1Context.class,0);
		}
		public SentlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterSentlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitSentlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitSentlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentlistContext sentlist() throws RecognitionException {
		SentlistContext _localctx = new SentlistContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_sentlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			((SentlistContext)_localctx).sent = sent();
			((SentlistContext)_localctx).s =  ((SentlistContext)_localctx).sent.s ;
			setState(260);
			((SentlistContext)_localctx).sentlist1 = sentlist1("");
			_localctx.s += ((SentlistContext)_localctx).sentlist1.s;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sentlist1Context extends ParserRuleContext {
		public String h;
		public String s;
		public SentContext sent;
		public Sentlist1Context sentlist1;
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public Sentlist1Context sentlist1() {
			return getRuleContext(Sentlist1Context.class,0);
		}
		public Sentlist1Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Sentlist1Context(ParserRuleContext parent, int invokingState, String h) {
			super(parent, invokingState);
			this.h = h;
		}
		@Override public int getRuleIndex() { return RULE_sentlist1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterSentlist1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitSentlist1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitSentlist1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sentlist1Context sentlist1(String h) throws RecognitionException {
		Sentlist1Context _localctx = new Sentlist1Context(_ctx, getState(), h);
		enterRule(_localctx, 38, RULE_sentlist1);
		try {
			setState(269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
			case T__19:
			case T__21:
			case T__23:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				((Sentlist1Context)_localctx).sent = sent();
				_localctx.h += ((Sentlist1Context)_localctx).sent.s; 
				setState(265);
				((Sentlist1Context)_localctx).sentlist1 = sentlist1(_localctx.h);
				((Sentlist1Context)_localctx).s =  ((Sentlist1Context)_localctx).sentlist1.s ;
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				((Sentlist1Context)_localctx).s =  _localctx.h ;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SentContext extends ParserRuleContext {
		public String s;
		public AsigContext asig;
		public Proc_callContext proc_call;
		public ExpcondContext expcond;
		public BlqContext blq;
		public Token IDENTIFIER;
		public ExpContext exp;
		public IncContext inc;
		public AsigContext asig() {
			return getRuleContext(AsigContext.class,0);
		}
		public Proc_callContext proc_call() {
			return getRuleContext(Proc_callContext.class,0);
		}
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public List<BlqContext> blq() {
			return getRuleContexts(BlqContext.class);
		}
		public BlqContext blq(int i) {
			return getRuleContext(BlqContext.class,i);
		}
		public TerminalNode IDENTIFIER() { return getToken(gramaticaParser.IDENTIFIER, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public IncContext inc() {
			return getRuleContext(IncContext.class,0);
		}
		public SentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterSent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitSent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitSent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentContext sent() throws RecognitionException {
		SentContext _localctx = new SentContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_sent);
		try {
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				((SentContext)_localctx).asig = asig();
				((SentContext)_localctx).s =  "<div>"+((SentContext)_localctx).asig.s ;
				setState(273);
				match(T__1);
				_localctx.s += ";</div>" ;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				((SentContext)_localctx).proc_call = proc_call();
				((SentContext)_localctx).s =  "<div>"+((SentContext)_localctx).proc_call.s ;
				setState(278);
				match(T__1);
				_localctx.s += ";</div>" ;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(281);
				match(T__16);
				((SentContext)_localctx).s =  "<div>" + cabeceras.getReservadas_init() + "IF " + cabeceras.getReservadas_final();
				setState(283);
				((SentContext)_localctx).expcond = expcond();
				_localctx.s += ((SentContext)_localctx).expcond.s;
				setState(285);
				match(T__17);
				_localctx.s += cabeceras.getReservadas_init() + "THEN " + cabeceras.getReservadas_final() + "</div>" /* "</br>" */;
				setState(287);
				((SentContext)_localctx).blq = blq();
				 _localctx.s += ((SentContext)_localctx).blq.s ; _localctx.s += "</div>";
				setState(289);
				match(T__18);
				_localctx.s +="<div>" + cabeceras.getReservadas_init() + "ELSE " + cabeceras.getReservadas_final() + "</div>";
				setState(291);
				((SentContext)_localctx).blq = blq();
				_localctx.s += ((SentContext)_localctx).blq.s + "</div>";
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(294);
				match(T__19);
				((SentContext)_localctx).s =  "<div>" + cabeceras.getReservadas_init() + "WHILE " + cabeceras.getReservadas_final();
				setState(296);
				((SentContext)_localctx).expcond = expcond();
				((SentContext)_localctx).s =  ((SentContext)_localctx).expcond.s;
				setState(298);
				match(T__20);
				_localctx.s += cabeceras.getReservadas_init() + " DO " + cabeceras.getReservadas_final() + "</div>";
				setState(300);
				((SentContext)_localctx).blq = blq();
				_localctx.s += ((SentContext)_localctx).blq.s + "</div>";
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(303);
				match(T__21);
				((SentContext)_localctx).s =  "<div>"+ cabeceras.getReservadas_init() + "REPEAT " + cabeceras.getReservadas_final() + "</div>";
				setState(305);
				((SentContext)_localctx).blq = blq();
				_localctx.s += ((SentContext)_localctx).blq.s + "</div>";
				setState(307);
				match(T__22);
				_localctx.s += "<div>" + cabeceras.getReservadas_init() + "UNTIL " + cabeceras.getReservadas_final();
				setState(309);
				((SentContext)_localctx).expcond = expcond();
				_localctx.s += ((SentContext)_localctx).expcond.s;
				setState(311);
				match(T__1);
				_localctx.s += "; </div>";
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(314);
				match(T__23);
				((SentContext)_localctx).s =  "<div>" + cabeceras.getReservadas_init() + "FOR " + cabeceras.getReservadas_final();
				setState(316);
				((SentContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				_localctx.s += cabeceras.getIdentificadores_init() + (((SentContext)_localctx).IDENTIFIER!=null?((SentContext)_localctx).IDENTIFIER.getText():null) + cabeceras.getIdentificadores_final();
				setState(318);
				match(T__24);
				_localctx.s += ":=";
				setState(320);
				((SentContext)_localctx).exp = exp("");
				_localctx.s += ((SentContext)_localctx).exp.s ;
				setState(322);
				((SentContext)_localctx).inc = inc();
				_localctx.s += ((SentContext)_localctx).inc.s ;
				setState(324);
				((SentContext)_localctx).exp = exp("");
				_localctx.s += ((SentContext)_localctx).exp.s ;
				setState(326);
				match(T__20);
				_localctx.s += cabeceras.getReservadas_init() + " DO " + cabeceras.getReservadas_final() + "</div>";
				setState(328);
				((SentContext)_localctx).blq = blq();
				_localctx.s += ((SentContext)_localctx).blq.s + "</div>" ;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsigContext extends ParserRuleContext {
		public String s;
		public Token IDENTIFIER;
		public ExpContext exp;
		public TerminalNode IDENTIFIER() { return getToken(gramaticaParser.IDENTIFIER, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AsigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterAsig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitAsig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitAsig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsigContext asig() throws RecognitionException {
		AsigContext _localctx = new AsigContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_asig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			((AsigContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			((AsigContext)_localctx).s =  cabeceras.getIdentificadores_init() + (((AsigContext)_localctx).IDENTIFIER!=null?((AsigContext)_localctx).IDENTIFIER.getText():null) + cabeceras.getIdentificadores_final();
			setState(335);
			match(T__24);
			_localctx.s += ":=" ;
			setState(337);
			((AsigContext)_localctx).exp = exp("");
			_localctx.s += ((AsigContext)_localctx).exp.s;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpContext extends ParserRuleContext {
		public String h;
		public String s;
		public FactorContext factor;
		public OpContext op;
		public ExpContext exp;
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpContext(ParserRuleContext parent, int invokingState, String h) {
			super(parent, invokingState);
			this.h = h;
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp(String h) throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState(), h);
		enterRule(_localctx, 44, RULE_exp);
		try {
			setState(350);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(340);
				((ExpContext)_localctx).factor = factor();
				((ExpContext)_localctx).h =  ((ExpContext)_localctx).factor.s;
				setState(342);
				((ExpContext)_localctx).op = op();
				_localctx.h += ((ExpContext)_localctx).op.s;
				setState(344);
				((ExpContext)_localctx).exp = exp(_localctx.h);
				((ExpContext)_localctx).s =  ((ExpContext)_localctx).exp.s;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				((ExpContext)_localctx).factor = factor();
				((ExpContext)_localctx).s =  _localctx.h + ((ExpContext)_localctx).factor.s;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubpparamlistContext extends ParserRuleContext {
		public String h;
		public String s;
		public ExplistContext explist;
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public SubpparamlistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public SubpparamlistContext(ParserRuleContext parent, int invokingState, String h) {
			super(parent, invokingState);
			this.h = h;
		}
		@Override public int getRuleIndex() { return RULE_subpparamlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterSubpparamlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitSubpparamlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitSubpparamlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubpparamlistContext subpparamlist(String h) throws RecognitionException {
		SubpparamlistContext _localctx = new SubpparamlistContext(_ctx, getState(), h);
		enterRule(_localctx, 46, RULE_subpparamlist);
		try {
			setState(360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				match(T__11);
				((SubpparamlistContext)_localctx).s =  "(";
				setState(354);
				((SubpparamlistContext)_localctx).explist = explist();
				_localctx.s += ((SubpparamlistContext)_localctx).explist.s;
				setState(356);
				match(T__12);
				_localctx.s += ')';
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				((SubpparamlistContext)_localctx).s =  _localctx.h;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplistContext extends ParserRuleContext {
		public String s;
		public ExpContext exp;
		public ExplistContext explist;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public ExplistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterExplist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitExplist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitExplist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplistContext explist() throws RecognitionException {
		ExplistContext _localctx = new ExplistContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_explist);
		try {
			setState(372);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				((ExplistContext)_localctx).exp = exp("");
				((ExplistContext)_localctx).s =  ((ExplistContext)_localctx).exp.s ;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(365);
				((ExplistContext)_localctx).exp = exp("");
				((ExplistContext)_localctx).s =  ((ExplistContext)_localctx).exp.s ;
				setState(367);
				match(T__13);
				_localctx.s += ',' ;
				setState(369);
				((ExplistContext)_localctx).explist = explist();
				_localctx.s += ((ExplistContext)_localctx).explist.s ;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Proc_callContext extends ParserRuleContext {
		public String s;
		public Token IDENTIFIER;
		public SubpparamlistContext subpparamlist;
		public TerminalNode IDENTIFIER() { return getToken(gramaticaParser.IDENTIFIER, 0); }
		public SubpparamlistContext subpparamlist() {
			return getRuleContext(SubpparamlistContext.class,0);
		}
		public Proc_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterProc_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitProc_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitProc_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Proc_callContext proc_call() throws RecognitionException {
		Proc_callContext _localctx = new Proc_callContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_proc_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			((Proc_callContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			((Proc_callContext)_localctx).s =  cabeceras.getIdentificadores_init() + (((Proc_callContext)_localctx).IDENTIFIER!=null?((Proc_callContext)_localctx).IDENTIFIER.getText():null) + cabeceras.getIdentificadores_final();
			setState(376);
			((Proc_callContext)_localctx).subpparamlist = subpparamlist("");
			_localctx.s += ((Proc_callContext)_localctx).subpparamlist.s;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public String s;
		public SimpvalueContext simpvalue;
		public ExpContext exp;
		public Token IDENTIFIER;
		public SubpparamlistContext subpparamlist;
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(gramaticaParser.IDENTIFIER, 0); }
		public SubpparamlistContext subpparamlist() {
			return getRuleContext(SubpparamlistContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_factor);
		try {
			setState(394);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_INTEGER_CONST:
			case NUMERIC_REAL_CONST:
			case STRING_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(379);
				((FactorContext)_localctx).simpvalue = simpvalue();
				 ((FactorContext)_localctx).s =  ((FactorContext)_localctx).simpvalue.s ;
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(382);
				match(T__11);
				 ((FactorContext)_localctx).s =  "(" ;
				setState(384);
				((FactorContext)_localctx).exp = exp("");
				 _localctx.s += ((FactorContext)_localctx).exp.s ;
				setState(386);
				match(T__12);
				 _localctx.s += ')' ;
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(389);
				((FactorContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				((FactorContext)_localctx).s =  cabeceras.getIdentificadores_init() + (((FactorContext)_localctx).IDENTIFIER!=null?((FactorContext)_localctx).IDENTIFIER.getText():null) + cabeceras.getIdentificadores_final();
				setState(391);
				((FactorContext)_localctx).subpparamlist = subpparamlist("");
				_localctx.s += ((FactorContext)_localctx).subpparamlist.s;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpContext extends ParserRuleContext {
		public String s;
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_op);
		try {
			setState(406);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(396);
				match(T__25);
				((OpContext)_localctx).s =  " + ";
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(398);
				match(T__26);
				((OpContext)_localctx).s =  " - ";
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 3);
				{
				setState(400);
				match(T__27);
				((OpContext)_localctx).s =  " * ";
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 4);
				{
				setState(402);
				match(T__28);
				((OpContext)_localctx).s =  " DIV ";
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 5);
				{
				setState(404);
				match(T__29);
				((OpContext)_localctx).s =  " MOD ";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IncContext extends ParserRuleContext {
		public String s;
		public IncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterInc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitInc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitInc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncContext inc() throws RecognitionException {
		IncContext _localctx = new IncContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_inc);
		try {
			setState(412);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(408);
				match(T__30);
				((IncContext)_localctx).s =  " TO ";
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				setState(410);
				match(T__31);
				((IncContext)_localctx).s =  " DOWNTO ";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpcondContext extends ParserRuleContext {
		public String s;
		public FactorcondContext factorcond;
		public Expcond1Context expcond1;
		public FactorcondContext factorcond() {
			return getRuleContext(FactorcondContext.class,0);
		}
		public Expcond1Context expcond1() {
			return getRuleContext(Expcond1Context.class,0);
		}
		public ExpcondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expcond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterExpcond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitExpcond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitExpcond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpcondContext expcond() throws RecognitionException {
		ExpcondContext _localctx = new ExpcondContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_expcond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			((ExpcondContext)_localctx).factorcond = factorcond("");
			((ExpcondContext)_localctx).s =  ((ExpcondContext)_localctx).factorcond.s;
			setState(416);
			((ExpcondContext)_localctx).expcond1 = expcond1("");
			_localctx.s += ((ExpcondContext)_localctx).expcond1.s ;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expcond1Context extends ParserRuleContext {
		public String h;
		public String s;
		public FactorcondContext factorcond;
		public OplogContext oplog;
		public Expcond1Context expcond1;
		public FactorcondContext factorcond() {
			return getRuleContext(FactorcondContext.class,0);
		}
		public OplogContext oplog() {
			return getRuleContext(OplogContext.class,0);
		}
		public Expcond1Context expcond1() {
			return getRuleContext(Expcond1Context.class,0);
		}
		public Expcond1Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Expcond1Context(ParserRuleContext parent, int invokingState, String h) {
			super(parent, invokingState);
			this.h = h;
		}
		@Override public int getRuleIndex() { return RULE_expcond1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterExpcond1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitExpcond1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitExpcond1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expcond1Context expcond1(String h) throws RecognitionException {
		Expcond1Context _localctx = new Expcond1Context(_ctx, getState(), h);
		enterRule(_localctx, 60, RULE_expcond1);
		try {
			setState(428);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case T__34:
			case T__35:
			case T__36:
			case IDENTIFIER:
			case NUMERIC_INTEGER_CONST:
			case NUMERIC_REAL_CONST:
			case STRING_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(419);
				((Expcond1Context)_localctx).factorcond = factorcond("");
				((Expcond1Context)_localctx).s =  _localctx.h + ((Expcond1Context)_localctx).factorcond.s ;
				}
				break;
			case T__32:
			case T__33:
				enterOuterAlt(_localctx, 2);
				{
				setState(422);
				((Expcond1Context)_localctx).oplog = oplog();
				_localctx.h += ((Expcond1Context)_localctx).oplog.s ;
				setState(424);
				((Expcond1Context)_localctx).expcond1 = expcond1(_localctx.h);
				((Expcond1Context)_localctx).s =  ((Expcond1Context)_localctx).expcond1.s ;
				}
				break;
			case T__1:
			case T__12:
			case T__17:
			case T__20:
				enterOuterAlt(_localctx, 3);
				{
				((Expcond1Context)_localctx).s =  _localctx.h ;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OplogContext extends ParserRuleContext {
		public String s;
		public OplogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oplog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterOplog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitOplog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitOplog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OplogContext oplog() throws RecognitionException {
		OplogContext _localctx = new OplogContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_oplog);
		try {
			setState(434);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(430);
				match(T__32);
				((OplogContext)_localctx).s =  "OR" ;
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 2);
				{
				setState(432);
				match(T__33);
				((OplogContext)_localctx).s =  "AND" ;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorcondContext extends ParserRuleContext {
		public String h;
		public String s;
		public ExpContext exp;
		public OpcompContext opcomp;
		public ExpcondContext expcond;
		public FactorcondContext factorcond;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OpcompContext opcomp() {
			return getRuleContext(OpcompContext.class,0);
		}
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public FactorcondContext factorcond() {
			return getRuleContext(FactorcondContext.class,0);
		}
		public FactorcondContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public FactorcondContext(ParserRuleContext parent, int invokingState, String h) {
			super(parent, invokingState);
			this.h = h;
		}
		@Override public int getRuleIndex() { return RULE_factorcond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterFactorcond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitFactorcond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitFactorcond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorcondContext factorcond(String h) throws RecognitionException {
		FactorcondContext _localctx = new FactorcondContext(_ctx, getState(), h);
		enterRule(_localctx, 64, RULE_factorcond);
		try {
			setState(460);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				((FactorcondContext)_localctx).s =  _localctx.h;
				setState(437);
				((FactorcondContext)_localctx).exp = exp("");
				_localctx.s += ((FactorcondContext)_localctx).exp.s;
				setState(439);
				((FactorcondContext)_localctx).opcomp = opcomp();
				_localctx.s += ((FactorcondContext)_localctx).opcomp.s;
				setState(441);
				((FactorcondContext)_localctx).exp = exp("");
				_localctx.s += ((FactorcondContext)_localctx).exp.s;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(444);
				match(T__11);
				((FactorcondContext)_localctx).s =  _localctx.h; _localctx.s += "(";
				setState(446);
				((FactorcondContext)_localctx).expcond = expcond();
				_localctx.s += ((FactorcondContext)_localctx).expcond.s;
				setState(448);
				match(T__12);
				_localctx.s += ')';
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(451);
				match(T__34);
				_localctx.h += "NOT";
				setState(453);
				((FactorcondContext)_localctx).factorcond = factorcond(_localctx.h);
				((FactorcondContext)_localctx).s =  ((FactorcondContext)_localctx).factorcond.s ;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(456);
				match(T__35);
				((FactorcondContext)_localctx).s =  _localctx.h; _localctx.s += "TRUE";
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(458);
				match(T__36);
				((FactorcondContext)_localctx).s =  _localctx.h; _localctx.s += "FALSE";
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpcompContext extends ParserRuleContext {
		public String s;
		public OpcompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opcomp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterOpcomp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitOpcomp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitOpcomp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpcompContext opcomp() throws RecognitionException {
		OpcompContext _localctx = new OpcompContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_opcomp);
		try {
			setState(472);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__37:
				enterOuterAlt(_localctx, 1);
				{
				setState(462);
				match(T__37);
				((OpcompContext)_localctx).s =  "<";
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 2);
				{
				setState(464);
				match(T__38);
				((OpcompContext)_localctx).s =  ">";
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 3);
				{
				setState(466);
				match(T__39);
				((OpcompContext)_localctx).s =  "<=";
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 4);
				{
				setState(468);
				match(T__40);
				((OpcompContext)_localctx).s =  ">=";
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 5);
				{
				setState(470);
				match(T__6);
				((OpcompContext)_localctx).s =  "=";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\u01dd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5`\n\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6n\n\6\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\5\t\u008c\n\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0094\n\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00b2\n\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u00de\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00f2\n\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\5\22\u00fd\n\22\3\23\3\23\3\23\3\23\5\23\u0103\n"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0110"+
		"\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\5\26\u014e\n\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0161\n\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u016b\n\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0177\n\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\5\34\u018d\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\5\35\u0199\n\35\3\36\3\36\3\36\3\36\5\36\u019f\n\36\3\37\3\37\3"+
		"\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u01af\n \3!\3!\3!\3!\5!\u01b5"+
		"\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u01cf\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\5#\u01db\n#\3#\2\2$\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&("+
		"*,.\60\62\64\668:<>@BD\2\2\2\u01e1\2F\3\2\2\2\4I\3\2\2\2\6P\3\2\2\2\b"+
		"_\3\2\2\2\nm\3\2\2\2\fo\3\2\2\2\16t\3\2\2\2\20\u008b\3\2\2\2\22\u0093"+
		"\3\2\2\2\24\u0095\3\2\2\2\26\u009c\3\2\2\2\30\u00b1\3\2\2\2\32\u00b3\3"+
		"\2\2\2\34\u00c2\3\2\2\2\36\u00dd\3\2\2\2 \u00f1\3\2\2\2\"\u00fc\3\2\2"+
		"\2$\u0102\3\2\2\2&\u0104\3\2\2\2(\u010f\3\2\2\2*\u014d\3\2\2\2,\u014f"+
		"\3\2\2\2.\u0160\3\2\2\2\60\u016a\3\2\2\2\62\u0176\3\2\2\2\64\u0178\3\2"+
		"\2\2\66\u018c\3\2\2\28\u0198\3\2\2\2:\u019e\3\2\2\2<\u01a0\3\2\2\2>\u01ae"+
		"\3\2\2\2@\u01b4\3\2\2\2B\u01ce\3\2\2\2D\u01da\3\2\2\2FG\5\4\3\2GH\b\2"+
		"\1\2H\3\3\2\2\2IJ\7\3\2\2JK\7,\2\2KL\7\4\2\2LM\5\6\4\2MN\b\3\1\2NO\7\5"+
		"\2\2O\5\3\2\2\2PQ\5\b\5\2QR\b\4\1\2RS\7\6\2\2ST\b\4\1\2TU\5&\24\2UV\b"+
		"\4\1\2VW\7\7\2\2WX\b\4\1\2X\7\3\2\2\2YZ\5\n\6\2Z[\b\5\1\2[\\\5\b\5\2\\"+
		"]\b\5\1\2]`\3\2\2\2^`\b\5\1\2_Y\3\2\2\2_^\3\2\2\2`\t\3\2\2\2ab\5\f\7\2"+
		"bc\b\6\1\2cn\3\2\2\2de\5\24\13\2ef\b\6\1\2fn\3\2\2\2gh\5\32\16\2hi\b\6"+
		"\1\2in\3\2\2\2jk\5\34\17\2kl\b\6\1\2ln\3\2\2\2ma\3\2\2\2md\3\2\2\2mg\3"+
		"\2\2\2mj\3\2\2\2n\13\3\2\2\2op\7\b\2\2pq\b\7\1\2qr\5\16\b\2rs\b\7\1\2"+
		"s\r\3\2\2\2tu\7,\2\2uv\b\b\1\2vw\7\t\2\2wx\b\b\1\2xy\5\22\n\2yz\b\b\1"+
		"\2z{\7\4\2\2{|\b\b\1\2|}\5\20\t\2}~\b\b\1\2~\17\3\2\2\2\177\u0080\7,\2"+
		"\2\u0080\u0081\b\t\1\2\u0081\u0082\7\t\2\2\u0082\u0083\b\t\1\2\u0083\u0084"+
		"\5\22\n\2\u0084\u0085\b\t\1\2\u0085\u0086\7\4\2\2\u0086\u0087\b\t\1\2"+
		"\u0087\u0088\5\20\t\2\u0088\u0089\b\t\1\2\u0089\u008c\3\2\2\2\u008a\u008c"+
		"\b\t\1\2\u008b\177\3\2\2\2\u008b\u008a\3\2\2\2\u008c\21\3\2\2\2\u008d"+
		"\u008e\7-\2\2\u008e\u0094\b\n\1\2\u008f\u0090\7.\2\2\u0090\u0094\b\n\1"+
		"\2\u0091\u0092\7\62\2\2\u0092\u0094\b\n\1\2\u0093\u008d\3\2\2\2\u0093"+
		"\u008f\3\2\2\2\u0093\u0091\3\2\2\2\u0094\23\3\2\2\2\u0095\u0096\7\n\2"+
		"\2\u0096\u0097\b\13\1\2\u0097\u0098\5\26\f\2\u0098\u0099\b\13\1\2\u0099"+
		"\u009a\7\4\2\2\u009a\u009b\b\13\1\2\u009b\25\3\2\2\2\u009c\u009d\5\"\22"+
		"\2\u009d\u009e\b\f\1\2\u009e\u009f\7\13\2\2\u009f\u00a0\b\f\1\2\u00a0"+
		"\u00a1\5$\23\2\u00a1\u00a2\b\f\1\2\u00a2\u00a3\5\30\r\2\u00a3\u00a4\b"+
		"\f\1\2\u00a4\27\3\2\2\2\u00a5\u00a6\7\4\2\2\u00a6\u00a7\b\r\1\2\u00a7"+
		"\u00a8\5\"\22\2\u00a8\u00a9\b\r\1\2\u00a9\u00aa\7\13\2\2\u00aa\u00ab\b"+
		"\r\1\2\u00ab\u00ac\5$\23\2\u00ac\u00ad\b\r\1\2\u00ad\u00ae\5\30\r\2\u00ae"+
		"\u00af\b\r\1\2\u00af\u00b2\3\2\2\2\u00b0\u00b2\b\r\1\2\u00b1\u00a5\3\2"+
		"\2\2\u00b1\u00b0\3\2\2\2\u00b2\31\3\2\2\2\u00b3\u00b4\b\16\1\2\u00b4\u00b5"+
		"\7\f\2\2\u00b5\u00b6\b\16\1\2\u00b6\u00b7\7,\2\2\u00b7\u00b8\b\16\1\2"+
		"\u00b8\u00b9\5\36\20\2\u00b9\u00ba\b\16\1\2\u00ba\u00bb\7\4\2\2\u00bb"+
		"\u00bc\b\16\1\2\u00bc\u00bd\b\16\1\2\u00bd\u00be\5\6\4\2\u00be\u00bf\b"+
		"\16\1\2\u00bf\u00c0\7\4\2\2\u00c0\u00c1\b\16\1\2\u00c1\33\3\2\2\2\u00c2"+
		"\u00c3\b\17\1\2\u00c3\u00c4\7\r\2\2\u00c4\u00c5\b\17\1\2\u00c5\u00c6\7"+
		",\2\2\u00c6\u00c7\b\17\1\2\u00c7\u00c8\5\36\20\2\u00c8\u00c9\b\17\1\2"+
		"\u00c9\u00ca\7\13\2\2\u00ca\u00cb\b\17\1\2\u00cb\u00cc\5$\23\2\u00cc\u00cd"+
		"\b\17\1\2\u00cd\u00ce\7\4\2\2\u00ce\u00cf\b\17\1\2\u00cf\u00d0\b\17\1"+
		"\2\u00d0\u00d1\5\6\4\2\u00d1\u00d2\b\17\1\2\u00d2\u00d3\7\4\2\2\u00d3"+
		"\u00d4\b\17\1\2\u00d4\35\3\2\2\2\u00d5\u00d6\7\16\2\2\u00d6\u00d7\b\20"+
		"\1\2\u00d7\u00d8\5 \21\2\u00d8\u00d9\b\20\1\2\u00d9\u00da\7\17\2\2\u00da"+
		"\u00db\b\20\1\2\u00db\u00de\3\2\2\2\u00dc\u00de\b\20\1\2\u00dd\u00d5\3"+
		"\2\2\2\u00dd\u00dc\3\2\2\2\u00de\37\3\2\2\2\u00df\u00e0\5\"\22\2\u00e0"+
		"\u00e1\b\21\1\2\u00e1\u00e2\7\13\2\2\u00e2\u00e3\b\21\1\2\u00e3\u00e4"+
		"\5$\23\2\u00e4\u00e5\b\21\1\2\u00e5\u00f2\3\2\2\2\u00e6\u00e7\5\"\22\2"+
		"\u00e7\u00e8\b\21\1\2\u00e8\u00e9\7\13\2\2\u00e9\u00ea\b\21\1\2\u00ea"+
		"\u00eb\5$\23\2\u00eb\u00ec\b\21\1\2\u00ec\u00ed\7\4\2\2\u00ed\u00ee\b"+
		"\21\1\2\u00ee\u00ef\5 \21\2\u00ef\u00f0\b\21\1\2\u00f0\u00f2\3\2\2\2\u00f1"+
		"\u00df\3\2\2\2\u00f1\u00e6\3\2\2\2\u00f2!\3\2\2\2\u00f3\u00f4\7,\2\2\u00f4"+
		"\u00fd\b\22\1\2\u00f5\u00f6\7,\2\2\u00f6\u00f7\b\22\1\2\u00f7\u00f8\7"+
		"\20\2\2\u00f8\u00f9\b\22\1\2\u00f9\u00fa\5\"\22\2\u00fa\u00fb\b\22\1\2"+
		"\u00fb\u00fd\3\2\2\2\u00fc\u00f3\3\2\2\2\u00fc\u00f5\3\2\2\2\u00fd#\3"+
		"\2\2\2\u00fe\u00ff\7\21\2\2\u00ff\u0103\b\23\1\2\u0100\u0101\7\22\2\2"+
		"\u0101\u0103\b\23\1\2\u0102\u00fe\3\2\2\2\u0102\u0100\3\2\2\2\u0103%\3"+
		"\2\2\2\u0104\u0105\5*\26\2\u0105\u0106\b\24\1\2\u0106\u0107\5(\25\2\u0107"+
		"\u0108\b\24\1\2\u0108\'\3\2\2\2\u0109\u010a\5*\26\2\u010a\u010b\b\25\1"+
		"\2\u010b\u010c\5(\25\2\u010c\u010d\b\25\1\2\u010d\u0110\3\2\2\2\u010e"+
		"\u0110\b\25\1\2\u010f\u0109\3\2\2\2\u010f\u010e\3\2\2\2\u0110)\3\2\2\2"+
		"\u0111\u0112\5,\27\2\u0112\u0113\b\26\1\2\u0113\u0114\7\4\2\2\u0114\u0115"+
		"\b\26\1\2\u0115\u014e\3\2\2\2\u0116\u0117\5\64\33\2\u0117\u0118\b\26\1"+
		"\2\u0118\u0119\7\4\2\2\u0119\u011a\b\26\1\2\u011a\u014e\3\2\2\2\u011b"+
		"\u011c\7\23\2\2\u011c\u011d\b\26\1\2\u011d\u011e\5<\37\2\u011e\u011f\b"+
		"\26\1\2\u011f\u0120\7\24\2\2\u0120\u0121\b\26\1\2\u0121\u0122\5\6\4\2"+
		"\u0122\u0123\b\26\1\2\u0123\u0124\7\25\2\2\u0124\u0125\b\26\1\2\u0125"+
		"\u0126\5\6\4\2\u0126\u0127\b\26\1\2\u0127\u014e\3\2\2\2\u0128\u0129\7"+
		"\26\2\2\u0129\u012a\b\26\1\2\u012a\u012b\5<\37\2\u012b\u012c\b\26\1\2"+
		"\u012c\u012d\7\27\2\2\u012d\u012e\b\26\1\2\u012e\u012f\5\6\4\2\u012f\u0130"+
		"\b\26\1\2\u0130\u014e\3\2\2\2\u0131\u0132\7\30\2\2\u0132\u0133\b\26\1"+
		"\2\u0133\u0134\5\6\4\2\u0134\u0135\b\26\1\2\u0135\u0136\7\31\2\2\u0136"+
		"\u0137\b\26\1\2\u0137\u0138\5<\37\2\u0138\u0139\b\26\1\2\u0139\u013a\7"+
		"\4\2\2\u013a\u013b\b\26\1\2\u013b\u014e\3\2\2\2\u013c\u013d\7\32\2\2\u013d"+
		"\u013e\b\26\1\2\u013e\u013f\7,\2\2\u013f\u0140\b\26\1\2\u0140\u0141\7"+
		"\33\2\2\u0141\u0142\b\26\1\2\u0142\u0143\5.\30\2\u0143\u0144\b\26\1\2"+
		"\u0144\u0145\5:\36\2\u0145\u0146\b\26\1\2\u0146\u0147\5.\30\2\u0147\u0148"+
		"\b\26\1\2\u0148\u0149\7\27\2\2\u0149\u014a\b\26\1\2\u014a\u014b\5\6\4"+
		"\2\u014b\u014c\b\26\1\2\u014c\u014e\3\2\2\2\u014d\u0111\3\2\2\2\u014d"+
		"\u0116\3\2\2\2\u014d\u011b\3\2\2\2\u014d\u0128\3\2\2\2\u014d\u0131\3\2"+
		"\2\2\u014d\u013c\3\2\2\2\u014e+\3\2\2\2\u014f\u0150\7,\2\2\u0150\u0151"+
		"\b\27\1\2\u0151\u0152\7\33\2\2\u0152\u0153\b\27\1\2\u0153\u0154\5.\30"+
		"\2\u0154\u0155\b\27\1\2\u0155-\3\2\2\2\u0156\u0157\5\66\34\2\u0157\u0158"+
		"\b\30\1\2\u0158\u0159\58\35\2\u0159\u015a\b\30\1\2\u015a\u015b\5.\30\2"+
		"\u015b\u015c\b\30\1\2\u015c\u0161\3\2\2\2\u015d\u015e\5\66\34\2\u015e"+
		"\u015f\b\30\1\2\u015f\u0161\3\2\2\2\u0160\u0156\3\2\2\2\u0160\u015d\3"+
		"\2\2\2\u0161/\3\2\2\2\u0162\u0163\7\16\2\2\u0163\u0164\b\31\1\2\u0164"+
		"\u0165\5\62\32\2\u0165\u0166\b\31\1\2\u0166\u0167\7\17\2\2\u0167\u0168"+
		"\b\31\1\2\u0168\u016b\3\2\2\2\u0169\u016b\b\31\1\2\u016a\u0162\3\2\2\2"+
		"\u016a\u0169\3\2\2\2\u016b\61\3\2\2\2\u016c\u016d\5.\30\2\u016d\u016e"+
		"\b\32\1\2\u016e\u0177\3\2\2\2\u016f\u0170\5.\30\2\u0170\u0171\b\32\1\2"+
		"\u0171\u0172\7\20\2\2\u0172\u0173\b\32\1\2\u0173\u0174\5\62\32\2\u0174"+
		"\u0175\b\32\1\2\u0175\u0177\3\2\2\2\u0176\u016c\3\2\2\2\u0176\u016f\3"+
		"\2\2\2\u0177\63\3\2\2\2\u0178\u0179\7,\2\2\u0179\u017a\b\33\1\2\u017a"+
		"\u017b\5\60\31\2\u017b\u017c\b\33\1\2\u017c\65\3\2\2\2\u017d\u017e\5\22"+
		"\n\2\u017e\u017f\b\34\1\2\u017f\u018d\3\2\2\2\u0180\u0181\7\16\2\2\u0181"+
		"\u0182\b\34\1\2\u0182\u0183\5.\30\2\u0183\u0184\b\34\1\2\u0184\u0185\7"+
		"\17\2\2\u0185\u0186\b\34\1\2\u0186\u018d\3\2\2\2\u0187\u0188\7,\2\2\u0188"+
		"\u0189\b\34\1\2\u0189\u018a\5\60\31\2\u018a\u018b\b\34\1\2\u018b\u018d"+
		"\3\2\2\2\u018c\u017d\3\2\2\2\u018c\u0180\3\2\2\2\u018c\u0187\3\2\2\2\u018d"+
		"\67\3\2\2\2\u018e\u018f\7\34\2\2\u018f\u0199\b\35\1\2\u0190\u0191\7\35"+
		"\2\2\u0191\u0199\b\35\1\2\u0192\u0193\7\36\2\2\u0193\u0199\b\35\1\2\u0194"+
		"\u0195\7\37\2\2\u0195\u0199\b\35\1\2\u0196\u0197\7 \2\2\u0197\u0199\b"+
		"\35\1\2\u0198\u018e\3\2\2\2\u0198\u0190\3\2\2\2\u0198\u0192\3\2\2\2\u0198"+
		"\u0194\3\2\2\2\u0198\u0196\3\2\2\2\u01999\3\2\2\2\u019a\u019b\7!\2\2\u019b"+
		"\u019f\b\36\1\2\u019c\u019d\7\"\2\2\u019d\u019f\b\36\1\2\u019e\u019a\3"+
		"\2\2\2\u019e\u019c\3\2\2\2\u019f;\3\2\2\2\u01a0\u01a1\5B\"\2\u01a1\u01a2"+
		"\b\37\1\2\u01a2\u01a3\5> \2\u01a3\u01a4\b\37\1\2\u01a4=\3\2\2\2\u01a5"+
		"\u01a6\5B\"\2\u01a6\u01a7\b \1\2\u01a7\u01af\3\2\2\2\u01a8\u01a9\5@!\2"+
		"\u01a9\u01aa\b \1\2\u01aa\u01ab\5> \2\u01ab\u01ac\b \1\2\u01ac\u01af\3"+
		"\2\2\2\u01ad\u01af\b \1\2\u01ae\u01a5\3\2\2\2\u01ae\u01a8\3\2\2\2\u01ae"+
		"\u01ad\3\2\2\2\u01af?\3\2\2\2\u01b0\u01b1\7#\2\2\u01b1\u01b5\b!\1\2\u01b2"+
		"\u01b3\7$\2\2\u01b3\u01b5\b!\1\2\u01b4\u01b0\3\2\2\2\u01b4\u01b2\3\2\2"+
		"\2\u01b5A\3\2\2\2\u01b6\u01b7\b\"\1\2\u01b7\u01b8\5.\30\2\u01b8\u01b9"+
		"\b\"\1\2\u01b9\u01ba\5D#\2\u01ba\u01bb\b\"\1\2\u01bb\u01bc\5.\30\2\u01bc"+
		"\u01bd\b\"\1\2\u01bd\u01cf\3\2\2\2\u01be\u01bf\7\16\2\2\u01bf\u01c0\b"+
		"\"\1\2\u01c0\u01c1\5<\37\2\u01c1\u01c2\b\"\1\2\u01c2\u01c3\7\17\2\2\u01c3"+
		"\u01c4\b\"\1\2\u01c4\u01cf\3\2\2\2\u01c5\u01c6\7%\2\2\u01c6\u01c7\b\""+
		"\1\2\u01c7\u01c8\5B\"\2\u01c8\u01c9\b\"\1\2\u01c9\u01cf\3\2\2\2\u01ca"+
		"\u01cb\7&\2\2\u01cb\u01cf\b\"\1\2\u01cc\u01cd\7\'\2\2\u01cd\u01cf\b\""+
		"\1\2\u01ce\u01b6\3\2\2\2\u01ce\u01be\3\2\2\2\u01ce\u01c5\3\2\2\2\u01ce"+
		"\u01ca\3\2\2\2\u01ce\u01cc\3\2\2\2\u01cfC\3\2\2\2\u01d0\u01d1\7(\2\2\u01d1"+
		"\u01db\b#\1\2\u01d2\u01d3\7)\2\2\u01d3\u01db\b#\1\2\u01d4\u01d5\7*\2\2"+
		"\u01d5\u01db\b#\1\2\u01d6\u01d7\7+\2\2\u01d7\u01db\b#\1\2\u01d8\u01d9"+
		"\7\t\2\2\u01d9\u01db\b#\1\2\u01da\u01d0\3\2\2\2\u01da\u01d2\3\2\2\2\u01da"+
		"\u01d4\3\2\2\2\u01da\u01d6\3\2\2\2\u01da\u01d8\3\2\2\2\u01dbE\3\2\2\2"+
		"\27_m\u008b\u0093\u00b1\u00dd\u00f1\u00fc\u0102\u010f\u014d\u0160\u016a"+
		"\u0176\u018c\u0198\u019e\u01ae\u01b4\u01ce\u01da";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}