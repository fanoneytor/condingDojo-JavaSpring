<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Usuarios</title>
</head>
<body>
	<h1>
		<c:out value="${titulo}"/>, Bienvenid@ <c:out value="${nombre}"/>
	</h1>
	<h2>HOBBIES</h2>
	<ul>
		<c:forEach items="${hobbies}" var="hobby">
			<li><c:out value="${hobby}"></c:out></li>		
		</c:forEach>
	</ul>
	
	<h2>Países</h2>
	<c:forEach items="${countries}" var="pais">
		<h4>País: <c:out value="${pais.key}"/> - Capital:<c:out value="${pais.value}"/></h4>
	</c:forEach>
	

</body>
</html>