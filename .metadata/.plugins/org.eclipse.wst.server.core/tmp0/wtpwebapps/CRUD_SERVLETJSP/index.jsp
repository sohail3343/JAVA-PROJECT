<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.pro.pojo.Employee"%>
<%@page import="com.pro.Dao.EmployeeDao"%>
<%@page import="com.pro.DaoImp.EmployeeDaoImp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center" style="color: blue">Registration form</h1>
	<form action="EmployeeController" method="post">
		<table align="center" border="1">
			<tr>
				<td>Id: <input type="text" name="id" readonly="readonly"
					placeholder="Don't enter anything here">
				</td>

			</tr>
			<tr>
				<td>Name: <input type="text" name="name"
					placeholder="Enter your name here" required="required">
				</td>

			</tr>
			<tr>
				<td>Salary: <input type="number" name="salary"
					placeholder="Enter salary here" required="required">
				</td>

			</tr>
			<tr>
				<td>Address: <input type="text" name="address"
					placeholder="Enter Address here" required="required">
				</td>

			</tr>
			<tr>
				<td align="center"><button type="submit">submit</button></td>

			</tr>
		</table>

		<hr>
		<!--fetching logic below  -->
		<table align="center" border="2">
			<tr>
				<th>ID</th>
				<th>NAME</th>
				<th>SALARY</th>
				<th>ADDRESS</th>
			</tr>

			<%
           Employee emp=null;
           EmployeeDao empdao=null;
             emp=new Employee();
             empdao=new EmployeeDaoImp();
            List<Employee> list =  empdao.read();
           Iterator<Employee> itr=list.iterator();
           while(itr.hasNext())
           {
          emp=itr.next();
           %>
			<tr>
				<td><%=emp.getId() %></td>

				<td><%=emp.getName() %></td>
				<td><%=emp.getSalary()%></td>
				<td><%=emp.getAddress() %></td>
				<%
           }
				%>
			</tr>

		</table>
	</form>
</body>
</html>