import java.util.ArrayList;

public class Inicializar {

    private ArrayList<String> cabeceras= new ArrayList<>();

    private ArrayList<String> func_proc = new ArrayList<>();

    //private ArrayList<String> prg_principal = new ArrayList<>();

    private String prg_principal;
    public double tab = 0;
    public double contTab = 0;
    private String tabulacion_final= "</DIV>";
    private String cons_init = "<SPAN class=\"cte\">";
    private String cons_final = "</SPAN>";
    private String reservadas_init = "<SPAN class=\"palres\">";
    private String reservadas_final = "</SPAN>";
    private String identificadores_init = "<SPAN class=\"ident\">";
    private String identificadores_final = "</SPAN>";

    public void ImprimeOperacion (){
        System.out.println("<H2>FUNCIONES Y PROCEDIMIENTOS:</H2>");
        System.out.println("<UL>");
        for(String cabecera: cabeceras){
            System.out.print("\t<LI>\n");
            System.out.print("\t\t<A HREF=\"#");
            System.out.print(cabeceras.indexOf(cabecera));
            System.out.print("\"></A>\n");
            System.out.print(cabecera);
            System.out.print("\t</LI>\n");
        }
        System.out.println("</UL>\n");
    }

    public void ImprimeSubprograma (){

        for(String subprograma: func_proc){
            System.out.println("<HR/>");
            System.out.print("<A NAME=\"");
            System.out.print(func_proc.indexOf(subprograma));
            System.out.print("\">");
            System.out.print("</A>\n");
            System.out.print(subprograma);
            System.out.println("<div> <A HREF=\"#\">INICIO PAGINA</A>");
            System.out.print("<A HREF=\"#");
            System.out.print(func_proc.indexOf(subprograma));
            System.out.print("\">");
            System.out.print("Subprograma"+ func_proc.indexOf(subprograma));
            System.out.print("</A>");
            System.out.print("</div>");
        }
    }

    public void ImprimePrograma () {
        System.out.println("<HR/>");
        StringBuffer auxiliar = new StringBuffer(prg_principal);
        System.out.println("<A NAME=\"MAIN\"></A>");
        System.out.println("<H2> PROGRAMA PRINCIPAL </H2>");

        int longitud = prg_principal.length()-1;
        int ind_a = 0 ;
        int ind_b = 0 ;
        int i = 0;
        String s = auxiliar.toString();
        boolean procedure = false;
        boolean function = false;
        //Por si no tiene subprogramas
        if(!getString().contains("PROCEDURE") && !getString().contains("FUNCTION")){
            System.out.println(getString());
        }
        else {
            if (s.contains("PROCEDURE")) {
                while (i < s.length() - 1) {
                    if (s.contains("PROCEDURE") && (s.charAt(i) == 'P') && (s.charAt(i + 1) == 'R')
                            && (s.charAt(i + 2) == 'O') && (s.charAt(i + 3) == 'C') && (s.charAt(i + 4) == 'E')
                            && (s.charAt(i + 5) == 'D') && (s.charAt(i + 6) == 'U') && (s.charAt(i + 7) == 'R')
                            && (s.charAt(i + 8) == 'E')) {
                        ind_a = i - 26; //22
                        procedure = true;

                    }
                    if (procedure && (s.charAt(i) == 'E') && (s.charAt(i + 1) == 'N') && (s.charAt(i + 2) == 'D') && (s.charAt(i + 10) == ';')) {
                        ind_b = i + 18; //16
                        //System.out.println(auxiliar.replace(ind_a,ind_b,""));
                        auxiliar = auxiliar.replace(ind_a, ind_b, "");
                        s = auxiliar.toString();
                        i = 0;
                        procedure = false;
                    }
                    i++;
                }
            }
            i = 0;
            if (s.contains("FUNCTION")) {
                while (i < s.length() - 1) {
                    if (s.contains("FUNCTION") && (s.charAt(i) == 'F') && (s.charAt(i + 1) == 'U')
                            && (s.charAt(i + 2) == 'N') && (s.charAt(i + 3) == 'C') && (s.charAt(i + 4) == 'T')
                            && (s.charAt(i + 5) == 'I') && (s.charAt(i + 6) == 'O') && (s.charAt(i + 7) == 'N')) {
                        ind_a = i - 26;
                        function = true;
                    }
                    if (function && (s.charAt(i) == 'E') && (s.charAt(i + 1) == 'N') && (s.charAt(i + 2) == 'D')
                            && (s.charAt(i + 10) == ';')) {
                        ind_b = i + 18;
                        auxiliar = auxiliar.replace(ind_a, ind_b, "");
                        s = auxiliar.toString();
                        i = 0;
                        function = false;

                    }
                    i++;
                }


            }

            System.out.println(auxiliar);
        }
        System.out.println("<br/><A HREF=\"#MAIN\">PROGRAMA PRINCIPAL</A>");
        System.out.println("<A HREF=\"#\">INICIO PAGINA</A>");
    }

    public double getContTab(){
        this.tab = this.contTab * 1.25 ;
        return this.tab;
    }

    public void incTab(){
        this.contTab += 1;
    }

    public void decTab(){
        this.contTab -= 1;
    }
    public void add (String s){
        cabeceras.add(s);
    }

    public void fullAdd (String s){
        func_proc.add(s);
    }

    //public void prgAdd (String s) {prg_principal.add(s);}

    public String getTabulacion_final(){
        return tabulacion_final;
    }

    public String getCons_init(){
        return cons_init;
    }

    public String getCons_final(){
        return cons_final;
    }

    public String getReservadas_init(){
        return reservadas_init;
    }

    public String getReservadas_final(){
        return reservadas_final;
    }

    public String getIdentificadores_init(){
        return identificadores_init;
    }

    public String getIdentificadores_final(){
        return identificadores_final;
    }

    public String getString(){
        return prg_principal;
    }
    public void setString(String s){
        this.prg_principal=s;
    }
}