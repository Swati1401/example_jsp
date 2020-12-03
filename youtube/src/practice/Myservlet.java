package practice;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
public class Myservlet  extends HttpServlet {
		    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{
		  
		    System.out.println("This is Http protocol method");
		    response.setContentType("text/html");
		    PrintWriter out= response.getWriter();
		    out.println("this is get method of my server");
		    out.println(new Date().toString());
		    } 
		    

}
