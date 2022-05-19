/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bank_management.service;


import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author HP
 */
public class GetConnection {
    private static Connection con = null;
    public static Connection getConnection() throws SQLException{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank?autoReconnect=true&useSSL=false","root","root");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }catch (SQLException ex){
            ex.printStackTrace();
        }
          return con;
    }
}
