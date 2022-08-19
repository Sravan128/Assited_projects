<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sql:setDataSource var="conn"
driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/db"
user="root" password="@Viswa33"
/>


<sql:query var="result" dataSource="${conn }">
	select * from student
</sql:query>

<table  border=1 cellspacing=0 cellpadding=10>
	<tr>
		 
			<th>ID</th><th>Name</th><th>Email</th><th>Password</th>
		
	</tr>
	
	<c:forEach items="${result.rows }" var="p">
	<tr>
	<td><c:out value="${p.id }"></c:out></td>
	<td><c:out value="${p.name }"></c:out></td>
	<td><c:out value="${p.email }"></c:out></td>
	<td><c:out value="${p.password }"></c:out></td>

	</tr>
	</c:forEach>
</table>

</body>
</html>