package com.servlets;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	resp.setContentType("text/html");
	PrintWriter p = resp.getWriter();
	p.println("<h2> welcome to my register servlet</h2>");
	String name=req.getParameter("user_name");
	String paasword=req.getParameter("user_password");
	String email=req.getParameter("user_email");
	String gender=req.getParameter("user_gender");
	String course=req.getParameter("user_course");
	String con=req.getParameter("condition");
	if(con!=null)
	{
	if(con.equals("checked"))
	{
	p.println("<h2> name :"+name+"</h2>");
	
	p.println("<h2> email : "+email+"</h2>");
	p.println("<h2> gender : "+gender+"</h2>");
	p.println("<h2> course : "+course+"</h2>");
	

}
	}
	else
	{
		p.println("<h2>you have not accepted terms and condition</h2>");
	}
	RequestDispatcher rd = req.getRequestDispatcher("form.html");
	rd.include(req, resp);
	
}
}