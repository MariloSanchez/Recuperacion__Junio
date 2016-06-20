<%-- 
    Document   : index
    Created on : 16-jun-2016, 10:20:23
    Author     : Mariló
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CIELO</title>
    </head>
    <body>
        <div style="text-align: center">
            <table>

                <%
                    int sol = 1;
                    for (int i = 0; i < 10; i++){
                %>
                <tr>

                    <%
                        for(int j = 0; j < 10; j++){
                    %>

                    <td>       
                        <%
                        int numeroImagen = (int)(Math.random() * 10) ;
                        String imagen = " ";//el espacio es para machacar la imagen sol si entra dos veces seguida por 4
                        switch( numeroImagen ){
                                case 0: imagen = "<img src='imagenes/avion.png'>"; break;
                                case 1: imagen = "<img src='imagenes/nube.png'>"; break;
                                case 2: imagen = "<img src='imagenes/pajaro.png'>"; break;
                                case 3: imagen = "<img src='imagenes/platillo.png'>"; break;
                                case 4: if(sol == 1){
                                            imagen = "<img src='imagenes/sol.png'>";
                                            sol++;  out.print(sol);
                                        } 
                                break;
                                case 5: imagen = (" "); break;
                                case 6: imagen = (" "); break;
                                case 7: imagen = (" "); break;
                                case 8: imagen = (" "); break;
                                case 9: imagen = (" "); break;
                            }
                            out.print(imagen);
                        %>
                    </td>

                       <% }//segundo for %>
                </tr>
                  <% }//primer for %>


            </table>
        </div>
    </body>
</html>
