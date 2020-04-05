/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDAO;

import config.Conexion;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Mensaje;

/**
 *
 * @author NELSON
 */
public class MensajeDAO {
    Conexion con = null;

    public MensajeDAO() {
        
        con = Conexion.getConexion();
    }
    
    public void insertar(Mensaje mensaje){
        String sql="insert into mensaje (nombre,email,website,mensaje) values('"+mensaje.getNombre()+"','"+mensaje.getEmail()+"','"+mensaje.getSitio()+"','"+mensaje.getMensaje()+"')";
        try {
            con.insert(sql);
        } catch (SQLException ex) {
            Logger.getLogger(MensajeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public Mensaje buscar(Mensaje mensaje){
        Mensaje m = new Mensaje();
        String sql="select * from mensaje where id='"+mensaje.getId()+"'";
        try {
          m = con.query(sql);
        } catch (SQLException ex) {
            Logger.getLogger(MensajeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return m;
    }
    
    public void delete(Mensaje mensaje){
    String sql="delete from mensaje where id='"+mensaje.getId()+"'";
    try {
            con.delete(sql);
        } catch (SQLException ex) {
            Logger.getLogger(MensajeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void actualizar(Mensaje mensaje){
    String sql="update mensaje set  nombre='"+mensaje.getNombre()+"', email='"+mensaje.getEmail()+"', website='"+mensaje.getSitio()+"', mensaje='"+mensaje.getMensaje()+"' where id='"+mensaje.getId()+"'";
    try {
            con.actualizar(sql);
        } catch (SQLException ex) {
            Logger.getLogger(MensajeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
