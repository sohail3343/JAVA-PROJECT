	<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.*,java.io.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@include file="First.jsp" %>
<h1>
Random number is :
<%
Random r= new Random();
int n=r.nextInt(10);
out.println(n);




%>




</h1>
</body>
</html>