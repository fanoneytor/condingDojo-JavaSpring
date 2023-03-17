<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Save travels</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
	<h1>Detalle de gasto</h1>
	<h2>Nombre del gasto: ${gasto.nombre_gasto}</h2>
	<h2>Descripcion del gasto: ${gasto.detalle}</h2>
	<h2>Proveedor: ${gasto.proveedor}</h2>
	<h2>Costo: ${gasto.valor}</h2>
</body>
</html>