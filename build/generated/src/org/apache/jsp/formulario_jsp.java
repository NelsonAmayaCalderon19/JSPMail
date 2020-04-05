package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class formulario_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("        <title>HTML5 y CSS Formulario de Contacto</title>\n");
      out.write("<link href=\"css/estilos.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("     <div class=\"container\">\n");
      out.write("          <form class=\"contact_form\" action=\"Control?menu=Mensaje\" method=\"POST\" id=\"data\" >\n");
      out.write("<div>\n");
      out.write("<ul>\n");
      out.write("<li>\n");
      out.write("<h2>Contactos</h2>\n");
      out.write("<span class=\"required_notification\">* Datos requeridos</span>\n");
      out.write("</li>\n");
      out.write("<li>\n");
      out.write("<label for=\"name\">Id:</label>\n");
      out.write("<input type=\"text\" name=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensaje.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"1\"  />\n");
      out.write("</li>\n");
      out.write("<li>\n");
      out.write("<label for=\"name\">Nombre:</label>\n");
      out.write("<input type=\"text\" name=\"nombre\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensaje.getNombre()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"Nelson Amaya Calderon\"  />\n");
      out.write("</li>\n");
      out.write("<li>\n");
      out.write("<label for=\"email\">Email:</label>\n");
      out.write("<input type=\"email\" name=\"email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensaje.getEmail()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"ejemplo@algo.com\"  />\n");
      out.write("<span class=\"form_hint\">Formato correcto: \"nombre@algo.com\"</span>\n");
      out.write("</li>\n");
      out.write("<li>\n");
      out.write("<label for=\"website\">Sitio web:</label>\n");
      out.write("<input type=\"url\" name=\"website\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensaje.getSitio()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"http://loquesea.com\"  pattern=\"(http|https)://.+\" />\n");
      out.write("<span class=\"form_hint\">Formato correcto: \"http://algo.com\"</span>\n");
      out.write("</li>\n");
      out.write("<li>\n");
      out.write("<label for=\"message\">Mensaje:</label>\n");
      out.write("<textarea name=\"message\" cols=\"40\" rows=\"6\" >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensaje.getMensaje()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</textarea>\n");
      out.write("</li>\n");
      out.write("<li>\n");
      out.write("     <input  type=\"submit\"  name=\"accion\" value=\"Enviar\" class=\"btn btn-info\">\n");
      out.write("                    <input type=\"submit\"  name=\"accion\" value=\"Buscar\" class=\"btn btn-success\">              \n");
      out.write("            \n");
      out.write("\n");
      out.write("</li>\n");
      out.write("</ul>\n");
      out.write("</div>\n");
      out.write("</form>\n");
      out.write("      </div>\n");
      out.write("      \n");
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
