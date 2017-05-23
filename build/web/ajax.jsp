<%-- 
    Document   : ajax
    Created on : 15/05/2017, 04:44:36 PM
    Author     : WarMachine
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    String usuario = "";
    usuario = request.getParameter("username");
    if (usuario.equals("pepe")) {
        out.print("si");
    } else {
        out.print("no");
    }
%>
