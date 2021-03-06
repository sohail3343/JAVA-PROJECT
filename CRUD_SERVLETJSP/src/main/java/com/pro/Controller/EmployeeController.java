package com.pro.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pro.Dao.EmployeeDao;
import com.pro.DaoImp.EmployeeDaoImp;
import com.pro.pojo.Employee;

/**
 * Servlet implementation class EmployeeController
 */
@WebServlet("/EmployeeController")
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		double salary=Double.parseDouble( request.getParameter("salary"));
		String address = request.getParameter("address");
		
		
		Employee employee = new Employee();
		
		employee.setName(name);
		employee.setSalary(salary);
		employee.setAddress(address);
		  EmployeeDao daoImp = new EmployeeDaoImp();
		  daoImp.create(employee);
		  out.println("<h1> sucessfully inserted......</h1>");
		  response.sendRedirect("index.jsp");
//		  daoImp.read();
		 
		
	}

}
