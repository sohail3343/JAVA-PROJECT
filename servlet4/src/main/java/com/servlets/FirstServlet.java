package com.servlets;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
public class FirstServlet implements Servlet {
ServletConfig conf;
	@Override
	public void destroy() {
		System.out.println("going to destroy the object");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		
		return conf;
	}

	@Override
	public String getServletInfo() {
		
		return "this servlet is created by sohail";
	}

	@Override
	public void init(ServletConfig conf) throws ServletException {
	this.conf=conf;
	System.out.println("creating object");
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		System.out.println("servicing......");
		res.setContentType("text/html");
		PrintWriter p = res.getWriter();
		p.println("<h1>this is my service method</h1>");
	}

}
