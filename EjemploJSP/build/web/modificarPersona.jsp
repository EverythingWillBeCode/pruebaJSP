<%-- 
    Document   : SvModificar
    Created on : 24 nov. 2022, 12:13:04
    Author     : Silforoso
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <h1>Datos de la Persona</h1>
        <form action="SvModificar" method="POST">
            <p><label>Id:</label> <input type="text" name="id"> </p>
            <p><label>Dni:</label> <input type="text" name="dni"> </p>
            <p> <label>Nombre: </label> <input type="text" name="nombre"></p>
            <p> <label>Apellido: </label> <input type="text" name="apellido"></p>
            <p><label>Teléfono: </label> <input type="text" name="telefono"></p>
            <button type="submit" > Enviar </button>
        </form>
         
         
    </body>
</html>
