/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import fisica.Conexion;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author andresyesid
 */
public class Usuario extends Persona{
    private int numeroIdentificacion;
    private String sucursal;
    private String rol;

    public Usuario() {
    }

    public int getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(int numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    public boolean autenticar(int usua,String password){
        Conexion conec= new Conexion();
        boolean Correcto=false;
        try {
            //Verificacion del Cifrado de la contraseña en md5
            MessageDigest md=MessageDigest.getInstance("MD5");
            byte[] array = md.digest(password.getBytes());
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < array.length; ++i) {
                sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100)
                        .substring(1, 3));
            }
            //Consulta en la bd
            PreparedStatement sentencia= conec.getConexion().prepareStatement("SELECT * FROM Login WHERE Identificacion=? "
                    + "AND Contraseña=?");
            sentencia.setInt(1, usua);
            sentencia.setString(2, sb.toString());
            ResultSet resultado = sentencia.executeQuery();
            if(resultado.next()){
                Correcto=true;
            }
            else{
                Correcto=false;
            }
            sentencia.close();
            resultado.close();
            conec.getConexion().close();
            
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Correcto;
    }
    public void registrar(){
    }
    
    public void actualizar(){
    }
}
