<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Hello.jsp">
<input type="text" name="txtUser">
<input type="submit">
<%
String name=request.getParameter("txtUser");
if(name!=null)
	out.println("Welcome"+name);

%>
</body>
</html>