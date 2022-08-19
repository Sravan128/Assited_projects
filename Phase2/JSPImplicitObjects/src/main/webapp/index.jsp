<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>First JSP Demo</h1>

<% out.print("Hello World"); %>

<br>
<h2>Screptlet Demo</h2>
<% String name="Earth"; %>
<%="My name is: "+name %>
<br>
<% 
	int a=10;
	int b=20;
	int c  =a+b;
	out.print("Result is : "+c);
%>

<br>
<%! int cube(int n){
	
	return n*n*n;
}
%>


<%= "cube of 5 is: "+cube(5) %>

<br>
<%= new java.util.Date() %>
<br>
<a href="implicit.jsp">Click here For Implicit demo</a>
</body>
</html>