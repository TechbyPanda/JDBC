package com.student_management_system.DAO;
import com.student_management_system.GetConnection;
import com.student_management_system.model.loginModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class loginDAO {
    public static boolean check(loginModel login){
        boolean status = false;
        Connection con = null;
        try{
            con = GetConnection.getConnection();
            String sql = "select * from user where username=? and password=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,login.getUsername());
            ps.setString(2,login.getPassword());
            
            ResultSet rs = ps.executeQuery();
            if(rs.next())
                status = true;
            
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
