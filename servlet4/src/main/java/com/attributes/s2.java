package com.attributes;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class s2 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
resp.setContentType("text/html");
PrintWriter p = resp.getWriter();
int nn1=Integer.parseInt(req.getParameter("n1"));
int nn2=Integer.parseInt(req.getParameter("n2"));
int m=nn1*nn2;
int  sum =(int) req.getAttribute("sum");
p.println("sum is ="+sum);
p.println("product is ="+m);

	}

}
