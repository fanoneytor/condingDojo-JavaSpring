<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${tarea.task}</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h1>Tarea: ${tarea.task}</h1>
		<h3>Creador: ${tarea.creator.name}</h3>
		<h3>Asignado a: ${tarea.taskOwner.name}</h3>
		<h3>Prioridad: ${tarea.priority}</h3>
		
		<br />
		
		<c:if test="${tarea.creator.id == userSession.id}">
			<a href="/tasks/${tarea.id}/edit" class="btn btn-success">Editar</a>
			<a href="/tasks/${tarea.id}/delete" class="btn btn-danger">Eliminar</a>								
		</c:if>
		<c:if test="${tarea.taskOwner.id == userSession.id}">
			<a href="/tasks/${tarea.id}/delete" class="btn btn-danger">Completada</a>								
		</c:if>
	</div>
</body>
</html>