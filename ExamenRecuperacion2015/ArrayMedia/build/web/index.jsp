<%-- 
    Document   : index
    Created on : 21-jun-2016, 19:22:38
    Author     : Mariló
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <div style="text-align: center">
            <h1>ARRAY BIDIMENSIONAL</h1>
            
        <%
            int suma = 0;     
            int media = 0;
            int array [][] = new int [10][16];
            
            //calculo la media
            for(int i = 0; i < array.length; i++){//recorro las filas
                for (int j = 0; j < array[0].length; j++){//recorro las columnas
                    array[i][j] = (int)(Math.random() * 800) + 100;
                    suma += array[i][j];
                }
            }
            media = suma / ( array.length* array[0].length);
            
            //imprimo
            for(int i = 0; i < array.length; i++){//recorro las filas
                for (int j = 0; j < array[0].length; j++){//recorro las columnas
                    if(array[i][j] < media){
                        out.println("<span style='color:blue'>" + array[i][j] + "</span>");
                    }
                    if(array[i][j] > media){
                        out.println("<span style='color:green'>" + array[i][j] + "</span>");
                    }
                    if(array[i][j] == media){
                        out.println("<span style='color:red'>" + array[i][j] + "</span>");
                    }
                }
                out.println("<br>");
            }
            
            out.println("<br>");           
            out.print("La media del array es: " + media);
           
        %>
        </div>
    </body>
</html>
