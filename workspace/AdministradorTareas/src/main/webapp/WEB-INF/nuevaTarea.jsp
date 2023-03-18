<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Crear Tarea</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<header class="d-flex justify-content-between aling-items-center">
			<h1>Crear una nueva tarea</h1>
			<a href="/tasks" class="btn btn-danger">vover al Administrador</a>								
		</header>
		<form:form action="/tasks/create" method="POST" modelAttribute="tarea">
			<div class="form-group">
				<form:label path="task">Tarea</form:label>
				<form:input path="task" class="form-control"></form:input>
				<form:errors path="task" class="text-danger"></form:errors>
			</div>
			
			<div class="form-group">
				<form:label path="taskOwner">Asignar a</form:label>
				<form:select path="taskOwner" class="form-select">
					<c:forEach items="${usuarios}" var="usuario">
						<option value="${usuario.id}">${usuario.name}</option>
					</c:forEach>
				</form:select>
				<form:errors path="taskOwner" class="text-danger"></form:errors>
			</div>
			
			<div class="form-group">
				<form:label path="priority">Prioridad</form:label>
				<form:select path="priority" class="form-select">
					<c:forEach items="${priorityList}" var="priority">
						<option value="${priority}">${priority}</option>
					</c:forEach>
				</form:select>
				<form:errors path="priority" class="text-danger"></form:errors>
			</div>
			
			<form:hidden path="creator" value="${userSession.id}"></form:hidden>
			
			<input type="submit" value="Crear" class="btn btn-success"/>
		
		</form:form>	
	</div>
</body>
</html>