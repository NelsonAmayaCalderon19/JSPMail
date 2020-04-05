/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import modelo.Mensaje;

/**
 *
 * @author NELSON
 */
public class Conexion {
    private Statement statement;
    private PreparedStatement ps;
    private Connection con=null;
    private static Conexion base;
    private String db="mensajeria";
    private String url="jdbc:mysql://localhost/" +db;
    private String user="root";
    private String pass="";
    
    public Conexion(){      
      try{
            Class.forName("org.gjt.mm.mysql.Driver");
            con=DriverManager.getConnection(this.url, this.user, this.pass);
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
         
    }
   

    public static Conexion getConexion(){
        if(base == null){
           base = new Conexion(); 
        }
        return base;
    }
    
    public void cerrarConexion(){
        try{
            con.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public Mensaje query(String query) throws SQLException{
      Mensaje m = new Mensaje();
         statement = base.con.createStatement();
        ResultSet res = statement.executeQuery(query);
        while(res.next()){
        m.setId(res.getInt(1));
        m.setNombre(res.getString(2));
        m.setEmail(res.getString(3));
        m.setSitio(res.getString(4));
        m.setMensaje(res.getString(5));
        }
        return m;
    }
    public void delete(String deleteQuery) throws SQLException{
    statement = base.con.createStatement();
        int resdelete = statement.executeUpdate(deleteQuery);
    }
    public int insert(String insertQuery) throws SQLException{
        statement = base.con.createStatement();
        int res = statement.executeUpdate(insertQuery);
        return res;
    }
    
    public int actualizar(String actQuery) throws SQLException{
       Mensaje m = new Mensaje();
    ps = base.con.prepareStatement(actQuery);
        int resact = ps.executeUpdate();
        
        return resact;
    }
  
}
