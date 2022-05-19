package com.bank_management.DAO;

import com.bank_management.service.GetConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.bank_management.model.AccountModel;
import java.sql.ResultSet;
import java.util.ArrayList;


public class AccountDAO {
    
    public static int getAmount(String acc){
        int amount = 00;
        Connection con = null;
        try{
            con = GetConnection.getConnection();
            String sql = "select amount from createAccount where accountNo = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,acc);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
              return  amount = rs.getInt("amount");
            }
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
        return amount;
    }
    
    public static AccountModel getAccountDetails(String acc){
        AccountModel am = null;
        Connection con = null;
        try{
            con = GetConnection.getConnection();
            String sql = "select fatherName , gender,DOB, mobile, Email, fname,"
                    + "lname from createAccount where accountNo = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(acc));
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                String fatherName = rs.getString("fatherName");
                String gender = rs.getString("gender");
                String dob = rs.getString("DOB");
                String mobile = rs.getString("mobile");
                String email = rs.getString("Email");
                String fname = rs.getString("fname");
                String lname = rs.getString("lname");
                am = new AccountModel(Integer.parseInt(acc),fatherName, gender, dob, lname, mobile, email, fname, lname);
            }
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
        return am;
    }
    
    public static boolean delete(int acc){
        boolean status = true;
        Connection con = null;
        try{
            con = GetConnection.getConnection();
            String sql = "delete from createAccount where accountNo = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, acc);
            ps.executeUpdate();
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
    
    public static boolean update(AccountModel am){
        boolean status = false;
        Connection con = null;
        try{
            con = GetConnection.getConnection();
            String sql = " update createAccount set fatherName = ?,gender =?,"
                    + "DOB = ?,mobile = ?,Email =?,"
                    + "fname =?,lname = ?  where accountNo = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, am.getFatherName());
            ps.setString(2,am.getGender());
            ps.setString(3,am.getDob());
            ps.setString(4,am.getMobile());
            ps.setString(5,am.getEmail());
            ps.setString(6,am.getFname());
            ps.setString(7,am.getLname());
            ps.setInt(8, am.getAcc());
            if(ps.executeUpdate() != 0)
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
    
    public static void setAmount(int amount,int acc){
        Connection con = null;
        try{
            con = GetConnection.getConnection();
            String sql = "update createAccount set amount = ? where accountNo = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, amount);
            ps.setInt(2,acc);
            ps.executeUpdate();
            
        }catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try{
                con.close();
            }catch(Exception e){
                e.printStackTrace();
            }
            
        }
    }
    
    public static ArrayList<AccountModel> getCustomerList(){
        ArrayList<AccountModel> al = new ArrayList<>();
        Connection con = null;
        try{
            con = GetConnection.getConnection();
            String sql = "select * from createAccount";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int acc = rs.getInt(1);
                String fatherName = rs.getString(2);
                String gender = rs.getString(3);
                String dob = rs.getString(4);
                String address = rs.getString(5);
                String mobile = rs.getString(6);
                String email = rs.getString(7);
                int amount = rs.getInt(8);
                String firstName = rs.getString(9);
                String lastName = rs.getString(10);
                AccountModel am = new AccountModel(acc, fatherName, gender, dob, address, mobile, email, amount, firstName, lastName);
                al.add(am);
            }
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        finally{
            try{
                con.close();
            }
            catch(Exception ex){
                ex.printStackTrace();
            }
        }
        return al;
    }
    
    public static boolean save(AccountModel acc){
        boolean status = false;
        Connection con = null;
        try {
            con = GetConnection.getConnection();
            String sql = 
                "insert into createAccount (fatherName,gender,DOB,address,mobile,Email,amount,fname,lname)"
                +"value(?,?,?,?,?,?,?,?,?)";
        PreparedStatement insert = con.prepareStatement(sql);
        
        
        insert.setString(1,acc.getFatherName());
        insert.setString(2,acc.getGender());
        insert.setString(3,acc.getDob());
        insert.setString(4,acc.getAddress());
        insert.setString(5,acc.getMobile());
        insert.setString(6,acc.getEmail());
        insert.setInt(7,acc.getAmount());
        insert.setString(8,acc.getFname());
        insert.setString(9, acc.getLname());
        if(insert.executeUpdate() != 0)
            status = true;
        } catch (SQLException ex) {
            ex.printStackTrace();
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
