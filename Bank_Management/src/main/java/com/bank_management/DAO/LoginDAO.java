/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bank_management.DAO;
import com.bank_management.model.Login;

import com.bank_management.service.GetConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author HP
 */
public class LoginDAO {
    public static boolean authenticate(Login login){
        boolean status = false;
        Connection con = null;
        try{
            con = GetConnection.getConnection();
            String sql = "select * from login where  name = ? and password = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,login.getName());
            ps.setString(2,login.getPassword());
            
            ResultSet rs = ps.executeQuery();
            if(rs.next())
                status = true;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return status;
    }
    
    public static boolean newUser(Login login){
        boolean status = true;
        Connection con = null;
        try{
            con = GetConnection.getConnection();
            String sql = " insert into login value(?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, login.getName());
            ps.setString(2, login.getPassword());
        }catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try{
                con.close();
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        return status;
    }
}
