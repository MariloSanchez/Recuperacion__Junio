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
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"estilo.css\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>DADOS</h1>\n");
      out.write("        ");
 
            
            String imagenUno = "";           
            String imagenDos = "";           
            String imagenTres = "";
            
            do{
                
                    switch((int)(Math.random() * 6) + 1){
                        case 0: imagenUno = "<img src='img/dado1.png'>";break;
                        case 1: imagenUno = "<img src='img/dado2.png'>";break;
                        case 2: imagenUno = "<img src='img/dado3.png'>";break;
                        case 3: imagenUno = "<img src='img/dado4.png'>";break;
                        case 4: imagenUno = "<img src='img/dado5.png'>";break;
                        case 5: imagenUno = "<img src='img/dado6.png'>";break;
                    }
                    
                    switch((int)(Math.random() * 6) + 1){
                        case 0: imagenDos = "<img src='img/dado1.png'>";break;
                        case 1: imagenDos = "<img src='img/dado2.png'>";break;
                        case 2: imagenDos = "<img src='img/dado3.png'>";break;
                        case 3: imagenDos = "<img src='img/dado4.png'>";break;
                        case 4: imagenDos = "<img src='img/dado5.png'>";break;
                        case 5: imagenDos = "<img src='img/dado6.png'>";break;
                    }
                    
                    switch((int)(Math.random() * 6) + 1){
                        case 0: imagenTres = "<img src='img/dado1.png'>";break;
                        case 1: imagenTres = "<img src='img/dado2.png'>";break;
                        case 2: imagenTres = "<img src='img/dado3.png'>";break;
                        case 3: imagenTres = "<img src='img/dado4.png'>";break;
                        case 4: imagenTres = "<img src='img/dado5.png'>";break;
                        case 5: imagenTres = "<img src='img/dado6.png'>";break;
                    }
                    out.print(imagenUno);
                    out.print(imagenDos);
                    out.print(imagenTres);
                    out.print ("<br>");
                
            }while ( (imagenUno != imagenDos) && (imagenUno != imagenTres) && (imagenDos != imagenTres) );
        
      out.write("\n");
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
