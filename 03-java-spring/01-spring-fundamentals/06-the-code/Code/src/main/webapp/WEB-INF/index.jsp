<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Know The Code</title>
</head>
<body>
	<form action="/attempt" method="post">
	<span><c:out value="${error}"></c:out></span>
	<input type="text" name="guess" placeholder="What is the code?" />
	<button>Attempt</button>
	</form>
</body>
</html>