<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AddBook</title>
</head>
<body>
<form action= "AddBookServlet" method="post">
Name
<input type="text" name="bname">
Price
<input type="number" name="bprice">
<button type="submit">Add</button>
</form>
</body>
</html>