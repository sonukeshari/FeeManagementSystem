/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package feemanagementsystem;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

/**
 *
 * @author Sonu Keshari
 */
public class Database {
    
    Connection con =null;
    java.sql.PreparedStatement ps;
    public static Connection dbconnect()
    {
        try{
             
            Class.forName("com.mysql.cj.jdbc.Driver");
              Connection con = DriverManager.getConnection("jdbc:mysql://localhost/feemanagementsystem", "root", "");
            return con;
            
        }
        catch(ClassNotFoundException | SQLException ex){
            System.out.println(ex);
            return null;
            
        }
        
    }
  
}
