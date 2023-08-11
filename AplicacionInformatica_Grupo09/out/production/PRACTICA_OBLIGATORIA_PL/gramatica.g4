grammar gramatica;
/*
 * Parser Rules
 */
 @parser::members{
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
 }

axioma :
	prg <EOF> {cabeceras.ImprimeOperacion(); func_proc.ImprimeSubprograma(); prg_principal.ImprimePrograma();} ;

prg :
     'PROGRAM'  IDENTIFIER ';' blq { prg_principal.setString($blq.s + ". </div>");}  '.'
	;
blq returns[String s]: dcllist[""] {$s = $dcllist.s ;} 'BEGIN' {prg_principal.incTab(); $s += "<div>" + cabeceras.getReservadas_init() + "BEGIN" + cabeceras.getReservadas_final() +"</div>";} sentlist {$s += "<DIV style=\"text-indent:" + prg_principal.getContTab() +"cm\">"; $s += $sentlist.s; prg_principal.decTab();} 'END' {$s += func_proc.getTabulacion_final(); $s += "<div>" + cabeceras.getReservadas_init() + "END" + cabeceras.getReservadas_final();}
    ;
// DECALRACION

dcllist[String h] returns[String s] :
    dcl {$h += $dcl.s ;} dcllist[$h] {$s = $dcllist.s ;}
    | {$s = $h ;}
    ;

// ZONA DE DECLARACIONES
dcl returns[String s]
    : defcte {$s = $defcte.s;}
    | defvar {$s = $defvar.s;}
    | defproc {$s = $defproc.s;}
    | deffun {$s = $deffun.s ;}
    ;

defcte returns[String s]: 'CONST' {$s = "<div>" + cabeceras.getReservadas_init() + "CONST" + cabeceras.getReservadas_final() + "</div>";} ctelist {$s += "<DIV style=\"text-indent:1.25cm\">";$s += $ctelist.s;$s += "</DIV>"; }
    ;

ctelist returns[String s]: IDENTIFIER {$s = "<div>"+cabeceras.getIdentificadores_init() + $IDENTIFIER.text + cabeceras.getIdentificadores_final();} '=' {$s += '=';} simpvalue {$s += $simpvalue.s ;} ';' {$s += "; </div>";} ctelist1[""] {$s +=  $ctelist1.s;}
    ;

ctelist1[String h] returns[String s]: IDENTIFIER {$h += "<div>" + cabeceras.getIdentificadores_init() + $IDENTIFIER.text + cabeceras.getIdentificadores_final();} '=' {$h += '=';} simpvalue {$h += $simpvalue.s ;} ';' {$h += "; </div>";} ctelist1[$h] {$s = $ctelist1.s ;}
    | {$s = $h;}
    ;

simpvalue returns[String s]: NUMERIC_INTEGER_CONST {$s = cabeceras.getCons_init() + $NUMERIC_INTEGER_CONST.text + cabeceras.getCons_final();}
    | NUMERIC_REAL_CONST {$s = cabeceras.getCons_init() + $NUMERIC_REAL_CONST.text + cabeceras.getCons_final();}
    | STRING_CONST {$s = cabeceras.getCons_init() + $STRING_CONST.text + cabeceras.getCons_final();}
    ;
defvar returns[String s]: 'VAR' {$s = "<div>"+cabeceras.getReservadas_init() + "VAR" + cabeceras.getReservadas_final() + "</div>";} defvarlist[""] {$s += "<DIV style=\"text-indent:1.25cm\">"; $s += $defvarlist.s;} ';' {$s += "; </div>";$s += "</DIV>"; }
    ;
defvarlist[String h] returns[String s]: varlist {$h = "<div>"+$varlist.s;} ':' {$h += ':';} tbas {$h += $tbas.s;} defvarlist1[$h] {$s = $defvarlist1.s ;}
    ;
defvarlist1[String h] returns[String s] : ';' {$h += "; </div>";} varlist {$h += "<div>"+ $varlist.s;} ':' {$h += ':';}  tbas {$h += $tbas.s;} defvarlist1[$h] {$s = $defvarlist1.s ;}
    | {$s = $h;}
    ;
defproc returns[String s] : {String cabecera_p ="";} 'PROCEDURE' {$s = "<div>" + cabeceras.getReservadas_init() + "PROCEDURE " + cabeceras.getReservadas_final();} IDENTIFIER {$s += cabeceras.getIdentificadores_init() + $IDENTIFIER.text + cabeceras.getIdentificadores_final(); cabecera_p =cabeceras.getIdentificadores_init() + $IDENTIFIER.text + cabeceras.getIdentificadores_final();}  formal_paramlist {$s +=$formal_paramlist.s; cabecera_p+=$formal_paramlist.s;} ';' {cabecera_p +=";"; $s += "; </div>";} {cabeceras.add(cabecera_p);} blq {$s += $blq.s ;} ';'{$s += "; </div>"; func_proc.fullAdd($s);}
    ;
deffun returns[String s] : {String cabecera_f =" ";} 'FUNCTION' {$s = "<div>" + cabeceras.getReservadas_init() + "FUNCTION " + cabeceras.getReservadas_final();} IDENTIFIER {$s += cabeceras.getIdentificadores_init() + $IDENTIFIER.text + cabeceras.getIdentificadores_final(); cabecera_f =cabeceras.getIdentificadores_init() + $IDENTIFIER.text + cabeceras.getIdentificadores_final();} formal_paramlist {$s +=$formal_paramlist.s; cabecera_f+=$formal_paramlist.s;} ':' {cabecera_f +=";"; $s += ":";} tbas {$s += $tbas.s;} ';'  {$s += "; </div>";} {String tipo=$tbas.s+" " ;cabeceras.add(tipo + cabecera_f);} blq {$s += $blq.s ;} ';' {$s += "; </div>"; func_proc.fullAdd($s);}
    ;
formal_paramlist returns[String s]: '(' {$s = "(";} formal_param {$s += $formal_param.s;} ')' {$s += ")";}
    | { $s = "";}
    ;
formal_param returns[String s]
    : varlist {$s = $varlist.s;} ':' {$s += ':';} tbas {$s += $tbas.s;}
    | varlist {$s = $varlist.s;} ':' {$s += ':';} tbas {$s += $tbas.s;} ';' {$s += ";";} formal_param {$s += $formal_param.s;}
    ;
varlist returns[String s]: IDENTIFIER {$s = cabeceras.getIdentificadores_init() + $IDENTIFIER.text + cabeceras.getIdentificadores_final();}
    | IDENTIFIER {$s = cabeceras.getIdentificadores_init() + $IDENTIFIER.text + cabeceras.getIdentificadores_final();} ',' {$s += ',';} varlist {$s += $varlist.s;}
    ;
tbas returns[String s]
    : 'integer' {$s = "integer";}
    | 'real' {$s = "real";}
    ;
// SENTENCIA
sentlist returns[String s] : sent {$s = $sent.s ;}  sentlist1[""] {$s += $sentlist1.s;}
    ;
sentlist1[String h] returns[String s]  : sent {$h += $sent.s; } sentlist1[$h] {$s = $sentlist1.s ;}
    | {$s = $h ;}
    ;
// ZONA DE SENTENCIAS
sent returns[String s] : asig {$s = "<div>"+$asig.s ;} ';' {$s += ";</div>" ;}
    | proc_call {$s = "<div>"+$proc_call.s ;} ';' {$s += ";</div>" ;}
    //Parte opcional de sent
    | 'IF' {$s = "<div>" + cabeceras.getReservadas_init() + "IF " + cabeceras.getReservadas_final();} expcond {$s += $expcond.s;} 'THEN' {$s += cabeceras.getReservadas_init() + "THEN " + cabeceras.getReservadas_final() + "</div>" /* "</br>" */;} blq { $s += $blq.s ; $s += "</div>";} 'ELSE' {$s +="<div>" + cabeceras.getReservadas_init() + "ELSE " + cabeceras.getReservadas_final() + "</div>";} blq {$s += $blq.s + "</div>";}
    | 'WHILE' {$s = "<div>" + cabeceras.getReservadas_init() + "WHILE " + cabeceras.getReservadas_final();} expcond {$s = $expcond.s;}  'DO' {$s += cabeceras.getReservadas_init() + " DO " + cabeceras.getReservadas_final() + "</div>";} blq {$s += $blq.s + "</div>";}
    | 'REPEAT' {$s = "<div>"+ cabeceras.getReservadas_init() + "REPEAT " + cabeceras.getReservadas_final() + "</div>";} blq {$s += $blq.s + "</div>";} 'UNTIL' {$s += "<div>" + cabeceras.getReservadas_init() + "UNTIL " + cabeceras.getReservadas_final();} expcond {$s += $expcond.s;}  ';' {$s += "; </div>";}
    | 'FOR' {$s = "<div>" + cabeceras.getReservadas_init() + "FOR " + cabeceras.getReservadas_final();} IDENTIFIER {$s += cabeceras.getIdentificadores_init() + $IDENTIFIER.text + cabeceras.getIdentificadores_final();} ':=' {$s += ":=";} exp[""] {$s += $exp.s ;} inc {$s += $inc.s ;} exp[""] {$s += $exp.s ;} 'DO' {$s += cabeceras.getReservadas_init() + " DO " + cabeceras.getReservadas_final() + "</div>";} blq {$s += $blq.s + "</div>" ;}
    ;


asig returns[String s]: IDENTIFIER {$s = cabeceras.getIdentificadores_init() + $IDENTIFIER.text + cabeceras.getIdentificadores_final();}
                                    ':=' {$s += ":=" ;} exp[""] {$s += $exp.s;}
    ;
exp[String h] returns[String s]: factor {$h = $factor.s;} op {$h += $op.s;} exp[$h] {$s = $exp.s;}
    | factor{$s = $h + $factor.s;}
    ;
subpparamlist[String h] returns[String s]: '(' {$s = "(";} explist {$s += $explist.s;} ')' {$s += ')';}
    | {$s = $h;}
    ;
explist returns[String s] : exp[""] {$s = $exp.s ;}
    | exp[""] {$s = $exp.s ;}',' {$s += ',' ;} explist {$s += $explist.s ;}
    ;
proc_call returns[String s]: IDENTIFIER {$s = cabeceras.getIdentificadores_init() + $IDENTIFIER.text + cabeceras.getIdentificadores_final();}  subpparamlist[""] {$s += $subpparamlist.s;}
    ;
factor returns[String s]: simpvalue { $s = $simpvalue.s ;}
    | '(' { $s = "(" ;} exp[""] { $s += $exp.s ;} ')' { $s += ')' ;}
    | IDENTIFIER {$s = cabeceras.getIdentificadores_init() + $IDENTIFIER.text + cabeceras.getIdentificadores_final();} subpparamlist[""] {$s += $subpparamlist.s;}
    ;
op returns[String s]: '+' {$s = " + ";}
    | '-' {$s = " - ";}
    | '*' {$s = " * ";}
    | 'DIV' {$s = " DIV ";}
    | 'MOD' {$s = " MOD ";}
    ;

// Ampliacion Parte Sintáctica
inc returns[String s]: 'TO' {$s = " TO ";}
    | 'DOWNTO' {$s = " DOWNTO ";}
    ;
expcond returns[String s]: factorcond[""] {$s = $factorcond.s;} expcond1[""] {$s += $expcond1.s ;};
expcond1[String h] returns[String s]: factorcond[""] {$s = $h + $factorcond.s ;}
    | oplog {$h += $oplog.s ;} expcond1[$h] {$s = $expcond1.s ;}
    | {$s = $h ;}
    ;
oplog returns[String s]: 'OR' {$s = "OR" ;}
    | 'AND' {$s = "AND" ;}
    ;
factorcond[String h] returns[String s]: {$s = $h;}exp[""] {$s += $exp.s;} opcomp {$s += $opcomp.s;} exp[""] {$s += $exp.s;}
    | '(' {$s = $h; $s += "(";} expcond {$s += $expcond.s;} ')' {$s += ')';}
    | 'NOT' {$h += "NOT";} factorcond[$h] {$s = $factorcond.s ;}
    | 'TRUE' {$s = $h; $s += "TRUE";}
    | 'FALSE' {$s = $h; $s += "FALSE";}
    ;
opcomp returns[String s]: '<' {$s = "<";}
    | '>' {$s = ">";}
    | '<=' {$s = "<=";}
    | '>=' {$s = ">=";}
    | '=' {$s = "=";}
    ;
/*
 * Lexer Rules
 */

IDENTIFIER: ([a-zA-Z] | '_')+ [0-9]* ([a-zA-Z] | '_')* ;
NUMERIC_INTEGER_CONST: ('+' | '-')? [0-9]+ ;
NUMERIC_REAL_CONST: (FIJO | EXPONENCIAL | MIXTO) ;
FIJO: ('+' | '-')? [0-9]+ '.' [0-9]+ ;
EXPONENCIAL: ('+' | '-')? [0-9]+ ('e' | 'E') ('+' | '-')? [0-9]+ ;
MIXTO: ('+' | '-')? [0-9]+ '.' [0-9]+ ('e' | 'E') ('+' | '-')? [0-9]+ ;
STRING_CONST: (SIMPLE | DOBLE) ;
SIMPLE:'\'' ~('\'' | '\n')* ('\'\'')? ~('\'' | '\n')* '\'' ;
DOBLE:'"' ~('"' | '\n')* ('""')? ~('"' | '\n')* '"' ;
COMENTARIO: (CORCHETE | PARENTESIS_ASTERISCO) -> channel(HIDDEN);
CORCHETE : '{' ~('}' | '\n')* '}' ;
PARENTESIS_ASTERISCO:'(*' ~('*')* ('*' ~(')'))*? ~('*')* '*)' ;
WHITESPACE : [ \n\t\r]+ -> skip;