/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nathan.util;

import exceptions.StandartException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Nathan
 */
public class ConnectionFactory {
    public static final String url = "jdbc:mysql://localhost:3306/Controle";
    public static final String usuario = "admin";
    public static final String senha = "root";
    
    public Connection getConnection(){
        
        try{
            return DriverManager.getConnection(url, usuario, senha);
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Erro na conexão: \n"+ e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
        return null;
        
    }
    
}
