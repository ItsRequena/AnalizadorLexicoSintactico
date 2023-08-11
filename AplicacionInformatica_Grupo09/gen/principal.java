import java.awt.*;
import java.io.*;
import java.util.Collections;
import java.util.List;

import org.antlr.v4.runtime.*;

import javax.swing.*;

/*
El nombre ClasePrincipal es arbitrario, escoge el que prefieras.
Sustituye Numbers por el nombre del fichero que contiene la especificación de la gramática ANTLR
(extensión .g4)
*/
public class principal {

    public static void main(String[] args) {
        try{
// Preparar el fichero de entrada para asignarlo al analizador léxico
            CharStream input = CharStreams.fromFileName(args[0]);
// Crear el objeto correspondiente al analizador léxico con el fichero de
// entrada
            gramaticaLexer analex = new gramaticaLexer(input);
// Identificar al analizador léxico como fuente de tokens para el
// sintactico
            CommonTokenStream tokens = new CommonTokenStream(analex);

            Inicializar datos = new Inicializar();

// Crear el objeto correspondiente al analizador sintáctico
            gramaticaParser anasint = new gramaticaParser(tokens , datos);


            // Fichero de salida hmtl
            String fichero= args[0];
            String fichero_html= args[0]+".html";
            PrintStream out = new PrintStream(new FileOutputStream(fichero_html));
            // Imprimimos la salida en el fichero hmtl
            System.setOut(out);
            // Imprimimos el inicio del codigo HTML
            System.out.println("<!DOCTYPE html>");
            System.out.println("<html>");
            System.out.println("<head>");
            System.out.println("\t<title>"+fichero+"</title>");
            System.out.println("<style>");
            System.out.println("\t.ident {color: #39A6A3; font-weight: bold} ");
            System.out.println("\t.palres {color: #231E23; font-weight: bold }");
            System.out.println("\t.cte {color: #BF1363; font-weight: bold} </style>");
            System.out.println("</head>");
            System.out.println("<body>");
            System.out.println("<h1> Programa: "+fichero+"</h1>");

            anasint.axioma();
            // Imprimimos la salida del codigo HTML
            System.out.println("</body>");
            System.out.println("</html>");

        } catch (org.antlr.v4.runtime.RecognitionException e) {
//Fallo al reconocer la entrada
            System.err.println("REC " + e.getMessage());
        } catch (IOException e) {
//Fallo de entrada/salida
            System.err.println("IO " + e.getMessage());
        } catch (java.lang.RuntimeException e) {
//Cualquier otro fallo
            System.err.println("RUN " + e.getMessage());
        }
    }
}