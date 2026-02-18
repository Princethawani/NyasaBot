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


public class _0002findex_0002ejspindex_jsp_3 extends HttpJspBase {


    static {
    }
    public _0002findex_0002ejspindex_jsp_3( ) {
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

            // HTML // begin [file="C:\\index.jsp";from=(0,0);to=(15,3)]
                out.write("<html>\r\n\t<head>\r\n\t\r\n\t<!-- header - edit \"Data/yourHtmlHeader\" to customize -->\r\n\t<!-- contents - edit \"EventHandlers/Html file/onCreate\" to customize -->\r\n\t<meta name=\"generator\" content=\"ModelWorks IDE\">\r\n\t\r\n\t<title>DANY</title>\r\n\r\n\t</head>\r\n\t<body>\r\n\t\t\r\n\t\t<font size=\"3\" face=\"verdana,arial\">\r\n\t\t&nbsp; &nbsp; Dany Version 2.01\r\n\t\t\t\r\n\t\t\t");
            // end
            // begin [file="C:\\index.jsp";from=(15,5);to=(17,5)]
                 if (request.getParameter("text") == null) {
                				out.println("What's your name?");
                			} 
            // end
            // HTML // begin [file="C:\\index.jsp";from=(17,7);to=(32,0)]
                out.write("\r\n\t\t\t\r\n\t\t\t<form method=\"post\" action=\"/chat\">\r\n\t\t\t\t\r\n\t\t\t\t&nbsp; &nbsp; <input type=\"text\" size=\"30\" name=\"text\"> &nbsp; <input type=\"submit\" value=\" OK \">\r\n\t\t\t\t\r\n\t\t\t</form>\r\n\t\t\t\r\n\t\t\t&nbsp; &nbsp; &copy Copyright 2000 - Jon Baer\r\n\t\t\t\r\n\t\t</font>\r\n\r\n\t</body>\r\n</html>\r\n\r\n");
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
