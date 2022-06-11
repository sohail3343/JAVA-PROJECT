<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL Example</title>
</head>
<body>
<h1> This is JSTL Example</h1>
<!-- out tag -->
<c:out value=""></c:out>
<c:set var="i" value="0" scope="application"> </c:set>
<h1><c:out value="${i} "></c:out></h1>
<%-- <c:remove var="i"></c:remove> --%>
<h1><c:out value="${i}"> this is default value</c:out></h1>
<hr>
<c:if test="${i==23 }">
<h1> condition is true</h1>
</c:if>

<c:choose>
<c:when test="${i>0 }">
<h1> this is my first case</h1>
<h2> the number is positive </h2>

</c:when>
<c:when test="${i <0 }">
<h1> this is my second case</h1>
<h2> the number is negative</h2>
</c:when>
<c:otherwise>
<h1> number is zero</h1>

</c:otherwise>
</c:choose>
<c:forEach var="j" begin="1" end="10">
<h1> Value of j is <c:out value="${j }"> </c:out> </h1>

</c:forEach>

</body>
</html>