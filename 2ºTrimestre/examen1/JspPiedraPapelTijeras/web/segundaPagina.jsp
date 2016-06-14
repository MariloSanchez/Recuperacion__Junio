<%-- 
    Document   : segundaPagina
    Created on : 14-jun-2016, 12:41:34
    Author     : Mariló
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="estilo.css">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Piedra....Papel.....Tijeras</h1>
        
        <%
            int numero = (int)(Math.random()* 3);
            String opcion = "";
            String jugador = request.getParameter("eleccion");
            
            switch(numero){
                case 0: opcion = "<img src='images/piedra.png' style='width: 100px; height: 100px';>";break;
                case 1: opcion = "<img src='images/papel.png' style='width: 100px; height: 100px';>";break;
                case 2: opcion = "<img src='images/tijera.png' style='width: 100px; height: 100px';>";break; 
                default: break;
            }
            out.print("Ordenador:");
            out.print(opcion);          
            out.print("<br>");
            
        %>
        
        <br><br>
        Jugador:
        <img src="images/<% out.print(jugador); %>.png" title="ImagenPiedra" alt="ImagenPiedra" style="width: 100px; height: 100px;">
        <br><br><br><br>
        
        <%
            if(((jugador.equals("piedra")) && (numero == 0)) || 
                    ((jugador.equals("papel")) && (numero == 1)) || 
                    ((jugador.equals("tijera") && (numero == 2)))){
                out.print("¡Empate!");
            }else if ( (jugador.equals("piedra")) && (numero == 2) ||
                    (jugador.equals("papel")) && (numero == 0) ||
                    (jugador.equals("tijera")) && (numero == 1)){
                out.print("¡Enhorabuena has ganado!");
            }else{
                out.print("Lo siento. Has perdido");
            }
        %>
        <br>
        <form action="index.html">
            <input type="submit" value="Prueba otra vez suerte!">
        </form>
        
         
    </body>
</html>
