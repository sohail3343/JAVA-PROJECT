package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servleturl2 extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	resp.setContentType("text/html");
	PrintWriter p = resp.getWriter();
	p.println("<h1 style=color:blue;>welcome to second servlet</h1>");
	String name=req.getParameter("user");
	p.print("<h1 style=color:red;>welcome back    "+name+  "</h1>");
}
}
