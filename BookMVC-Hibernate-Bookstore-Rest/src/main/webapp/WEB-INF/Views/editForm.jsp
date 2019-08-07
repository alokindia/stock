<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="editBook">
		<input type="hidden" name="id" value="<c:out value='${bookList.id}'/>">
		<label>Title : </label> <input type="text" name="title"
			value="<c:out value='${bookList.title}'/>"> <br> <label>Author
			: </label> <input type="text" name="author"
			value="<c:out value='${bookList.author}'/>"> <br> <label>Price
			: </label> <input type="text" name="price"
			value="<c:out value='${bookList.price}'/>"> <br> <input
			type="submit" value="edit">
	</form>
</body>
</html>