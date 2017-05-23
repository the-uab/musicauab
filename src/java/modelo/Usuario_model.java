/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author WarMachine
 */
public class Usuario_model {

    Conexion cn = new Conexion();

    public boolean autenticacion(Usuario us) {

        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            String consulta = "SELECT * FROM usuario where nombreUsuario = ? and passUsuario = ?";
            pst = cn.getConnection().prepareStatement(consulta);
            pst.setString(1, us.getNombreUsuario());
            pst.setString(2, us.getPassword());
            rs = pst.executeQuery();
            if (rs.absolute(1)) {
                return true;
            } else {
                return false;
            }

        } catch (Exception ex) {
            System.err.println("Error: " + ex);
            return false;
        }
    }

//    public static void main(String[] args) {
//
//        Usuario_model usm = new Usuario_model();
//        Usuario user = new Usuario();
//        boolean ex = usm.autenticacion(user);
//        boolean ne;
//        System.out.println("Existe?: " + ex);
//        
//    }

}
