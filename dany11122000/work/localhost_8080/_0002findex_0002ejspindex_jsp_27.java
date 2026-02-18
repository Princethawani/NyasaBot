import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Vector;
import org.apache.jasper.runtime.*;
import java.beans.*;
import org.apache.jasper.JasperException;


public class _0002findex_0002ejspindex_jsp_27 extends HttpJspBase {


    static {
    }
    public _0002findex_0002ejspindex_jsp_27( ) {
    }

    private static boolean _jspx_inited = false;

    public final void _jspx_init() throws JasperException {
    }

    public void _jspService(HttpServletRequest request, HttpServletResponse  response)
        throws IOException, ServletException {

        JspFactory _jspxFactory = null;
        PageContext pageContext = null;
        HttpSession session = null;
        ServletContext application = null;
        ServletConfig config = null;
        JspWriter out = null;
        Object page = this;
        String  _value = null;
        try {

            if (_jspx_inited == false) {
                _jspx_init();
                _jspx_inited = true;
            }
            _jspxFactory = JspFactory.getDefaultFactory();
            response.setContentType("text/html;charset=8859_1");
            pageContext = _jspxFactory.getPageContext(this, request, response,
			"", true, 8192, true);

            application = pageContext.getServletContext();
            config = pageContext.getServletConfig();
            session = pageContext.getSession();
            out = pageContext.getOut();

            // HTML // begin [file="C:\\index.jsp";from=(0,0);to=(20,3)]
                out.write("<html>\r\n\t<head>\r\n\t\r\n\t<!-- header - edit \"Data/yourHtmlHeader\" to customize -->\r\n\t<!-- contents - edit \"EventHandlers/Html file/onCreate\" to customize -->\r\n\t<meta name=\"generator\" content=\"ModelWorks IDE\">\r\n\t\r\n\t<title>DANY 2.01 by Jon Baer</title>\r\n\r\n\t</head>\r\n\t<body bgcolor=\"#ffffff\" onload=\"document.forms[0].text.focus()\">\r\n\t\t\r\n\t\t<table border=\"0\" cellpadding=\"20\"><tr><td>\r\n\t\t\t\t\t\r\n\t\t\t\t\t<img src=\"images/Dany.gif\"><br><br>\r\n\t\t\r\n\t\t<font size=\"3\" face=\"verdana,arial\">\r\n\t\tDany Version 2.01<br>\r\n\t\t\t\t\t\tPersonal Artificial Intelligent Bot\r\n\t\t\t\r\n\t\t\t");
            // end
            // begin [file="C:\\index.jsp";from=(20,5);to=(38,6)]
                 if (request.getParameter("virtual") == null) {
                				out.println("<br><br><b>Hi there! What's your name?</b>");
                			} else {
                				
                		String virtualip = request.getRemoteAddr();
                				
                		String output = "Cough.";
                				
                		try {
                					output = org.dany.core.Classifier.multiline_response("Hello", "localhost", new org.dany.core.GUIResponder());
                				}
                				catch (Exception e) {
                					out.println("<br><br><b>There was an error:</b> " + e + "<br><br>");
                				}
                				
                				out.println(output + "<br><br>");
                			}
                						
                						
            // end
            // HTML // begin [file="C:\\index.jsp";from=(38,8);to=(42,50)]
                out.write("\r\n\t\t\t\r\n\t\t\t<form method=\"get\" action=\"/\">\r\n\t\t\t\t\r\n\t\t\t\t\t\t\t<input type=\"hidden\" name=\"virtual\" value=\"");
            // end
            // begin [file="C:\\index.jsp";from=(42,53);to=(42,78)]
                out.print( request.getRemoteAddr() );
            // end
            // HTML // begin [file="C:\\index.jsp";from=(42,80);to=(56,0)]
                out.write("\">\r\n\t\t\t\t\t\t<input type=\"text\" size=\"30\" name=\"text\"> &nbsp; <input name=\"submit\" type=\"submit\" value=\"Reply\">\r\n\t\t\t\t\r\n\t\t\t</form>\r\n\t\t\t\r\n\t\t\t&copy Copyright 2000 - Jon Baer\r\n\t\t\t\r\n\t\t</font>\r\n\t\t\t\t\t\r\n\t\t\t\t</td></tr></table>\r\n\r\n\t</body>\r\n</html>\r\n\r\n");
            // end

        } catch (Exception ex) {
            if (out.getBufferSize() != 0)
                out.clearBuffer();
            pageContext.handlePageException(ex);
        } finally {
            out.flush();
            _jspxFactory.releasePageContext(pageContext);
        }
    }
}
