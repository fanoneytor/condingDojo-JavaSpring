<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Omikuji</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-4">	
				<h1>Enviar un Omikuji</h1>	
				<form action="/enviarOmikuji" method="POST">
					<div class="form-group">
						<label>Ingrese algun numero del 5 al 25</label>
						<input type="number" name="numero" class="form-control"/>					
					</div>
					<div class="form-group">
						<label for="nombreCiudad">Ingrese el nombre de alguna ciudad</label>
						<input type="text" name="nombreCiudad" class="form-control"/>
					</div>
					<div class="form-group">
						<label for="nombre">Ingrese el nombre de alguna persona real</label>
						<input type="text" name="nombrePersona" class="form-control"/>
					</div>
					<div class="form-group">
						<label for="profesion">Ingrese alguna profesion</label>
						<input type="text" name="profesion" class="form-control"/>
					</div>
					<div class="form-group">
						<label for="serVivo">Ingrese el nombre de algun ser vivo</label>
						<input type="text" name="serVivo" class="form-control"/>
					</div>
					<div class="form-group">
						<label for="algoBueno">Ingrese algo bueno de una persona</label>
						<textarea name="algoBueno" cols="30" rows="10" class="form-control"></textarea>
					</div>	
					<input type="submit" value="Enviar" class="btn btn-success" />						
				</form>	
			</div>		
		</div>
	</div>

</body>
</html>