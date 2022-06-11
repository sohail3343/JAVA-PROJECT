package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servleturl1 extends HttpServlet {
	
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	resp.setContentType("text/html");
	PrintWriter p = resp.getWriter();
	String name=req.getParameter("name");
	p.println("<h1> your name is  "  +name+ "</h1>");
	//p.println("<a href='servleturl2?user="+name+"'> go to servlet 2</a>");
	// hidden form feild coding.......
	p.println(""
			+"<form action='servleturl2'>"
			+"<input type='hidden' name='name' value='"+ name+"'/>"
			+"<button> go to second servlet</button>"
			+"</form>"
			);
}
}
