package com.student_management_system.DAO;

import java.sql.Connection;
import com.student_management_system.GetConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class CountFunction {
    
    public static int countData(String tableName){
        int total =0;
        Connection con = null;
        
        try{
            con = GetConnection.getConnection();
            String str = "select count(*) as 'total' from ?";
            PreparedStatement ps = con.prepareStatement(str);
            ps.setString(1, tableName);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
                    total = rs.getInt(1);
        }
        catch(Exception e){
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
        return total;
    }
    
}
