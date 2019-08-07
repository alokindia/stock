<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Book</title>
</head>
<body>

	<form action="addBook">
	<label>Title : </label>
	<input type="text" name="title">
	<br>
	<label>Author : </label>
	<input type="text" name="author">
	<br>
	<label>Price : </label>
	<input type="text" name="price">
	<br>
	<input type="submit" value="add">
	</form>
</body>
</html>