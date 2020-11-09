package week12;
import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
  
public class SecondServlet extends HttpServlet {  
  
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
    
    
    Cookie ck[]=request.getCookies();  
    out.println("<center><h1><b>Details Obtained through Cookies<br><br>");
    out.println(ck[0].getValue()+"<br>"); 
    out.println(ck[1].getValue()+"<br>"); 
    out.println(ck[2].getValue()+"</b></h1></center>"); 
  
    out.close();  
  
         }catch(Exception e){System.out.println(e);}  
    }   
}  