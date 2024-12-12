/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.techify.helper;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author KRISHNA
 */
public class ConnectionProvider {
    private static Connection con;
  
    
    public static Connection getConnection(){
        try{
            
             if (con == null) {
          Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/techify";
                String username = "root";
                String password = "";
                con = DriverManager.getConnection(url, username, password);  
        }
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
        return con;
    }
    
    
}
