<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="insert"><button>Add Book</button></a><br>
	<table border="1">
		<tr>
			<th>Title</th>
			<th>Author</th>
			<th>Action</th>
		</tr>
		<c:forEach var="tempbook" items="${books }">

			<%-- <c:url var="updateLink" value="/book/updateForm">
				<c:param name="bookId" value="${tempbook.id }"></c:param>
			</c:url>

			<c:url var="deleteLink" value="/book/deleteForm">
				<c:param name="bookId" value="${tempbook.id }"></c:param>
			</c:url> --%>


			<tr>
				<td>${tempbook.title }</td>
				<td>${tempbook.author }</td>
				<td><a href="edit?id=${tempbook.id }"><button>Edit</button></a></td>
				<td><a href="deleteBook?id=${tempbook.id }"><button>Delete</button></a></td>
			</tr>

		</c:forEach>
	</table>
</body>
</html>