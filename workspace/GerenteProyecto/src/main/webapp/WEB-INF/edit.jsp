<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Editar Proyecto</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h1>Editar Proyecto</h1>
		<form:form action="/projects/update" method="POST" modelAttribute="project">
			<div class="form-group">
				<form:label path="title">Titulo</form:label>
				<form:input path="title" class="form-control"></form:input>
				<form:errors path="title" class="text-danger"></form:errors>
			</div>
			
			<div class="form-group">
				<form:label path="description">Descripcion</form:label>
				<form:textarea path="description" class="form-control"></form:textarea>
				<form:errors path="description" class="text-danger"></form:errors>
			</div>
			
			<div class="form-group">
				<form:label path="dueDate">Fecha Limite</form:label>
				<form:input path="dueDate" type="date" class="form-control"></form:input>
				<form:errors path="dueDate" class="text-danger"></form:errors>
			</div>
			
			<form:hidden path="lead" value="${userSession.id}"></form:hidden>
			
			<form:hidden path="id" value="${project.id}"></form:hidden>
			
			<input type="hidden" name="_method" value="PUT"/>
			
			<input type="submit" value="Guardar" class="btn btn-success"/>
		
		</form:form>
	
	</div>
</body>
</html>