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
      out.write("        <title>CIELO</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div style=\"text-align: center\">\n");
      out.write("            <table>\n");
      out.write("\n");
      out.write("                ");

                    int sol = 1;
                    for (int i = 0; i < 10; i++){
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("\n");
      out.write("                    ");

                        for(int j = 0; j < 10; j++){
                    
      out.write("\n");
      out.write("\n");
      out.write("                    <td>       \n");
      out.write("                        ");

                        int numeroImagen = (int)(Math.random() * 10) ;
                        String imagen = " ";
                        switch( numeroImagen ){
                                case 0: imagen = "<img src='imagenes/avion.png'>"; break;
                                case 1: imagen = "<img src='imagenes/nube.png'>"; break;
                                case 2: imagen = "<img src='imagenes/pajaro.png'>"; break;
                                case 3: imagen = "<img src='imagenes/platillo.png'>"; break;
                                case 4: if(sol == 1){
                                            imagen = "<img src='imagenes/sol.png'>";
                                            sol++;  out.print(sol);
                                        } 
                                break;
                                case 5: imagen = (" "); break;
                                case 6: imagen = (" "); break;
                                case 7: imagen = (" "); break;
                                case 8: imagen = (" "); break;
                                case 9: imagen = (" "); break;
                            }
                            out.print(numeroImagen  + imagen);
                        
      out.write("\n");
      out.write("                    </td>\n");
      out.write("\n");
      out.write("                       ");
 }//segundo for 
      out.write("\n");
      out.write("                </tr>\n");
      out.write("                  ");
 }//primer for 
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
