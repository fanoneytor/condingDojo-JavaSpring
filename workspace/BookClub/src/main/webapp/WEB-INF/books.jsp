<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<header class="d-flex justify-content-between aling-items-center">
			<h1>¡Bienvenid@, ${userSession.firstName}!</h1>
			<a href="/books/new" class="btn btn-success">+ Agregar a mi estanteria</a>
			<a href="/logout" class="btn btn-danger">Cerrar Sesión</a>									
		</header>
		<div class="row">
			<h2>Libros de todas las estanterias</h2>
			<table class="table table-hover">
				<thead>
					<tr>
						<th>ID</th>
						<th>Titulo</th>
						<th>Autor</th>
						<th>Posteado por</th>
					</tr>
				</thead>
				
				<tbody>
					<c:forEach items="${books}" var="book">
						<tr>
							<td>${book.id}</td>
							<td><a href="/books/${book.id}">${book.titulo}</a></td>
							<td>${book.nombreAutor}</td>
							<td>${book.userPosted.firstName}</td>
						</tr>					
					</c:forEach>
				</tbody>			
			</table>		
		</div>	
	</div>
</body>
</html>