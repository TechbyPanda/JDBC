package com.bank_management.view;

import com.bank_management.service.GetConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Checker {
    
    public static boolean isValidData(String mobile, String name,int amount,String email){
       
        if(isValidMobile(mobile) && isValidUsername(name) && isValidAmount(amount) && isValidEmail(email))
            return true;
        
        return false;
    }

    public static boolean isValidMobile(String str) {

        Pattern ptrn = Pattern.compile("(0/91)?[7-9][0-9]{9}");
  
        Matcher match = ptrn.matcher(str);
  
        return (match.find() && match.group().equals(str));
    }
    
    public static boolean isValidUsername(String name)
    {
  
        String regex = "[a-zA-Z]+\\.?";
  
        Pattern p = Pattern.compile(regex);
  
        if (name == null) {
            return false;
        }

        Matcher m = p.matcher(name);
  
        return m.matches();
    }
    
    public static boolean isValidAmount(int amount){
        boolean status = false;
        if(amount>=2000)
            return true;
        return status;
    }
    
    public static boolean isValidEmail(String email)
    {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                            "[a-zA-Z0-9_+&*-]+)*@" +
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                            "A-Z]{2,7}$";
                              
        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }
    
    public static String accountNo(String name){
        String acc = null;
        Connection con = null;
        try{
            con = GetConnection.getConnection();
            String sql = "select accountNo from createAccount where mobile = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,name);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
              return  acc = rs.getString(1);
         
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        finally{
            try{
                con.close();
            }catch(Exception ex){
                ex.printStackTrace();
            }
              
        }
        return acc;
    }
    
}
