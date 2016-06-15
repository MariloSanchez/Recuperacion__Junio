<%-- 
    Document   : index
    Created on : 15-jun-2016, 15:34:28
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
        <h1>DADOS</h1>
        <% 
            
            String imagenUno = "";           
            String imagenDos = "";           
            String imagenTres = "";
            
            do{
                
                    switch((int)(Math.random() * 6)){
                        case 0: imagenUno = "<img src='img/dado1.png'>";break;
                        case 1: imagenUno = "<img src='img/dado2.png'>";break;
                        case 2: imagenUno = "<img src='img/dado3.png'>";break;
                        case 3: imagenUno = "<img src='img/dado4.png'>";break;
                        case 4: imagenUno = "<img src='img/dado5.png'>";break;
                        case 5: imagenUno = "<img src='img/dado6.png'>";break;
                    }
                    
                    switch((int)(Math.random() * 6)){
                        case 0: imagenDos = "<img src='img/dado1.png'>";break;
                        case 1: imagenDos = "<img src='img/dado2.png'>";break;
                        case 2: imagenDos = "<img src='img/dado3.png'>";break;
                        case 3: imagenDos = "<img src='img/dado4.png'>";break;
                        case 4: imagenDos = "<img src='img/dado5.png'>";break;
                        case 5: imagenDos = "<img src='img/dado6.png'>";break;
                    }
                    
                    switch((int)(Math.random() * 6)){
                        case 0: imagenTres = "<img src='img/dado1.png'>";break;
                        case 1: imagenTres = "<img src='img/dado2.png'>";break;
                        case 2: imagenTres = "<img src='img/dado3.png'>";break;
                        case 3: imagenTres = "<img src='img/dado4.png'>";break;
                        case 4: imagenTres = "<img src='img/dado5.png'>";break;
                        case 5: imagenTres = "<img src='img/dado6.png'>";break;
                    }
                    out.print(imagenUno + imagenDos + imagenTres);                
                    out.print ("<br>");
                
            }while ( (imagenUno != imagenDos) && (imagenUno != imagenTres) && (imagenDos != imagenTres) );
        %>
    </body>
</html>
