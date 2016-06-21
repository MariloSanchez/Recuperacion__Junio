package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"estilo.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <h1  style=\"text-align: center\">Versión JSP</h1>\n");
      out.write("        </header>\n");
      out.write("        \n");
      out.write("        <br><br><br>\n");
      out.write("        \n");
      out.write("        <h3 style=\"margin-left: 20%\">Pinto de rojo el máximo y de verde el mínimo</h3>\n");
      out.write("        \n");
      out.write("        <div class=\"centro\">         \n");
      out.write("            ");

                //Genera el array
                   int[][] num = new int[5][8];
                   int fila;
                   int columna;

                   for(fila = 0; fila < 5; fila++) {//Fila
                       for(columna = 0; columna < 8; columna++) {//Columna
                           num [fila][columna] = (int)(Math.random()*200) + 100;
                        }
                   }


                //Calculo los maximos, minimos y el numero de sus filas 
               int min = Integer.MAX_VALUE;
               int max = Integer.MIN_VALUE;
               int filaMinimo = 0;
               int filaMaximo = 0;

               System.out.println();  

               for(fila = 0; fila < 5; fila++) {//recorro el array
                   for(columna = 0; columna < 8; columna++){
                       if(num[fila][columna] > max){//Descubro el maximo
                           max = num[fila][columna];
                           filaMaximo = fila;//guardo el numero de la fila en una variable
                       }         
                       if(num[fila][columna] < min){//Descubro el minimo
                           min = num[fila][columna];  
                           filaMinimo = fila;//guardo el numero de la fila en una variable
                       }
                   }
               }

                //Muestro array
                for(fila = 0; fila < 5; fila++) {//Fila
                    for(columna = 0; columna < 8; columna++) {//Columna
                        if(num[fila][columna] == num[filaMinimo][columna] ){
                            out.print("<span id='verde'>");
                            out.print( num[filaMinimo][columna] + "   ");
                            out.print("</span>");
                        }else if(num[fila][columna] == num[filaMaximo][columna]){
                            out.print("<span id='rojo'>");
                            out.print( num[filaMaximo][columna] + "   ");
                            out.print("</span>");
                        }else{
                            out.print(num[fila][columna] + "   ");
                        }                       
                    }
                    out.println("<br>");
                }
            
            
      out.write("\n");
      out.write("            \n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            ");


                   out.print("El minimo es: " + min  + " y aparece en la siguiente fila: ");
                   for (int j = 0; j < 8; j++){
                      out.print(num[filaMinimo][j]+ "|");
                   }
                   
                   out.print("<br>");
                   out.print("**********************************************");
                   out.print("<br>");

                   out.print("El máximo es: " + max + " y aparece en la siguiente fila: ");
                   out.print("<br>");
                   for (int j = 0; j < 8; j++){
                       out.print(num[filaMaximo][j]+ "|");
                   }
               
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
