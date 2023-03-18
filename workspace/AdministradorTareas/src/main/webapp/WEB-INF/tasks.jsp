<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Administrador de Tareas</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<header class="d-flex justify-content-between aling-items-center">
			<h1>¡Bienvenid@, ${userSession.firstName}!</h1>	
			<a href="/logout" class="btn btn-danger">Salir</a>								
		</header>
		<div class="row">
			<table class="table table-hover">
				<thead>
					<tr>
						<th>Tarea</th>
						<th>Creador</th>
						<th>Asignado a</th>
						<th>Prioridad</th>
					</tr>
				</thead>
				
				<tbody>
					<c:forEach items="${tareas}" var="task">
						<tr>
							<td><a href="/tasks/${task.id}">${task.task}</a></td>
							<td>${task.creator.name}</td>
							<td>${task.taskOwner.name}</td>
							<td>${task.priority}</td>
						</tr>					
					</c:forEach>
				</tbody>			
			</table>		
		</div>
		<a href="/tasks/new" class="btn btn-success">Crear Tarea</a>	
	</div>
</body>
</html>