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


public class _0002findex_0002ejspindex_jsp_13 extends HttpJspBase {


    static {
    }
    public _0002findex_0002ejspindex_jsp_13( ) {
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

            // HTML // begin [file="C:\\index.jsp";from=(0,0);to=(19,3)]
                out.write("<html>\r\n\t<head>\r\n\t\r\n\t<!-- header - edit \"Data/yourHtmlHeader\" to customize -->\r\n\t<!-- contents - edit \"EventHandlers/Html file/onCreate\" to customize -->\r\n\t<meta name=\"generator\" content=\"ModelWorks IDE\">\r\n\t\r\n\t<title>DANY</title>\r\n\r\n\t</head>\r\n\t<body>\r\n\t\t\r\n\t\t<table border=\"0\" cellpadding=\"20\"><tr><td>\r\n\t\t\t\t\t\r\n\t\t\t\t\t<img src=\"images/Dany.gif\"><br><br>\r\n\t\t\r\n\t\t<font size=\"3\" face=\"verdana,arial\">\r\n\t\tDany Version 2.01\r\n\t\t\t\r\n\t\t\t");
            // end
            // begin [file="C:\\index.jsp";from=(19,5);to=(35,6)]
                 if (request.getParameter("text") == null) {
                				out.println("<br><br><b>What's your name?</b>");
                			} else {
                				
                		String virtualip = request.getRemoteAddr();
                				String output = "Cough.";
                		try {
                					output = org.dany.core.Classifier.multiline_response(request.getParameter("text"), virtualip, new org.dany.core.HTMLResponder());
                				}
                				catch (Exception e) {
                					out.println(e);
                				}
                				
                				out.println(output);
                			}
                						
                						
            // end
            // HTML // begin [file="C:\\index.jsp";from=(35,8);to=(39,50)]
                out.write("\r\n\t\t\t\r\n\t\t\t<form method=\"get\" action=\"/\">\r\n\t\t\t\t\r\n\t\t\t\t\t\t\t<input type=\"hidden\" name=\"virtual\" value=\"");
            // end
            // begin [file="C:\\index.jsp";from=(39,53);to=(39,78)]
                out.print( request.getRemoteAddr() );
            // end
            // HTML // begin [file="C:\\index.jsp";from=(39,80);to=(53,0)]
                out.write("\">\r\n\t\t\t\t<input type=\"text\" size=\"30\" name=\"text\"> &nbsp; <input type=\"submit\" value=\" OK \">\r\n\t\t\t\t\r\n\t\t\t</form>\r\n\t\t\t\r\n\t\t\t&copy Copyright 2000 - Jon Baer\r\n\t\t\t\r\n\t\t</font>\r\n\t\t\t\t\t\r\n\t\t\t\t</td></tr></table>\r\n\r\n\t</body>\r\n</html>\r\n\r\n");
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
