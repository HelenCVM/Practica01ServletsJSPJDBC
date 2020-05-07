<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <% String accountId= request.getParameter("codigo"); %>
 <form action="/PracticaJEE/ModificarTele" style="border: 1px solid black; padding: 30px;">
    <h3 style="color:blue;font-family: verdana;text-align:center;">Registar telefonos:</h3>
    <label style="padding: 30px;" for="cedula">Numero de telefono:</label>
    <input type="number" minlength="10" maxlength="10"  name="numero"  required>
    <hr/>
    <label style="padding: 30px;" for="Name">Tipo:</label>
	<input type="text" name="tipo" required pattern="[A-Za-z]+" required>
	<hr/>
	<label style="padding: 30px;" for="Name">Operadora:</label>
    <input type="text" name="operadora" required pattern="[A-Za-z]+" required>
    <input  type="hidden" name="cedu" value="${sessionScope.variableSession}">
    <input  type="hidden" name="codigoo" value=<%= accountId %>>
   <hr/>
<input style="text-decoration: none;padding: 10px;font-weight: 600;font-size: 20px;color: #ffffff;background-color: #1883ba;border-radius: 6px;border: 2px solid #0016b0;text-align:center;align-items: center;justify-content: center;margin: auto; display: block;" type="submit" value="Enviar">

</form>
</body>
</html>