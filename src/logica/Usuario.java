/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import fisica.Conexion;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
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
    
    public void autenticar(String usua,String password){
        Conexion conec= new Conexion();
        try {
            MessageDigest md=MessageDigest.getInstance("MD5");
            byte[] array = md.digest(password.getBytes());
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < array.length; ++i) {
                sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100)
                        .substring(1, 3));
            }
            String consulta="select * from UsuarioLogin where Nombre='"+usua+"' and Usua_Pass='"+sb.toString()+"'";
            Statement sentencia = conec.getConexion().createStatement();
            ResultSet resultado = sentencia.executeQuery(consulta);
            if(resultado.next()){

                JOptionPane.showMessageDialog(null, "Acceso concedido");
            }
            else{
                System.out.println("Contraseña incorrecta");
            }
            resultado.close();
            conec.getConexion().close();
            
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void registrar(){
    }
    
    public void actualizar(){
    }
}
