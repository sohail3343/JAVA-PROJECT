package com.attributes;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class s1 extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	resp.setContentType("text/html");
	PrintWriter p = resp.getWriter();
	String n1=req.getParameter("n1");
	String n2=req.getParameter("n2");
	int nn1=Integer.parseInt(n1);
	int nn2=Integer.parseInt(n2);
	int nn3=nn1+nn2;
	req.setAttribute("sum",nn3);
	RequestDispatcher rd=req.getRequestDispatcher("s2");
	rd.forward(req, resp);

}
}
