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

@WebServlet("/AddUser")
public class AddUser extends HttpServlet {
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

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		try {
			Statement st = con.createStatement();
			int result = st.executeUpdate("insert into user values ('"+ firstname+"','"+lastname+"','"+email+"','"+password+"')");
			PrintWriter out = response.getWriter();
			if(result>0)
			{
				out.println("<h1>user created</h1>");
				
			}
			else
				out.println("<h1>Error created user</h1>");
		} catch (SQLException e) {
			
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
