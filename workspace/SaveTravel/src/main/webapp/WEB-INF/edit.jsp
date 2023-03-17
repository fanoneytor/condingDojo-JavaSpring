<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Save Travels</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
	<div>
		<form:form action="/edit/${gasto.id}" method="post" modelAttribute="gasto">	
			<h1>Editar Gasto</h1>
			<input type="hidden" name="_method" value="PUT" />				
				<div class="form-group">
					<form:label path="nombre_gasto">Nombre de Gasto:</form:label>
					<form:input path="nombre_gasto" class="form-control"></form:input>	
					<form:errors path="nombre_gasto" class="text-danger"></form:errors>																	
				</div>
				
				<div class="form-group">
					<form:label path="proveedor">Proveedor:</form:label>
					<form:input path="proveedor" class="form-control"></form:input>	
					<form:errors path="proveedor" class="text-danger"></form:errors>																	
				</div>
				
				<div class="form-group">
					<form:label path="valor">Costo:</form:label>
					<form:input path="valor" class="form-control"></form:input>	
					<form:errors path="valor" class="text-danger"></form:errors>																	
				</div>
				
				<div class="form-group">
					<form:label path="detalle">Descripcion:</form:label>
					<form:input path="detalle" class="form-control"></form:input>	
					<form:errors path="detalle" class="text-danger"></form:errors>																	
				</div>
				
				<input type="submit" class="btn btn-success" value="Editar"/>
						
		</form:form>	
	</div>

</body>
</html>