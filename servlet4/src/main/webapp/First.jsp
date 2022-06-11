<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> Hello Mudassir</h1>
<%!
int a=20;
int b=30;
String name="sohail";

public int doSum()
{
return a+b;	
}
public String name()
{
	return name;
}



%>
<%
out.println(a);
out.println("<br>");
out.println(b);
out.println("<br>");
out.println(doSum());
out.println("<br>");
out.println(name());
 
%>
<br>
<h1> <%= a %></h1>
<br>
<h1> Sum is :<%=doSum() %></h1>

</body>
</html>