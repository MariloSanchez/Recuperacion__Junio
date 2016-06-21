

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="estilo.css" rel="stylesheet" type="text/css" />
        <title>JSP Page</title>
    </head>
    <body>
        <header>
            <h1  style="text-align: center">Versión JSP</h1>
        </header>
        
        <br><br><br>
        
        <h3 style="margin-left: 20%">Pinto de rojo el máximo y de verde el mínimo</h3>
        
        <div class="centro">         
            <%
                //Genera el array
                   int[][] num = new int[5][8];
                   int fila;
                   int columna;

                   for(fila = 0; fila < 5; fila++) {//Fila
                       for(columna = 0; columna < 8; columna++) {//Columna
                           num [fila][columna] = (int)(Math.random()*200) + 100;
                        }
                   }


                //Calculo los maximos, minimos y el numero de sus filas 
               int min = Integer.MAX_VALUE;
               int max = Integer.MIN_VALUE;
               int filaMinimo = 0;
               int filaMaximo = 0;

               System.out.println();  

               for(fila = 0; fila < 5; fila++) {//recorro el array
                   for(columna = 0; columna < 8; columna++){
                       if(num[fila][columna] > max){//Descubro el maximo
                           max = num[fila][columna];
                           filaMaximo = fila;//guardo el numero de la fila en una variable
                       }         
                       if(num[fila][columna] < min){//Descubro el minimo
                           min = num[fila][columna];  
                           filaMinimo = fila;//guardo el numero de la fila en una variable
                       }
                   }
               }

                //Muestro array
                for(fila = 0; fila < 5; fila++) {//Fila
                    for(columna = 0; columna < 8; columna++) {//Columna
                        if(num[fila][columna] == num[filaMinimo][columna] ){
                            out.print("<span>");
                            out.print( num[fila][columna] + "   ");
                            out.print("</span>");
                        }else if(num[fila][columna] == num[filaMaximo][columna]){
                            out.print("<span class='rojo'>");
                            out.print( num[fila][columna] + "   ");
                            out.print("</span>");
                        }else{
                            out.print(num[fila][columna] + "   ");
                        }                       
                    }
                    out.println("<br>");
                }
            
            %>
            
            <br>
            
            <%

                   out.print("El minimo es: " + min  + " y aparece en la siguiente fila: ");
                   out.print("<br>");
                   for (int j = 0; j < 8; j++){
                      out.print(num[filaMinimo][j]+ "|");
                   }
                   
                   out.print("<br>");
                   out.print("**********************************************");
                   out.print("<br>");

                   out.print("El máximo es: " + max + " y aparece en la siguiente fila: ");
                   out.print("<br>");
                   for (int j = 0; j < 8; j++){
                       out.print(num[filaMaximo][j]+ "|");
                   }
               %>
        
        
</body>
</html>
