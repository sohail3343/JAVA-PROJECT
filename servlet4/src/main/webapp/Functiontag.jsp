<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<h1>this is function tag page</h1>
<p> this page is all about using function tag</p>
<c:set var="name" value="sohail" scope="application"></c:set>
<h1><c:out value="${name }"></c:out></h1>
<h1> length of name is <c:out value="${fn:length(name) }"></c:out></h1>
<h1> <c:out value="${fn:toUpperCase(name) }"></c:out></h1>
<h1><c:out value="${fn:toLowerCase(name) }"></c:out></h1>
<h1><c:out value="${fn:contains(name,'sohail') }"></c:out></h1>
<body>
</body>
</html>