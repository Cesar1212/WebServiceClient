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
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>Conversión grados C <--> F</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div align=\"center\">\n");
      out.write("    <!--Invocar al servicio web-->\n");
      out.write("        ");
      out.write("<hr/>\n");
      out.write("    ");

    try {
	jaxws.SWConvertTemps_Service service = new jaxws.SWConvertTemps_Service();
	jaxws.SWConvertTemps port = service.getSWConvertTempsPort();
	 // TODO initialize WS operation arguments here
	double gCent = 0.0d;
	// TODO process result here
	java.lang.Double result = port.convCentAFahr(gCent);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    
      out.write("\n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("    ");

    try {
	jaxws.SWConvertTemps_Service service = new jaxws.SWConvertTemps_Service();
	jaxws.SWConvertTemps port = service.getSWConvertTempsPort();
	 // TODO initialize WS operation arguments here
	double gFahr = 0.0d;
	// TODO process result here
	java.lang.Double result = port.convFahrACent(gFahr);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("    <hr/>\n");
      out.write("    <hr/>\n");
      out.write("    <form style=\"font-family:arial\">\n");
      out.write("        Grados:<br>\n");
      out.write("        <input type=\"text\" name=\"ctGrados\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${result}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" style=\"text-align:right\"/><br><br>\n");
      out.write("        <input type=\"submit\" value=\"Convertir\" name=\"btConvertir\"/><br><br>\n");
      out.write("        <input type=\"radio\" name=\"bgGrados\" value=\"aFahr\" checked=\"true\"/>\n");
      out.write("        Centigrados a Fahrenheit<br>\n");
      out.write("        <input type=\"radio\" name=\"bgGrados\" value=\"aCent\"/>\n");
      out.write("        Fahrenheit a Centrigados<br>\n");
      out.write("    </form>\n");
      out.write("    <hr/>\n");
      out.write("    </div>\n");
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
