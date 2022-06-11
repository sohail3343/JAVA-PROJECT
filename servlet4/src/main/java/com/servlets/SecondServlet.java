package com.servlets;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
public class SecondServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("this is service using servlet");
		res.setContentType("text/html");
		PrintWriter p = res.getWriter();
		p.println("<h1>service created by service method</h1>");
	}

}
