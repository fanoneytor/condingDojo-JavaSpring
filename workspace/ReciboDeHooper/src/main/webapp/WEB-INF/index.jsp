<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Recibo de Hooper</title>
</head>
<body>
	<h1>Customer Name: <c:out value="${nombre}"/></h1>
	<h2>Item Name: <c:out value="${item}"></c:out></h2>
	<h2>Price: $<c:out value="${precio}"></c:out></h2>
	<h2>Descripcion: <c:out value="${descripcion}"></c:out></h2>
	<h2>Vendedor: <c:out value="${vendedor}"></c:out></h2>
</body>
</html>