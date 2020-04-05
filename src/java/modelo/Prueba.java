/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import config.Conexion;
import java.sql.SQLException;
import modelDAO.MensajeDAO;

/**
 *
 * @author NELSON
 */
public class Prueba {
    public static void main(String[] args) throws SQLException{
        
        Conexion conexion = Conexion.getConexion();
      
        Mensaje m= new Mensaje();
        m.setNombre("Jose");
        m.setEmail("jose@gmail.com");
        m.setSitio("www.jose.com");
        m.setMensaje("Hola Como Estas");
        
        MensajeDAO mdao = new MensajeDAO();
        mdao.insertar(m);
        
    }
}
