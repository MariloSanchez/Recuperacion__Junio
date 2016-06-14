<%-- 
    Document   : segundaPagina
    Created on : 14-jun-2016, 9:57:56
    Author     : Mariló
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="estilo.css">
        <title>2ºPagina del 3º Ejercicio</title>
    </head>
    <body>
        <h1>RACA Y GANA</h1>
        <%
            int numero = (int)(Math.random()* 6) + 1;
            out.print("<img src='images/rasca" + numero + ".jpg'/>");
            out.print("<br>");
               
            int numeroElegido = (Integer.parseInt(request.getParameter("numero")));
            
            if (numero == numeroElegido){
                out.println("Enhorabuena! Ha ganado un Iphone");
                out.print("<br>");
                out.println( "<img src='images/iphone.jpg' style='width: 350px; height: 241px;'>");
                
            }else{
                out.println("Lo siento, ha perdido. Aqui tiene un premio de consolación");
                out.print("<br>");
                out.println( "<img src='images/euro.jpg'style='width: 350px; height: 241px;'>");
                
            }
        %>
        <form action="RascaYGana.jsp" name="formulario">
            <input type="submit" value="Pobar otra vez">
        </form>
        
        
        
        
    </body>
</html>
