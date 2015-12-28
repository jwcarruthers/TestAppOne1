package testPackageOne;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InitialServlet
 */
@WebServlet(description = "Initial Servet", urlPatterns = { "/InitialServlet" })
public class InitialServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InitialServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String docType = "<!DOCTYPE HTML PUBLIC \" - //W3C//DTD HTML 4.0 TRANSITIONAL//EN\">\n";
		out.println(docType +
					"<HTML>\n" +
					"<HEAD>\n" +
					"<TITLE>\n" + 
					"Hello Rerrr" +
					"</HEAD>\n" +
					"</TITLE>\n" + 
					"<BODY BGCOLOR = green>\n" +
					"<H1>" +
					"hello my jfirendlods" +
					"</H1>" +
					"</BODY>\n" +
					"</TITLE>\n" +
					"</HEAD>\n" +
					"</HTML>\n");
					
	}

}
