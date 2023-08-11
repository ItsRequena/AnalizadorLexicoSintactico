// Generated from C:/Users/danie/OneDrive - Universidad Rey Juan Carlos/Escritorio/AplicacionInformatica_Grupo09/src\gramatica.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gramaticaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gramaticaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#axioma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAxioma(gramaticaParser.AxiomaContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#prg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrg(gramaticaParser.PrgContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#blq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlq(gramaticaParser.BlqContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#dcllist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcllist(gramaticaParser.DcllistContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#dcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcl(gramaticaParser.DclContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#defcte}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefcte(gramaticaParser.DefcteContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#ctelist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtelist(gramaticaParser.CtelistContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#ctelist1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtelist1(gramaticaParser.Ctelist1Context ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#simpvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpvalue(gramaticaParser.SimpvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#defvar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefvar(gramaticaParser.DefvarContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#defvarlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefvarlist(gramaticaParser.DefvarlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#defvarlist1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefvarlist1(gramaticaParser.Defvarlist1Context ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#defproc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefproc(gramaticaParser.DefprocContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#deffun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeffun(gramaticaParser.DeffunContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#formal_paramlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_paramlist(gramaticaParser.Formal_paramlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#formal_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_param(gramaticaParser.Formal_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#varlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarlist(gramaticaParser.VarlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#tbas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTbas(gramaticaParser.TbasContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#sentlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentlist(gramaticaParser.SentlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#sentlist1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentlist1(gramaticaParser.Sentlist1Context ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#sent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSent(gramaticaParser.SentContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#asig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsig(gramaticaParser.AsigContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(gramaticaParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#subpparamlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubpparamlist(gramaticaParser.SubpparamlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#explist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplist(gramaticaParser.ExplistContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#proc_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_call(gramaticaParser.Proc_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(gramaticaParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(gramaticaParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#inc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInc(gramaticaParser.IncContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#expcond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpcond(gramaticaParser.ExpcondContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#expcond1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpcond1(gramaticaParser.Expcond1Context ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#oplog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOplog(gramaticaParser.OplogContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#factorcond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorcond(gramaticaParser.FactorcondContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#opcomp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpcomp(gramaticaParser.OpcompContext ctx);
}