<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>RemoveBook</title>
</head>
<body>
<form action= "RemoveBookServlet" method="post">
Id
<input type="number" name="bid">
Name
<input type="text" name="bname">
<button type="submit">Remove</button>
</form>
</body>
</html>