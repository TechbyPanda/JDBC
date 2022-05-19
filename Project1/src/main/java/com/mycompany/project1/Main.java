
package com.mycompany.project1;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Connection con = null;
        try{
            Scanner sc  = new Scanner(System.in);
            for(int i=0;i<10;i++){
                System.out.println("Enter Name");
            String name = sc.next();
            System.out.println("Enter Salary");
            int salary = sc.nextInt();
            System.out.println("Enter Mobile");
            String mobile = sc.next();
            System.out.println("Enter Age");
            int age = sc.nextInt();
            System.out.println("Enter the city id ");
            int cityId = sc.nextInt();
            
          con = GetConnection.getConnection();
          String sql = "insert into employee(name,age,salary,cityId)"
                  + " values('"+name+"',"+age+",'"+salary+"',"+cityId+")";
          Statement st = con.createStatement();
          int x = st.executeUpdate(sql);
          if(x!=0)
                System.out.println("Record Saved..");
          else
                System.out.println("Failed...");
            }
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
    }
    
}
