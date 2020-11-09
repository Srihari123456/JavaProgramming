package week12;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FeedbackForm
 */
@WebServlet("/FeedbackForm")
public class FeedbackForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FeedbackForm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException {
    	   // Set the response message's MIME type
    	   response.setContentType("text/html;charset=UTF-8");
    	   // Allocate a output writer to write the response message into the network socket
    	   PrintWriter out = response.getWriter();

    	   // Write the response message, in an HTML page
    	   try {
    	      out.println("<!DOCTYPE html>");
    	      out.println("<html><head>");
    	      out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
    	      out.println("<title>Srihari's Feedback Form</title></head>");
    	      out.println("<body>");
    	      
    	      out.println("<script type='text/javascript'> function alerts() { alert(' HELLO');}</script>"
    	        		+ "<input type='submit' value='HOME' onclick='alerts();'/>");
    	       
    	      
    	      
    	      out.println("<form action='servlet1pages' method='POST'><h1>Feedback Form</h1>");  // says Hello
    	      // Echo client's request information
    	      out.println("<p>Name: " +  "<input type='text' name='Name'></p>");
    	      out.println("<p>RollNo: " +  "<input type='text' name='RollNo'></p>");
    	      out.println("<p>Course: " +  "<input type='text' name='Subject'></p>");
    	      out.println("<p>Branch: " +  "<input type='text' name='Branch'></p>");
    	      out.println("<p>CourseCode: " +  "<input type='text' name='CourseCode'></p>");
    	      
    	      out.println("<p>Batch:  <input type='checkbox' id='N' name='N' value='N'>  <label for='N'> N Batch</label>"
    	      		+ "<input type='checkbox' id='P' name='P' value='P'>  <label for='P'> P Batch</label>"    	     
    	      		+ "<input type='checkbox' id='Q' name='Q' value='Q'>  <label for='Q'> Q Batch</label><br>\n    </p>");
    	      
    	      out.println("<p>Was the course useful to gain knowledge about Java? "
    	      		+ "  <input type='radio' id='high' name='q1' value='high'> <label for='high'>High</label>"
    	      		+ "  <input type='radio' id='mid' name='q1' value='mid'>  <label for='mid'>Mid</label>"
    	      		+ "  <input type='radio' id='low' name='q1' value='low'>  <label for='low'>Low</label> <br></p>");
    	      
    	      out.println("<p>Was 4 hours sufficient for the lab? "
      	      		+ "  <input type='radio' id='high' name='q2' value='high'> <label for='high'>High</label>"
      	      		+ "  <input type='radio' id='mid' name='q2' value='mid'>  <label for='mid'>Mid</label>"
      	      		+ "  <input type='radio' id='low' name='q2' value='low'> <label for='low'>Low</label> <br></p>");
      	     
    	      out.println("<p>Is this a Core Course?  <input type='checkbox' id='Yes' name='Yes' value='Yes'>  <label for='Yes'> Yes</label>"
      	      		+ "<input type='checkbox' id='No' name='No' value='No'>  <label for='No'> No</label><br>\n    </p>");
    	      out.println("<input type='submit' value='VIEW DETAILS'>");
    	      
    	      out.println("</form></body>");
    	      out.println("</html>");
    	   } finally {
    	      out.close();  // Always close the output writer
    	   }
    	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
