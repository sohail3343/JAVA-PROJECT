package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servlet2 extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	resp.setContentType("text/html");
	PrintWriter p = resp.getWriter();
	String name=req.getParameter("name");
	
	Cookie[] c = req.getCookies();
	boolean f=false;
	String sname="";
	if(c==null)
	{
		p.println("<h1> your are new user go to home page</h1>");
		return;
	}
	else
	{
		
	
	for(Cookie ck:c)
	{
		
		String tname = ck.getName(); 
		if(tname.equals("user_name"))
		{
			f=true;
			name=ck.getValue();
		}
	}
	}
	if(f)
	{
		
		p.println("<h1>hello" +name+ "welcome to my second website</h1>");
	}
	else
	{
		p.println("<h1> your are new user go to home page</h1>");
	}
}

} 
