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
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("  <title>Lorahost hosting - Home</title>\n");
      out.write("\t<link rel=\"icon\" href=\"lr/img/Fevicon.png\" type=\"image/png\">\n");
      out.write("\n");
      out.write("  <link rel=\"stylesheet\" href=\"lr/vendors/bootstrap/bootstrap.min.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"lr/vendors/themify-icons/themify-icons.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"lr/vendors/owl-carousel/owl.theme.default.min.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"lr/vendors/owl-carousel/owl.carousel.min.css\">\n");
      out.write("\n");
      out.write("  <link rel=\"stylesheet\" href=\"lr/css/style.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("  <!--================ Header Menu Area start =================-->\n");
      out.write("  <header class=\"header_area\">\n");
      out.write("    <div class=\"main_menu\">\n");
      out.write("      <nav class=\"navbar navbar-expand-lg navbar-light\">\n");
      out.write("        <div class=\"container box_1620\">\n");
      out.write("          <a class=\"navbar-brand logo_h\" href=\"index.html\"><img src=\"lr/img/sobiadLogo10.png\" alt=\"\"></a>\n");
      out.write("          <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("          </button>\n");
      out.write("\n");
      out.write("          <div class=\"collapse navbar-collapse offset\" id=\"navbarSupportedContent\">\n");
      out.write("            <ul class=\"nav navbar-nav menu_nav justify-content-end\">\n");
      out.write("              <li class=\"nav-item active\"><a class=\"nav-link\" href=\"index.html\">Ana Sayfa</a></li> \n");
      out.write("              <li class=\"nav-item\"><a class=\"nav-link\" href=\"feature.html\">Hakkımızda</a></li> \n");
      out.write("              <li class=\"nav-item\"><a class=\"nav-link\" href=\"service.html\">İletişim</a>\n");
      out.write("              <li class=\"nav-item\"><a class=\"nav-link\" href=\"pricing.html\">Pricing</a>\n");
      out.write("              <li class=\"nav-item submenu dropdown\">\n");
      out.write("                <a href=\"#\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\"\n");
      out.write("                  aria-expanded=\"false\">Pages</a>\n");
      out.write("                <ul class=\"dropdown-menu\">\n");
      out.write("                  <li class=\"nav-item\"><a class=\"nav-link\" href=\"blog.html\">Single Blog</a>                 \n");
      out.write("                  <li class=\"nav-item\"><a class=\"nav-link\" href=\"blog-details.html\">Blog Details</a>                 \n");
      out.write("                </ul>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("              <li class=\"nav-item\"><a class=\"nav-link\" href=\"contact.html\">Contact</a></li>\n");
      out.write("            </ul>\n");
      out.write("              \n");
      out.write("\n");
      out.write("            <div class=\"nav-right text-center text-lg-right py-4 py-lg-0\">\n");
      out.write("            \n");
      out.write("             <div class=\"btn-group\" role=\"group\">\n");
      out.write("    <button id=\"btnGroupDrop1\" type=\"button\" class=\"btn btn-secondary dropdown-toggle\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("      Oturum Aç\n");
      out.write("    </button>\n");
      out.write("    <div class=\"dropdown-menu\" aria-labelledby=\"btnGroupDrop1\">\n");
      out.write("      <a class=\"dropdown-item\" href=\"login.jsp\">Giriş Yap</a>\n");
      out.write("      <a class=\"dropdown-item\" href=\"Kullanıcıkayıt.jsp\">Kayıt Ol</a>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("            </div>\n");
      out.write("          </div> \n");
      out.write("        </div>\n");
      out.write("      </nav>\n");
      out.write("    </div>\n");
      out.write("  </header>\n");
      out.write("  <!--================Header Menu Area =================-->\n");
      out.write("\n");
      out.write("\n");
      out.write("  <!--================ Banner Section start =================-->\n");
      out.write("  <section class=\"hero-banner text-center\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      \n");
      out.write("      <h1>SOBİAD</h1>\n");
      out.write("     \n");
      out.write("    </div>\n");
      out.write("  </section>\n");
      out.write("  <!--================ Banner Section end =================-->\n");
      out.write("\n");
      out.write("  </body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\n");
      out.write(" \t <!-- gerekli kodlar-->\n");
      out.write("\t\t\t <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n");
      out.write(" \n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write(" \n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("   \n");
      out.write("</body>\n");
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
