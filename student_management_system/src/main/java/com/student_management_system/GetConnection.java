
package com.student_management_system;


import java.sql.DriverManager;
import java.sql.Connection;

/**
 *
 * @author HP
 */
public class GetConnection {
    private static Connection con = null;
    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stdmanage?autoReconnect=true&useSSL=false","root","root");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }catch (Exception ex){
            ex.printStackTrace();
        }
          return con;
    }
}
