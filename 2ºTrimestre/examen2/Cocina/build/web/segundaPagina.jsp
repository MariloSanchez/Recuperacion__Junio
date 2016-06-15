<%-- 
    Document   : segundaPagina
    Created on : 15-jun-2016, 10:21:59
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
        <h1>Confecciona tu cocina</h1>
        <%
            String acabado = request.getParameter("acabado");
            String asa = request.getParameter("asa");
            String electrodomesticos = request.getParameter("electrodomesticos");
            
            if(acabado.equals("Madera") && asa.equals("larga")){
                out.print("<img src='img/maderalargo.jpg'>");
                
            }
            if(acabado.equals("Madera") && asa.equals("corta")){
                out.print("<img src='img/maderacorto.jpg'>");
                
                
            }
            if(acabado.equals("Naranja") && asa.equals("corta")){
                out.print("<img src='img/naranjacorto.jpg'>");
                
            }
            if(acabado.equals("Naranja") && asa.equals("larga")){
                out.print("<img src='img/naranjalargo.jpg'>");
                
            }
            if(acabado.equals("VerdeLima") && asa.equals("corta")){
                out.print("<img src='img/verdecorto.jpg'>");
                
            }
            if(acabado.equals("VerdeLima") && asa.equals("larga")){
                out.print("<img src='img/verdelargo.jpg'>");
                
            }
            
            int preciobase = 0;
            int precioElectrodomesticos = 0;
            
            if( acabado.equals("Madera")){
                preciobase = 9000;
            }else{
                preciobase = 8000;
            }
            if(electrodomesticos.equals("Si")){
                precioElectrodomesticos = 4500;   
            }else{
                precioElectrodomesticos = 0;
            }
        %>
        
        <table>
            <tr>
                <td>Precio Base:</td>
                <td><%=preciobase %></td>
            </tr>
            <tr>
                <td>Pecio con I.V.A</td>
                <td><%=(preciobase * 0.21)%></td>
            </tr>
            <tr>
                <td>Precio electrodomésticos:</td>
                <td><%=precioElectrodomesticos %></td>
            </tr>
            <tr>
                <td>Precio Total:</td>
                <td><%=(preciobase + (preciobase * 0.21) + precioElectrodomesticos) %></td>
            </tr>
        </table>
    </body>
</html>
