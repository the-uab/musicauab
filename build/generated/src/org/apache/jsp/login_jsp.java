package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"/>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1.0, user-scalable=no\"/>\n");
      out.write("        <title>Iniciar Sesión</title>\n");
      out.write("        <link rel=\"shortcut icon\" href=\"img/login.png\">\n");
      out.write("\n");
      out.write("        <!-- CSS  -->\n");
      out.write("        <link href=\"css/css/materialize.css\" type=\"text/css\" rel=\"stylesheet\" media=\"screen,projection\"/>\n");
      out.write("        <link href=\"css/css/style.css\" type=\"text/css\" rel=\"stylesheet\" media=\"screen,projection\"/>\n");
      out.write("        <link href=\"css/css/font-awesome/css/font-awesome.min.css\" type=\"text/css\" rel=\"stylesheet\" media=\"screen,projection\"/>\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $('#submit').click(function (event) {\n");
      out.write("                    var username = $('#username').val();\n");
      out.write("                    var password = $('#password').val();\n");
      out.write("                    // Si en vez de por post lo queremos hacer por get, cambiamos el $.post por $.get\n");
      out.write("                    $.post('login.do', {\n");
      out.write("                        username: username,\n");
      out.write("                        password: password\n");
      out.write("                    }, function (responseText) {\n");
      out.write("                        $('#tabla').html(responseText);\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <div class=\"navbar\">\n");
      out.write("                <nav class=\"orange\" role=\"navigation\">\n");
      out.write("                    <div class=\"nav-wrapper container\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <ul class=\"right hide-on-med-and-down\">\n");
      out.write("                            <a id=\"logo-container\" href=\"index.jsp\" class=\"brand-logo center\">\n");
      out.write("                                Instituto de Musica UAB\n");
      out.write("                            </a>\n");
      out.write("                        </ul>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col s12 m6 offset-m3\">\n");
      out.write("                    <div class=\"card z-depth-4\">\n");
      out.write("                        <div class=\"card-content\">\n");
      out.write("                            <span class=\"card-title black-text\">Inicio Sesión</span>\n");
      out.write("                            <br>\n");
      out.write("                            <form method=\"POST\" class=\"responsive\" action=\"login.do\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"input-field col s12\">\n");
      out.write("                                        <input name=\"username\" type=\"text\" class=\"validate\" required>\n");
      out.write("                                        <label for=\"text\">Usuario</label>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"input-field col s12\">\n");
      out.write("                                        <input name=\"password\" type=\"password\" class=\"validate\" required>\n");
      out.write("                                        <label for=\"password\">Contraseña</label>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <input type=\"hidden\" name=\"datos\" value=\"1\">\n");
      out.write("                                <div class=\"card-action center\">\n");
      out.write("                                    <input type=\"submit\" id=\"submit\" class=\"btn\" value=\"Ingresar\">\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                            <div id=\"tabla\"></div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!--  Scripts-->\n");
      out.write("    </body>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <footer class=\"page-footer orange lighten-2\">\n");
      out.write("        <div class=\"footer-copyright\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                © 2017 Copyright \n");
      out.write("                <a class=\"grey-text text-lighten-4 right\" href=\"#!\">EliasSauer</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </footer>\n");
      out.write("    <script src=\"css/js/jquery.min.js\"></script>\n");
      out.write("    <script src=\"css/js/materialize.min.js\"></script>\n");
      out.write("    <script src=\"css/js/init.js\"></script>\n");
      out.write("</html>\n");
      out.write("\n");
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
