package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servlet1 extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	resp.setContentType("text/html");
	PrintWriter p = resp.getWriter();
	String name=req.getParameter("name");
	p.println("<h1>hello" +name+"  welcome to my website</h1>");
	p.println("<h1><a href='servlet2'>go to servlet 2</a></h1>");
	
	
	Cookie c=new Cookie("user_name", name);
	resp.addCookie(c);
}

}
