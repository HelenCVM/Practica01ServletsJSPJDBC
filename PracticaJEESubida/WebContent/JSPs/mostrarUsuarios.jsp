<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@  taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html  style="background-color:powderblue;" >
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
</head>
<body style="background-color:powderblue;">

<h1 style="color:blue;font-family: verdana;text-align:center;border: 1px solid black;">Informacion</h1>
    
<hr/>
<form action="/PracticaJEE/ListarPorcedula" style="border: 1px solid black; padding: 30px;">
<input type="text" name="cedula" >
<hr/>
<input style="text-decoration: none;padding: 10px;font-weight: 600;font-size: 20px;color: #ffffff;background-color: #1883ba;border-radius: 6px;border: 2px solid #0016b0;text-align:center;align-items: center;justify-content: center;margin: auto; display: block;" type="submit" value="Enviar">
</form>


<c:forEach items="${resultado}" var="res">
  <table width="50%" border="1" align="center">
   <tr>
    <th>Nombre</td>
    <th>Apellido</td>
     <th>Correo</td>
      <th>Numero</td>
       <th>Tipo</td>
   </tr>
   <tr>
    <td>${res.getNombre()}</td>
    <td>${res.getApellido()}</td>
    <td>${res.getCorreo()}</td>
    <td>${res.getNumero()}</td>
    <td>${res.getTipo()}</td>
  </tr>
  </table>
</c:forEach>


</body>
</html>