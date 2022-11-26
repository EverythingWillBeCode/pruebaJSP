<%-- 
    Document   : index
    Created on : 18 nov. 2022, 17:35:59
    Author     : Gabriel
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
        <form action="SvPersona" method="POST">
            <p><label>Dni:</label> <input type="text" name="dni"> </p>
            <p> <label>Nombre: </label> <input type="text" name="nombre"></p>
            <p> <label>Apellido: </label> <input type="text" name="apellido"></p>
            <p><label>Teléfono: </label> <input type="text" name="telefono"></p>
            <button type="submit" > Enviar </button>
        </form>
        
        <h2>Ver lista de Personas</h2>
        <p>Si desea ver todas las personas haga click en el botón mostrar personas</p>
        <form action="SvPersona" method="GET">
            <button type="submit" > Mostrar Personas </button>
        </form>
        
        <h2>Eliminar Personas</h2>
        <p>Ingrese el Id de la pesona a eliminar</p>
        <form action="SvEliminar" method="POST">
            <p><label>Id:</label> <input type="text" name="id_eliminar"></p>
            <button type="submit" >Eliminar</button>
        </form>
        
        <h2>Modificar Persona</h2>
        <p>Ingrese el Id de la persona a modificar</p>
        <form action="modificarPersona.jsp" >
            <p><label>Id:</label> <input type="text" name="id_modificar"></p>
            <input type="submit" value="Modificar" name="Modificar" />
                        
        </form>
       
        
    </body>
</html>
