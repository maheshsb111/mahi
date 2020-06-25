package com.ge.www;
import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
public class ValidSrv extends HttpServlet 
{
 protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
 {
	 PrintWriter pw=res.getWriter();
	 res.setContentType("Text/html");
	 String name=req.getParameter("t1");
	 String sage=req.getParameter("t2");
	 String status=req.getParameter("vflag");
	 int age=0;
	 if(status.equalsIgnoreCase("no"))
	 {
		 if(name==""||name==null||name.length()==0)
		 {
			 pw.println("Name is Mandatory");
		 }
		 if(sage==""||sage==null||sage.length()==0)
		 {
			 pw.println("Age is Mandatory");
		 }
		 else
		 {
			 try
			 {
				 age=Integer.parseInt(sage);
			 }
			 catch(NumberFormatException nfe)
			 {
				 pw.println("Age must be numeric");
				 return;
			 }
		 }
	 }
	 if(status.equalsIgnoreCase("yes"))
	 {
		 age=Integer.parseInt(sage);
	 }
	 if(age<18)
		 pw.println("<center><i><u><b><h1>You are NOt eligible to vote</center></i></u></b></h1>");
	 else
		 pw.println("<center><i><u><b><h1>You are Eligible to vote</center></i></u></b></h1>");
	 pw.close();
 }
}
