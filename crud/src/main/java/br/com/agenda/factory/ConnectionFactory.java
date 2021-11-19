/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.agenda.factory;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author canal
 */
public class ConnectionFactory {
    
    private static final String USERNAME = "root";
    
    private static final String PASSWORD = "";
    
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/agenda";
    
    public static Connection createConnectionToMySQL()throws Exception {
        
        class.forName("com.mysql.jdbc.Driver");
        
        Connection = connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
        
        return connection;
        
    }
    
    public static void main(String[] args){
        
        Connection con = createConnectionToMySQL();
        
        if(con!= null){
            System.out.print("Conexão Obtida com Sucesso!");
            con.close();
        }
    }
      
}
