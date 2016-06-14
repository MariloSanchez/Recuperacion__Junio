<%-- 
    Document   : RascaYGana
    Created on : 13-jun-2016, 11:16:11
    Author     : Mariló
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="estilo.css">
        <title>Ejercicio 3</title>
    </head>
    <body>
        <h1>RASCA Y GANA</h1>
        <img src="images/rasca.jpg" alt="rasca" title="ImagenRasca">
        
        <form action="segundaPagina.jsp">
            <input type="number" min="1" max="6" id="numero" name="numero"> <input type="submit" value="Rascar">
        </form>
        
    </body>
</html>
