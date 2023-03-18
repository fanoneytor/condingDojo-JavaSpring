<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Detalle Libro</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<header class="d-flex justify-content-between aling-items-center">
			<h1>${book.titulo}</h1>
			<a href="/books" class="btn btn-danger">vover a estanteria</a>								
		</header>
		<br />
		<br />
		<c:if test="${book.userPosted.id == userSession.id}">
			<h2>Tu leiste ${book.titulo} escrito por ${book.nombreAutor}.</h2>		
		</c:if>
		<c:if test="${book.userPosted.id != userSession.id}">
			<h2>${book.userPosted.firstName} leyó ${book.titulo} escrito por ${book.nombreAutor}.</h2>		
		</c:if>
		<br />
		<c:if test="${book.userPosted.id == userSession.id}">
			<h3>Aqui esta lo que piensas sobre el libro:</h3>		
		</c:if>
		<c:if test="${book.userPosted.id != userSession.id}">
			<h3>Aqui esta lo que piensa ${book.userPosted.firstName} sobre el libro:</h3>	
		</c:if>
		<br />
		<br />
		<h4>${book.pensamiento}</h4>	
		<br />
		<br />
		<c:if test="${book.userPosted.id == userSession.id}">
			<a href="/books/edit/${book.id}" class="btn btn-warning">Editar</a>	
			<a href="/books/delete/${book.id}" class="btn btn-danger">Eliminar</a>		
		</c:if>					
	</div>
</body>
</html>