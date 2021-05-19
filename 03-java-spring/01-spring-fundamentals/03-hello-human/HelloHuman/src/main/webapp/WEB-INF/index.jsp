<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Hello Human</title>
</head>
<body>
    <h1>Hello <c:out value="${Identity}"/></h1>
    <h5>Welcome to Spring Boot</h5>
</body>
</html>