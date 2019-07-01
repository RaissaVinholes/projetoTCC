package org.apache.jsp.admin.frete;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/admin/frete/../cabecalho.jsp");
    _jspx_dependants.add("/admin/frete/../rodape.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("<!-- TABLE PARA MOSTRAR O RESUMO DOS FRETES-->\n");
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("   <div class=\"content\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-md-12\">\n");
      out.write("            <div class=\"card\">\n");
      out.write("              <div class=\"card-header\">\n");
      out.write("                <h5 class=\"title\">Lista de Fretes</h5>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"card-body\">\n");
      out.write("                <div class=\"table-responsive\">\n");
      out.write("                  <table class=\"table\">\n");
      out.write("                    <thead class=\" text-primary\">\n");
      out.write("                     <th>\n");
      out.write("                       ID\n");
      out.write("                     </th>\n");
      out.write("                     <th>\n");
      out.write("                        Cliente\n");
      out.write("                      </th>\n");
      out.write("                      <th>\n");
      out.write("                        Caminhão\n");
      out.write("                      </th>\n");
      out.write("                      <th>\n");
      out.write("                        Tipo de Carga\n");
      out.write("                      </th>\n");
      out.write("                      <th > <!--class=\"text-right\"-->\n");
      out.write("                        Data de entrega\n");
      out.write("                      </th>\n");
      out.write("                      <th>\n");
      out.write("                        Informações\n");
      out.write("                      </th>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                         <tr>\n");
      out.write("                            <td>1</td> <!---->\n");
      out.write("                            <td>raissa</td> <!---->\n");
      out.write("                            <td>F-4000</td><!---->\n");
      out.write("                            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${obj.tipoCarga}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td><!---->\n");
      out.write("                            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${obj.dataEntrega}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td><!---->\n");
      out.write("                            <td>\n");
      out.write("                                <a class=\"now-ui-icons travel_info\" href=\"info.jsp\"><!--AdminWS?acao=edit&id= obj.id -->\n");
      out.write("                                    <i class=\"tim-icons icon-pencil\"></i>\n");
      out.write("                                </a>\n");
      out.write("                            </td>\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("        \n");
      out.write("                </tbody>\n");
      out.write("                  </table>\n");
      out.write("                </div>\n");
      out.write("                   <a class=\"now-ui-icons ui-1_simple-add\" href=\"add.jsp\">\n");
      out.write("            <i class=\"tim-icons icon-pencil\"> </i> Adiciona\n");
      out.write("        </a>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
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
      out.write("\n");
      out.write("                            ");
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("obj");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                       \n");
          out.write("                    ");
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
}
