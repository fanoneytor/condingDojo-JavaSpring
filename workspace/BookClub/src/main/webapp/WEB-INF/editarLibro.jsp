<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Editar Libro</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<header class="d-flex justify-content-between aling-items-center">
			<h1>Editar libro de tu estanteria!</h1>
			<a href="/books" class="btn btn-danger">vover a estanteria</a>								
		</header>
		<form:form action="/books/update" method="POST" modelAttribute="book">
			<div class="form-group">
				<form:label path="titulo">Titulo</form:label>
				<form:input path="titulo" class="form-control"></form:input>
				<form:errors path="titulo" class="text-danger"></form:errors>
			</div>
			
			<div class="form-group">
				<form:label path="nombreAutor">Autor</form:label>
				<form:input path="nombreAutor" class="form-control"></form:input>
				<form:errors path="nombreAutor" class="text-danger"></form:errors>
			</div>
			
			<div class="form-group">
				<form:label path="pensamiento">Lo que pienso</form:label>
				<form:textarea path="pensamiento" class="form-control"></form:textarea>
				<form:errors path="pensamiento" class="text-danger"></form:errors>
			</div>
			
			<form:hidden path="userPosted" value="${userSession.id}"></form:hidden>
			
			<form:hidden path="id" value="${book.id}"></form:hidden>
			
			<input type="hidden" name="_method" value="PUT"/>
			
			<input type="submit" value="Guardar" class="btn btn-success"/>
		
		</form:form>
	
	</div>
</body>
</html>