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


@WebServlet("/updateuser")
public class updateuser extends HttpServlet {
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
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		try {
			Statement st = con.createStatement();
			int result = st.executeUpdate("update user set password='"+password+"' where email='"+email +"'");
			System.out.println(result);
			PrintWriter out = response.getWriter();
			if(result>0)
			{
				
				out.println("<h1>user updated</h1>");
				
			}
			else
			{
				out.println("error updating user");
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
