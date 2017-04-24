/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fisica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author andresyesid
 */
public class Conexion {
    private String host;
    private String usuario;
    private String bd;
    private String password;
    private Connection conexion;

    public Conexion() {
        host="localhost";
        bd="Sistema de Inventarios V2";
        usuario="postgres";
        password="1234";
        
        String ruta="jdbc:postgresql://"+host+"/"+bd;
        try{
            Class.forName("org.postgresql.Driver");
            conexion= DriverManager.getConnection(ruta,usuario,password);
        }
        catch(ClassNotFoundException | SQLException ex){
            JOptionPane.showMessageDialog(null, "Error "+ex, "Error",JOptionPane.ERROR_MESSAGE);
        }
        System.out.println("Conexion exitosa");
    }
    
    
}
