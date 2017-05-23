/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Usuario;
import modelo.Usuario_model;

/**
 *
 * @author WarMachine
 */
public class Login extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Si lo queremos hacer a traves de un get, tenemos que poner el codigo del post en esta clase
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html; charset=iso-8859-1");
        PrintWriter out = response.getWriter();

        // Obtengo los datos de la peticion
        Usuario us = new Usuario();
        us.setNombreUsuario(request.getParameter("username"));
        us.setPassword(request.getParameter("password"));

        Usuario_model usm = new Usuario_model();

        if (!usm.autenticacion(us)) {
            // Creo el objeto persona y lo añado al arrayList 
            out.println("<a color='red'>  Usuario Incorrecto  </a>");
        } else {
            response.sendRedirect("index.jsp");
        }
    }
}
