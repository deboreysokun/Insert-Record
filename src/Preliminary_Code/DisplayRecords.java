/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Preliminary_Code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DisplayRecords {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded successfully...");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kit","root","");
            System.out.println("DB connectd");
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("Select * from mystudent");
            while(rs.next()){
                System.out.println("ID:"+rs.getString("id")+",Name:"+rs.getString("name")+",School"+rs.getString("school")+",City"+rs.getString("city"));
                        
    }
}
}