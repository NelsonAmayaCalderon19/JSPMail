<%-- 
    Document   : nuevo
    Created on : 24/03/2020, 02:52:40 PM
    Author     : NELSON
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Primer JSP</title>
    </head>
    <body>
        <%!
int tabla = 5;
String nombre = "Nelson";%>
Primer Mensaje : <%= nombre %>
<% tabla = tabla + 5;
out.println("El Resultado es: " + tabla);%>
<br>
<a href="formulario.jsp">Ir al Formulario</a>
    </body>
</html>
