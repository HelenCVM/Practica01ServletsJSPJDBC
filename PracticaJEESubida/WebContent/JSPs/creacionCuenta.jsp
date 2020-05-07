<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@  taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html >

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
</head>
<body style="background-color:powderblue;">
    <h1 style="color:blue;font-family: verdana;text-align:center;border: 1px solid black;">Formulario</h1>
    <form action="/PracticaJEE/CreacionCuenta" style="border: 1px solid black; padding: 30px;">
    <label style="padding: 30px;" for="cedula">Cedula</label>
    <input type="number" minlength="10" maxlength="10"  name="cedula"  required>
    <hr/>
    <label style="padding: 30px;" for="Name">Nombre</label>
	<input type="text" name="nombre" required pattern="[A-Za-z]+" required>
	<hr/>
	<label style="padding: 30px;" for="Name">Apellido</label>
    <input type="text" name="apellido" required pattern="[A-Za-z]+" required>
   <hr/>
    <label style="padding: 30px;" for="Name">Correo</label>
    <input type="email" name="correo" required>
   <hr/>
    <label style="padding: 30px;" for="Name">Contraseña</label>
    <input type="password" name="contrasena" required>
    <hr/>
	<input style="text-decoration: none;padding: 10px;font-weight: 600;font-size: 20px;color: #ffffff;background-color: #1883ba;border-radius: 6px;border: 2px solid #0016b0;text-align:center;align-items: center;justify-content: center;margin: auto; display: block;" type="submit" value="Enviar">
</form>



</body>
</html>