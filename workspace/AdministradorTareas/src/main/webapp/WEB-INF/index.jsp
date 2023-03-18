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
		<div class = "row">
			<div class = "col-6">
				<h2>Registrate</h2>
				<form:form action="/register" method="post" modelAttribute="nuevoUsuario">
					
					<div class="form-group">
						<form:label path="name">Nombre:</form:label>
						<form:input path="name" class="form-control"></form:input>	
						<form:errors path="name" class="text-danger"></form:errors>																	
					</div>
					
					<div class="form-group">
						<form:label path="email">Email:</form:label>
						<form:input path="email" class="form-control"></form:input>	
						<form:errors path="email" class="text-danger"></form:errors>																	
					</div>
					
					<div class="form-group">
						<form:label path="password">Password:</form:label>
						<form:password path="password" class="form-control"></form:password>	
						<form:errors path="password" class="text-danger"></form:errors>																	
					</div>	
					
					<div class="form-group">
						<form:label path="confirm">Confirmación:</form:label>
						<form:password path="confirm" class="form-control"></form:password>	
						<form:errors path="confirm" class="text-danger"></form:errors>																	
					</div>
					
					<input type="submit" class="btn btn-success" value="Registrame"/>
								
				</form:form>
			
			</div>
			<div class = "col-6">
				<h2>Inicia Sesión</h2>
				<form:form action="/login" method="post" modelAttribute="nuevoLogin">
				
					<div class="form-group">
						<form:label path="email">Email:</form:label>
						<form:input path="email" class="form-control"></form:input>	
						<form:errors path="email" class="text-danger"></form:errors>																	
					</div>
					
					<div class="form-group">
						<form:label path="password">Password:</form:label>
						<form:password path="password" class="form-control"></form:password>	
						<form:errors path="password" class="text-danger"></form:errors>																	
					</div>	
					<input type="submit" value="Iniciar Sesión" class="btn btn-success"/>		
											
				</form:form>
			
			</div>		
		</div>	
	</div>

</body>
</html>