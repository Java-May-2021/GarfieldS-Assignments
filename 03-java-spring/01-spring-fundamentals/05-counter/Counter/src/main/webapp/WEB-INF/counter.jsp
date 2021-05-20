<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Test</title>
</head>
<body>
	<h1> You have visited <a href="/">localhost8080</a> <c:out value="${count}"/> times</h1> 
	
	<h2><a href="/"> Try Again</a></h2>
	

</body>
</html>