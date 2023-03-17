<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <title>Primer JSP</title>
</head>
<body>
    <h1>¡Hola, mundo!</h1>
    <c:out value="${2+2}"/>
</body>
</head>