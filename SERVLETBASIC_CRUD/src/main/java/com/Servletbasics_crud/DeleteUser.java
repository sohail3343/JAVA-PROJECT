package com.Servletbasics_crud;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Deleteuser")
public class DeleteUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection con;

	public void init() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "Khan@3343");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String name = request.getParameter("firstname");
		System.out.println(name);
		PrintWriter out = response.getWriter();
		
		
		try {
			Statement st = con.createStatement();
			
			 int r = st.executeUpdate("delete from user where firstname='"+name+"'");
			 if(r>0)
			 {
				 out.println("<h1>deleted succesfully</h1>");
			 }
			 else
			 {
				 out.println("<h1>Error deleting user<h1>");
			 }
				
			
		} catch (Exception e) {
		
			e.printStackTrace();
		}
	}
	public void destroy() {
		try {
			con.close();
		} catch (SQLException e) {
		
			e.printStackTrace();
		}

	}


}
