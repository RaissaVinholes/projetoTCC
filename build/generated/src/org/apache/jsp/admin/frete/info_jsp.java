package org.apache.jsp.admin.frete;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class info_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/admin/frete/../cabecalho.jsp");
    _jspx_dependants.add("/admin/frete/../rodape.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
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

      out.write('\n');
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"utf-8\" />\n");
      out.write("  <link rel=\"apple-touch-icon\" sizes=\"76x76\" href=\"../assets/img/apple-icon.png\">\n");
      out.write("  <link rel=\"icon\" type=\"image/png\" href=\"../assets/img/favicon.png\">\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\n");
      out.write("  <title>\n");
      out.write("    Gerenciamento de Transportadora\n");
      out.write("  </title>\n");
      out.write("  <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no' name='viewport' />\n");
      out.write("  <!--     Fonts and icons     -->\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,700,200\" rel=\"stylesheet\" />\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.7.1/css/all.css\" integrity=\"sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr\" crossorigin=\"anonymous\">\n");
      out.write("  <!-- CSS Files -->\n");
      out.write("  <link href=\"../assets/css/bootstrap.min.css\" rel=\"stylesheet\" />\n");
      out.write("  <link href=\"../assets/css/now-ui-dashboard.css?v=1.3.0\" rel=\"stylesheet\" />\n");
      out.write("  <!-- CSS Just for demo purpose, don't include it in your project -->\n");
      out.write("  <link href=\"../assets/demo/demo.css\" rel=\"stylesheet\" />\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body class=\"\">\n");
      out.write("  <div class=\"wrapper \">\n");
      out.write("    <div class=\"sidebar\" data-color=\"orange\">\n");
      out.write("      <!--\n");
      out.write("        Tip 1: You can change the color of the sidebar using: data-color=\"blue | green | orange | red | yellow\"\n");
      out.write("    -->\n");
      out.write("      <div class=\"logo\">\n");
      out.write("        <a href=\"http://www.creative-tim.com\" class=\"simple-text logo-mini\">\n");
      out.write("          \n");
      out.write("        </a>\n");
      out.write("        <a href=\"http://www.creative-tim.com\" class=\"simple-text logo-normal\">\n");
      out.write("          Transportadora\n");
      out.write("        </a>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"sidebar-wrapper\" id=\"sidebar-wrapper\">\n");
      out.write("        <ul class=\"nav\">\n");
      out.write("          <li > <!--class=\"active \"-->\n");
      out.write("            <a href=\"./../frete/index.jsp\">\n");
      out.write("              <i class=\"now-ui-icons design_app\"></i>\n");
      out.write("              <p>Frete</p>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("              <a href=\"./../cliente/index.jsp\">\n");
      out.write("              <i class=\"now-ui-icons users_single-02\"></i>\n");
      out.write("           <!-- <a href=\"./icons.html\">\n");
      out.write("              <i class=\"now-ui-icons education_atom\"></i>-->\n");
      out.write("              <p>Cliente</p>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("            <a href=\"./../motorista/index.jsp\">\n");
      out.write("              <i class=\"now-ui-icons business_badge\"></i>\n");
      out.write("              <p>Motorista</p>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("            <a href=\"./../funcionario/index.jsp\">\n");
      out.write("              <i class=\"now-ui-icons business_badge\"></i>\n");
      out.write("              <p>Funcionário</p>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("            <a href=\"./../caminhao/index.jsp\">\n");
      out.write("              <i class=\"now-ui-icons shopping_delivery-fast\"></i>\n");
      out.write("              <p>Caminhão</p>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("            <a href=\"./../manutencao/index.jsp\">\n");
      out.write("              <i class=\"now-ui-icons ui-2_settings-90\"></i>\n");
      out.write("              <p>Manutenção</p>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <!--<li class=\"active-pro\">\n");
      out.write("            <a href=\"./upgrade.html\">\n");
      out.write("              <i class=\"now-ui-icons arrows-1_cloud-download-93\"></i>\n");
      out.write("              <p>Upgrade to PRO</p>\n");
      out.write("            </a>\n");
      out.write("          </li>-->\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"main-panel\" id=\"main-panel\">\n");
      out.write("      <!-- Navbar -->\n");
      out.write("      <nav class=\"navbar navbar-expand-lg navbar-transparent  bg-primary  navbar-absolute\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("          <div class=\"navbar-wrapper\">\n");
      out.write("            <div class=\"navbar-toggle\">\n");
      out.write("              <button type=\"button\" class=\"navbar-toggler\">\n");
      out.write("                <span class=\"navbar-toggler-bar bar1\"></span>\n");
      out.write("                <span class=\"navbar-toggler-bar bar2\"></span>\n");
      out.write("                <span class=\"navbar-toggler-bar bar3\"></span>\n");
      out.write("              </button>\n");
      out.write("            </div>\n");
      out.write("            <a class=\"navbar-brand\" href=\"#pablo\">Seja bem vindo, Administrador !</a>\n");
      out.write("          </div>\n");
      out.write("          <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navigation\" aria-controls=\"navigation-index\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("            <span class=\"navbar-toggler-bar navbar-kebab\"></span>\n");
      out.write("            <span class=\"navbar-toggler-bar navbar-kebab\"></span>\n");
      out.write("            <span class=\"navbar-toggler-bar navbar-kebab\"></span>\n");
      out.write("          </button>\n");
      out.write("          <div class=\"collapse navbar-collapse justify-content-end\" id=\"navigation\">\n");
      out.write("            <form>\n");
      out.write("              <div class=\"input-group no-border\">\n");
      out.write("                <input type=\"text\" value=\"\" class=\"form-control\" placeholder=\"Pesquisar...\">\n");
      out.write("                <div class=\"input-group-append\">\n");
      out.write("                  <div class=\"input-group-text\">\n");
      out.write("                    <i class=\"now-ui-icons ui-1_zoom-bold\"></i>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </form>\n");
      out.write("            <ul class=\"navbar-nav\">\n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"#pablo\">\n");
      out.write("                  <i class=\"now-ui-icons media-2_sound-wave\"></i>\n");
      out.write("                  <p>\n");
      out.write("                    <span class=\"d-lg-none d-md-block\">Stats</span>\n");
      out.write("                  </p>\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"nav-item dropdown\">\n");
      out.write("                <a class=\"nav-link dropdown-toggle\" id=\"navbarDropdownMenuLink\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                  <i class=\"now-ui-icons location_world\"></i>\n");
      out.write("                  <p>\n");
      out.write("                    <span class=\"d-lg-none d-md-block\">Some Actions</span>\n");
      out.write("                  </p>\n");
      out.write("                </a>\n");
      out.write("                <div class=\"dropdown-menu dropdown-menu-right\" aria-labelledby=\"navbarDropdownMenuLink\">\n");
      out.write("                  <a class=\"dropdown-item\" href=\"#\">Action</a>\n");
      out.write("                  <a class=\"dropdown-item\" href=\"#\">Another action</a>\n");
      out.write("                  <a class=\"dropdown-item\" href=\"#\">Something else here</a>\n");
      out.write("                </div>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"#pablo\">\n");
      out.write("                  <i class=\"now-ui-icons users_single-02\"></i>\n");
      out.write("                  <p>\n");
      out.write("                    <span class=\"d-lg-none d-md-block\">Account</span>\n");
      out.write("                  </p>\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </nav>\n");
      out.write("      <!-- End Navbar -->\n");
      out.write("       <div class=\"panel-header panel-header-sm\">\n");
      out.write("      </div>");
      out.write("\n");
      out.write("<!-- FORMA PARA MOSTRAR AS INFORMAÇÕES DOS FRETES-->\n");
      out.write("<div class=\"content\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-md-12\">\n");
      out.write("            <div class=\"card\">\n");
      out.write("    <div class=\"card-header\">\n");
      out.write("        \n");
      out.write("        <h5 class=\"title\">Informações do Frete </h5>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("                \n");
      out.write("                <div class=\"col-md-10 pr-md-1\" style=\"text-align: right\">\n");
      out.write("                                <a class=\"fa fa-trash fa-2x pull fa-border\" href=\"index.jsp\"> <!--btn btn-info btn-fab btn-icon btn-round // LivroWS?acao=edit&id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${obj.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("-->\n");
      out.write("                <i class=\"tim-icons icon-pencil\"></i>\n");
      out.write("            </a>\n");
      out.write("                           \n");
      out.write("                                <a class=\"fa fa-edit fa-2x pull fa-border\" href=\"edita.jsp\"> <!--btn btn-info btn-fab btn-icon btn-round // LivroWS?acao=edit&id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${obj.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("-->\n");
      out.write("                <i class=\"tim-icons icon-pencil\" ></i>\n");
      out.write("            </a>\n");
      out.write("            </div>\n");
      out.write("   <div class=\"card-body\">\n");
      out.write("        <!--MODIFICAR PARA ADD-->\n");
      out.write("       <div class=\"row\">\n");
      out.write("                <div class=\"col-md-3 pr-md-1\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label>Id</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"txtId\" placeholder=\"Id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${obj.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-5 pr-md-1\"> <!--class=\"col-md-5 pr-md-1\"-->\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label>Cliente</label>\n");
      out.write("                        <select class=\"form-control\" name=\"txtCliente\">\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </select> \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                 <div class=\"col-md-5 pr-md-1\"> <!--class=\"col-md-5 pr-md-1\"-->\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label>Caminhão</label>\n");
      out.write("                        <select class=\"form-control\" name=\"txtCaminhao\">\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </select> \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("            <div class=\"row\">\n");
      out.write("                 <div class=\"col-md-5 pr-md-1\"> <!--class=\"col-md-5 pr-md-1\"-->\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label>Motorista</label>\n");
      out.write("                        <select class=\"form-control\" name=\"txtMotorista\">\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </select> \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                 <div class=\"col-md-5 pr-md-1\"> <!--class=\"col-md-5 pr-md-1\"-->\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label>Funcionários</label>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                        <select class=\"form-control\" name=\"txtFuncionario1\">\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </select> \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                        <select class=\"form-control\" name=\"txtFuncionario2\">\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </select> \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("             <div class=\"row\">\n");
      out.write("                <div class=\"col-md-10\"> <!--class=\"col-md-5 pr-md-1\"-->\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label>Destino da carga</label>\n");
      out.write("                        <input type=\"text\" name=\"txtDestinoCarga\" required class=\"form-control\" readonly >\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                \n");
      out.write("                <div class=\"col-md-5 pr-md-1\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label>Tipo de carga</label>\n");
      out.write("                        <input type=\"text\" name=\"txtTipoCarga\" required class=\"form-control\" readonly>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-5 pr-md-1\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label>Quilometragem percorrida</label>\n");
      out.write("                        <input type=\"text\" name=\"txtKmPercorrida\" required class=\"form-control\" readonly>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-5 pr-md-1\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label>Data de entrega</label>\n");
      out.write("                        <input type=\"date\" name=\"txtDataEntrega\" required class=\"form-control\" readonly>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-5 pr-md-1\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                        <label>Forma de Pagamento</label>\n");
      out.write("                        <input type=\"text\" name=\"txtFormaPagamento\" required class=\"form-control\" readonly>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                \n");
      out.write("                <div class=\"col-md-5 pr-md-1\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label>Horário da entrega</label>\n");
      out.write("                        <input type=\"text\" name=\"txtHorarioEntrega\" required class=\"form-control\" readonly>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-5 pr-md-1\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label>Valor</label>\n");
      out.write("                        <input type=\"text\" name=\"txtValor\" required class=\"form-control\" readonly>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            \n");
      out.write("            </div>\n");
      out.write("        <a class=\"btn btn-primary btn-round text-center\" href=\"index.jsp\"><!--AdminWS?acao=list-->\n");
      out.write("                <i class=\"tim-icons icon-bullet-list-67\"></i> Listar\n");
      out.write("            </a>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"card-footer\">\n");
      out.write("         \n");
      out.write("        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    ");
      out.write("<footer class=\"footer\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("          <nav>\n");
      out.write("            <ul>\n");
      out.write("              <li>\n");
      out.write("                <a href=\"https://www.creative-tim.com\">\n");
      out.write("                  Creative Tim\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("              <li>\n");
      out.write("                <a href=\"http://presentation.creative-tim.com\">\n");
      out.write("                  About Us\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("              <li>\n");
      out.write("                <a href=\"http://blog.creative-tim.com\">\n");
      out.write("                  Blog\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("            </ul>\n");
      out.write("          </nav>\n");
      out.write("          <div class=\"copyright\" id=\"copyright\">\n");
      out.write("            &copy;\n");
      out.write("            <script>\n");
      out.write("              document.getElementById('copyright').appendChild(document.createTextNode(new Date().getFullYear()))\n");
      out.write("            </script>, Designed by\n");
      out.write("            <a href=\"https://www.invisionapp.com\" target=\"_blank\">Invision</a>. Coded by\n");
      out.write("            <a href=\"https://www.creative-tim.com\" target=\"_blank\">Creative Tim</a>.\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </footer>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <!--   Core JS Files   -->\n");
      out.write("  <script src=\"../assets/js/core/jquery.min.js\"></script>\n");
      out.write("  <script src=\"../assets/js/core/popper.min.js\"></script>\n");
      out.write("  <script src=\"../assets/js/core/bootstrap.min.js\"></script>\n");
      out.write("  <script src=\"../assets/js/plugins/perfect-scrollbar.jquery.min.js\"></script>\n");
      out.write("  <!--  Google Maps Plugin    -->\n");
      out.write("  <script src=\"https://maps.googleapis.com/maps/api/js?key=YOUR_KEY_HERE\"></script>\n");
      out.write("  <!-- Chart JS -->\n");
      out.write("  <script src=\"../assets/js/plugins/chartjs.min.js\"></script>\n");
      out.write("  <!--  Notifications Plugin    -->\n");
      out.write("  <script src=\"../assets/js/plugins/bootstrap-notify.js\"></script>\n");
      out.write("  <!-- Control Center for Now Ui Dashboard: parallax effects, scripts for the example pages etc -->\n");
      out.write("  <script src=\"../assets/js/now-ui-dashboard.min.js?v=1.3.0\" type=\"text/javascript\"></script>\n");
      out.write("  <!-- Now Ui Dashboard DEMO methods, don't include it in your project! -->\n");
      out.write("  <script src=\"../assets/demo/demo.js\"></script>\n");
      out.write("  <script>\n");
      out.write("    $(document).ready(function() {\n");
      out.write("      // Javascript method's body can be found in assets/js/demos.js\n");
      out.write("      demo.initDashboardPageCharts();\n");
      out.write("\n");
      out.write("    });\n");
      out.write("  </script>\n");
      out.write("</body>\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cliente}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("obj");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${obj.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${obj.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${caminhao}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("obj");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${obj.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${obj.modelo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${motorista}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setVar("obj");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${obj.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${obj.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent(null);
    _jspx_th_c_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${funcionario}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_3.setVar("obj");
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${obj.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${obj.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_3.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_3);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_4 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_4.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_4.setParent(null);
    _jspx_th_c_forEach_4.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${funcionario}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_4.setVar("obj");
    int[] _jspx_push_body_count_c_forEach_4 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_4 = _jspx_th_c_forEach_4.doStartTag();
      if (_jspx_eval_c_forEach_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${obj.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${obj.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_4.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_4);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty msg}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            <div class=\"alert alert-primary alert-dismissible fade show\" role=\"alert\">\n");
        out.write("                ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${msg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\">\n");
        out.write("                    <i class=\"tim-icons icon-simple-remove\"></i>\n");
        out.write("                </button>\n");
        out.write("            </div>\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }
}
