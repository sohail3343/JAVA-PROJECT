package com.attributes;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class additionservlet extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	resp.setContentType("text/html");
	PrintWriter out = resp.getWriter();
	System.out.println("inside additionservlet");
int n1 = Integer.parseInt(req.getParameter("number1"));
	int n2 = Integer.parseInt(req.getParameter("number2"));
	//int sum=n1+n2;
	out.println(n1+n2 +"THIS IS SUM VALUE ");
}
}
