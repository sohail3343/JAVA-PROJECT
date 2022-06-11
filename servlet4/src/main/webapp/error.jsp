
 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="m" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@page errorPage="error_page.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>TagLibDirective</title>
</head>
<body>
<%-- <m:set var="name" value="Mudassir"></m:set>
<m:out value="${name}"></m:out>
<br>
<m:out value="${20+20}"></m:out>
 --%><%!
int a=20;
int b=0;
%>
<%
int c=a/b;
out.println(c);
%>
<%=
c
 %>

</body>
</html>