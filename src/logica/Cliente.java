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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author andresyesid
 */
public class Cliente extends Persona{
    private int Identificacion;

    public Cliente() {
    }

    public int getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(int Identificacion) {
        this.Identificacion = Identificacion;
    }

    public DefaultTableModel Consulta(){
        Conexion conec= new Conexion();
        DefaultTableModel modelo= new DefaultTableModel();
        //String[] column;
        Object[] result;
        try{
            PreparedStatement sentencia=conec.getConexion().prepareStatement("SELECT * FROM AdministracionCliente");
            ResultSet resultado=sentencia.executeQuery();
            //column= new String[resultado.getMetaData().getColumnCount()];
            result= new Object[resultado.getMetaData().getColumnCount()];
            for(int i=1;i<=resultado.getMetaData().getColumnCount();i++){
                modelo.addColumn(resultado.getMetaData().getColumnName(i));
            }
            while(resultado.next()){
                result[0]=resultado.getInt(1);
                for(int i=1;i<result.length;i++){
                result[i]=resultado.getString(i+1);
                }
            modelo.addRow(result);
            }
        }
        catch(SQLException e){
        
        }
        return modelo;
    }
    public void registrar(){
        Conexion conect= new Conexion();
        try{
            PreparedStatement sentencia= conect.getConexion().prepareStatement("");
        }
        catch(SQLException e){
        }
    }
    
    public void actualizar(){
    }
}
