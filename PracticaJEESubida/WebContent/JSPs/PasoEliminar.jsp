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

     Hello <b><% String accountId= request.getParameter("codigo"); %></b>!
     Hello <b><%=  accountId %></b>!
     <c:out value="${param.accountID}"/>
    <h1 style="color:blue;font-family: verdana;text-align:center;border: 1px solid black;">Inicio Sesion</h1>
    <form action="/PracticaJEE/Obtenercedula" style="border: 1px solid black; padding: 30px;">
    <input type="hidden" name="cod" value=<%=  accountId %>>
   
  
	<input style="text-decoration: none;padding: 10px;font-weight: 600;font-size: 20px;color: #ffffff;background-color: #1883ba;border-radius: 6px;border: 2px solid #0016b0;text-align:center;align-items: center;justify-content: center;margin: auto; display: block;" type="submit" value="Enviar">
</form>

</body>
</html>