<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> My sql tag example</h1>
<sql:setDataSource driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/sohail" user="root" password="Khan@3343" var="ds"></sql:setDataSource>
<sql:query dataSource="${ds}" var="rs">select * from sohail1</sql:query>
 <table>
<tr>
    <td> ID</td>
    <td> USERNAME</td>
    <td> CITY</td>
</tr>
<c:forEach items="${rs.rows}" var="row">
<tr>
   <td><c:out value="${ row.sid}"></c:out></td>
   <td><c:out value="${row.sname}"></c:out></td>
   <td><c:out value="${row.scity}"></c:out></td>
   

</tr>


</c:forEach>


</table>
</body>
</html>