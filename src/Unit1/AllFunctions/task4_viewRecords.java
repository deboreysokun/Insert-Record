package Unit1.AllFunctions;

import Unit1.*;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class task4_viewRecords {
    public static void main(String[] args) throws Exception{
            ArrayList<Model> arr = viewRecords();
            for(Model i:arr){
                System.out.println("ID:"+i.getID()+",Name:"+i.getName()+",School"+i.getSchool()+",City"+i.getCity());
            }       
            
}
    static ArrayList<Model> viewRecords() throws ClassNotFoundException, SQLException{
        ArrayList<Model> arr = new ArrayList<>();
        
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded successfully...");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kit","root","");
            System.out.println("DB connectd");
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("Select * from mystudent");
            while(rs.next()){
            Model obj = new Model();
            obj.setID(rs.getString("id"));
            obj.setName(rs.getString("name"));
            obj.setID(rs.getString("school"));
            obj.setName(rs.getString("city"));
            arr.add(obj);}
            return arr;
    }
}
    
    
   

