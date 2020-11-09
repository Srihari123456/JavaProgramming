package week12;
import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
  
  
public class FirstServlet extends HttpServlet {  
  
  public void doPost(HttpServletRequest request, HttpServletResponse response){  
    try{  
  
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
    out.println("<!DOCTYPE html>");
    out.println("<html><head>");
    out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
    out.println("<title>Srihari's Feedback Form</title></head>");
    out.println("<body>");
    
    out.println("<script type='text/javascript'> function alerts() { alert(' HELLO');}</script>"
      		+ "<input type='submit' value='HOME' onclick='alerts();'/>");
           
    String name=request.getParameter("Name"); 
    String rollno = request.getParameter("RollNo");
    String sub = request.getParameter("Subject");
    
    String Branch = request.getParameter("Branch"); 
    String CourseCode = request.getParameter("CourseCode");
    String Use = request.getParameter("q1");
    
    String Time=request.getParameter("q2"); 
    String CoreYes = request.getParameter("Yes");
    String CoreNo = request.getParameter("No");
    
    String batchN = request.getParameter("N"); 
    String batchP = request.getParameter("P");
    String batchQ = request.getParameter("Q");
    
    out.println("<br>\nWelcome "+name);  
    
    out.println("<br>\nYour RollNo: "+rollno);
    
    out.println("<br>\nSubject: "+sub);  
    
    out.println("<br>\nBranch: "+Branch);  
    
    out.println("<br>\nCourseCode: "+CourseCode);
    
    out.println("<br>\nIs the course useful?: "+Use); 
    
    out.println("<br>\nWas the lab time sufficient?:  "+Time);  
    
      
    try {
    	if(CoreYes.equals("Yes"))out.println("<br>\nIs this core subject: "+CoreYes);
        }
        catch(Exception e) {
        	
        }
    try {
    	if(CoreNo.equals("No"))out.println("<br>\nIs this core subject: "+CoreNo);
        }
        catch(Exception e) {
        	
        }
    
    try {
    if(batchN.equals("N"))out.println("<br>\nBatch : "+batchN);  
    }
    catch(Exception e) {
    	
    }
    try {
        if(batchP.equals("P"))out.println("<br>\nBatch : "+batchP);
    }
    catch(Exception e) {
    	
    }
    try {
        if(batchQ.equals("Q"))out.println("<br>\nBatch : "+batchQ); 
    }
    catch(Exception e) {
    	
    }
    Cookie ck[]=new Cookie[3];
    ck[0] = new Cookie("name",name);//creating cookie object
    ck[1] = new Cookie("rollno",rollno);//creating cookie object
    ck[2] = new Cookie("sub",sub);//creating cookie object
    response.addCookie(ck[0]);//adding cookie in the response
    response.addCookie(ck[1]);//adding cookie in the response
    response.addCookie(ck[2]);//adding cookie in the response
    out.print("<form action='servlet2pages' method='POST'>");  
    out.print("<input type='submit' value='ADD COOKIES'>");  
    out.print("</form></body></html>");  
          
    out.close();  
  
        }catch(Exception e){System.out.println(e);}  
  }  
} 