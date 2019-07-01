package org.apache.jsp.admin;

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<?php\n");
      out.write("session_start();\n");
      out.write("?>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"pt-br\">\n");
      out.write("\t<head>\n");
      out.write("\t\t<meta charset=\"utf-8\">\n");
      out.write("\t\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\t\t<title>Celke - Login</title>\n");
      out.write("\t\t<link href=\"css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("\t\t<link href=\"css/signin.css\" rel=\"stylesheet\">\n");
      out.write("\t</head>\n");
      out.write("\t<body>\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"form-signin\" style=\"background: #42dea4;\">\n");
      out.write("\t\t\t\t<h2 class=\"text-center\">Área restrita</h2>\n");
      out.write("\t\t\t\t<?php\n");
      out.write("\t\t\t\t\tif(isset($_SESSION['msg'])){\n");
      out.write("\t\t\t\t\t\techo $_SESSION['msg'];\n");
      out.write("\t\t\t\t\t\tunset($_SESSION['msg']);\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t\tif(isset($_SESSION['msgcad'])){\n");
      out.write("\t\t\t\t\t\techo $_SESSION['msgcad'];\n");
      out.write("\t\t\t\t\t\tunset($_SESSION['msgcad']);\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t?>\n");
      out.write("\t\t\t\t<form method=\"POST\" action=\"valida.php\">\n");
      out.write("\t\t\t\t\t<!--<label>Usuário</label>-->\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"usuario\" placeholder=\"Digite o seu usuário\" class=\"form-control\"><br>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<!--<label>Senha</label>-->\n");
      out.write("\t\t\t\t\t<input type=\"password\" name=\"senha\" placeholder=\"Digite a sua senha\" class=\"form-control\"><br>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<input type=\"submit\" name=\"btnLogin\" value=\"Acessar\" class=\"btn btn-success btn-block\">\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"row text-center\" style=\"margin-top: 20px;\"> \n");
      out.write("\t\t\t\t\t\t<h4>Você ainda não possui uma conta?</h4>\n");
      out.write("\t\t\t\t\t\t<a href=\"cadastrar.php\">Crie grátis</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\t\t\t\n");
      out.write("\t\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("\t\t<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\t</body>\n");
      out.write("</html>");
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
