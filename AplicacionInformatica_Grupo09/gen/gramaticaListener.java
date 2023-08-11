// Generated from C:/Users/danie/OneDrive - Universidad Rey Juan Carlos/Escritorio/AplicacionInformatica_Grupo09/src\gramatica.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramaticaParser}.
 */
public interface gramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#axioma}.
	 * @param ctx the parse tree
	 */
	void enterAxioma(gramaticaParser.AxiomaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#axioma}.
	 * @param ctx the parse tree
	 */
	void exitAxioma(gramaticaParser.AxiomaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#prg}.
	 * @param ctx the parse tree
	 */
	void enterPrg(gramaticaParser.PrgContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#prg}.
	 * @param ctx the parse tree
	 */
	void exitPrg(gramaticaParser.PrgContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#blq}.
	 * @param ctx the parse tree
	 */
	void enterBlq(gramaticaParser.BlqContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#blq}.
	 * @param ctx the parse tree
	 */
	void exitBlq(gramaticaParser.BlqContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#dcllist}.
	 * @param ctx the parse tree
	 */
	void enterDcllist(gramaticaParser.DcllistContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#dcllist}.
	 * @param ctx the parse tree
	 */
	void exitDcllist(gramaticaParser.DcllistContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#dcl}.
	 * @param ctx the parse tree
	 */
	void enterDcl(gramaticaParser.DclContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#dcl}.
	 * @param ctx the parse tree
	 */
	void exitDcl(gramaticaParser.DclContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#defcte}.
	 * @param ctx the parse tree
	 */
	void enterDefcte(gramaticaParser.DefcteContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#defcte}.
	 * @param ctx the parse tree
	 */
	void exitDefcte(gramaticaParser.DefcteContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#ctelist}.
	 * @param ctx the parse tree
	 */
	void enterCtelist(gramaticaParser.CtelistContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#ctelist}.
	 * @param ctx the parse tree
	 */
	void exitCtelist(gramaticaParser.CtelistContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#ctelist1}.
	 * @param ctx the parse tree
	 */
	void enterCtelist1(gramaticaParser.Ctelist1Context ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#ctelist1}.
	 * @param ctx the parse tree
	 */
	void exitCtelist1(gramaticaParser.Ctelist1Context ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#simpvalue}.
	 * @param ctx the parse tree
	 */
	void enterSimpvalue(gramaticaParser.SimpvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#simpvalue}.
	 * @param ctx the parse tree
	 */
	void exitSimpvalue(gramaticaParser.SimpvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#defvar}.
	 * @param ctx the parse tree
	 */
	void enterDefvar(gramaticaParser.DefvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#defvar}.
	 * @param ctx the parse tree
	 */
	void exitDefvar(gramaticaParser.DefvarContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#defvarlist}.
	 * @param ctx the parse tree
	 */
	void enterDefvarlist(gramaticaParser.DefvarlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#defvarlist}.
	 * @param ctx the parse tree
	 */
	void exitDefvarlist(gramaticaParser.DefvarlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#defvarlist1}.
	 * @param ctx the parse tree
	 */
	void enterDefvarlist1(gramaticaParser.Defvarlist1Context ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#defvarlist1}.
	 * @param ctx the parse tree
	 */
	void exitDefvarlist1(gramaticaParser.Defvarlist1Context ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#defproc}.
	 * @param ctx the parse tree
	 */
	void enterDefproc(gramaticaParser.DefprocContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#defproc}.
	 * @param ctx the parse tree
	 */
	void exitDefproc(gramaticaParser.DefprocContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#deffun}.
	 * @param ctx the parse tree
	 */
	void enterDeffun(gramaticaParser.DeffunContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#deffun}.
	 * @param ctx the parse tree
	 */
	void exitDeffun(gramaticaParser.DeffunContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#formal_paramlist}.
	 * @param ctx the parse tree
	 */
	void enterFormal_paramlist(gramaticaParser.Formal_paramlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#formal_paramlist}.
	 * @param ctx the parse tree
	 */
	void exitFormal_paramlist(gramaticaParser.Formal_paramlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#formal_param}.
	 * @param ctx the parse tree
	 */
	void enterFormal_param(gramaticaParser.Formal_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#formal_param}.
	 * @param ctx the parse tree
	 */
	void exitFormal_param(gramaticaParser.Formal_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#varlist}.
	 * @param ctx the parse tree
	 */
	void enterVarlist(gramaticaParser.VarlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#varlist}.
	 * @param ctx the parse tree
	 */
	void exitVarlist(gramaticaParser.VarlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#tbas}.
	 * @param ctx the parse tree
	 */
	void enterTbas(gramaticaParser.TbasContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#tbas}.
	 * @param ctx the parse tree
	 */
	void exitTbas(gramaticaParser.TbasContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#sentlist}.
	 * @param ctx the parse tree
	 */
	void enterSentlist(gramaticaParser.SentlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#sentlist}.
	 * @param ctx the parse tree
	 */
	void exitSentlist(gramaticaParser.SentlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#sentlist1}.
	 * @param ctx the parse tree
	 */
	void enterSentlist1(gramaticaParser.Sentlist1Context ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#sentlist1}.
	 * @param ctx the parse tree
	 */
	void exitSentlist1(gramaticaParser.Sentlist1Context ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#sent}.
	 * @param ctx the parse tree
	 */
	void enterSent(gramaticaParser.SentContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#sent}.
	 * @param ctx the parse tree
	 */
	void exitSent(gramaticaParser.SentContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#asig}.
	 * @param ctx the parse tree
	 */
	void enterAsig(gramaticaParser.AsigContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#asig}.
	 * @param ctx the parse tree
	 */
	void exitAsig(gramaticaParser.AsigContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(gramaticaParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(gramaticaParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#subpparamlist}.
	 * @param ctx the parse tree
	 */
	void enterSubpparamlist(gramaticaParser.SubpparamlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#subpparamlist}.
	 * @param ctx the parse tree
	 */
	void exitSubpparamlist(gramaticaParser.SubpparamlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#explist}.
	 * @param ctx the parse tree
	 */
	void enterExplist(gramaticaParser.ExplistContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#explist}.
	 * @param ctx the parse tree
	 */
	void exitExplist(gramaticaParser.ExplistContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#proc_call}.
	 * @param ctx the parse tree
	 */
	void enterProc_call(gramaticaParser.Proc_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#proc_call}.
	 * @param ctx the parse tree
	 */
	void exitProc_call(gramaticaParser.Proc_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(gramaticaParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(gramaticaParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(gramaticaParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(gramaticaParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#inc}.
	 * @param ctx the parse tree
	 */
	void enterInc(gramaticaParser.IncContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#inc}.
	 * @param ctx the parse tree
	 */
	void exitInc(gramaticaParser.IncContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#expcond}.
	 * @param ctx the parse tree
	 */
	void enterExpcond(gramaticaParser.ExpcondContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#expcond}.
	 * @param ctx the parse tree
	 */
	void exitExpcond(gramaticaParser.ExpcondContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#expcond1}.
	 * @param ctx the parse tree
	 */
	void enterExpcond1(gramaticaParser.Expcond1Context ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#expcond1}.
	 * @param ctx the parse tree
	 */
	void exitExpcond1(gramaticaParser.Expcond1Context ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#oplog}.
	 * @param ctx the parse tree
	 */
	void enterOplog(gramaticaParser.OplogContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#oplog}.
	 * @param ctx the parse tree
	 */
	void exitOplog(gramaticaParser.OplogContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#factorcond}.
	 * @param ctx the parse tree
	 */
	void enterFactorcond(gramaticaParser.FactorcondContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#factorcond}.
	 * @param ctx the parse tree
	 */
	void exitFactorcond(gramaticaParser.FactorcondContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#opcomp}.
	 * @param ctx the parse tree
	 */
	void enterOpcomp(gramaticaParser.OpcompContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#opcomp}.
	 * @param ctx the parse tree
	 */
	void exitOpcomp(gramaticaParser.OpcompContext ctx);
}