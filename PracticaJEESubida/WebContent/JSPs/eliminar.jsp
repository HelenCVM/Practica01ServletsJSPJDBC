<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@  taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:powderblue;">
     <% String accountId= request.getParameter("codigo"); %>
    
    <h3 style="color:blue;font-family: verdana;text-align:center;">Telefono eliminado</h3>
    <form action="/PracticaJEE/Obtener" style="border: 1px solid black; padding: 30px;">
    <input type="hidden"  name="codi" value=<%= accountId %>>

	<input style="text-decoration: none;padding: 10px;font-weight: 600;font-size: 20px;color: #ffffff;background-color: #1883ba;border-radius: 6px;border: 2px solid #0016b0;text-align:center;align-items: center;justify-content: center;margin: auto; display: block;" type="submit" value="Enviar">
</form>
    

</form>
  
</body>
</html>