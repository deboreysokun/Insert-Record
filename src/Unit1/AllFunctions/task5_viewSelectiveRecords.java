 
package Unit1.AllFunctions;

import Unit1.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class task5_viewSelectiveRecords {
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of data you want to see: ");
        int num = input.nextInt();
        String[] str = new String[num];
        for (int i =0; i<num; i++){
        System.out.println("Enter the ID: ");
        str[i]= input.next();
        }
        ArrayList<Model> arr = viewSelectiveRecords(str);
        for(Model i:arr){
            System.out.println("Id: "+i.getID()+",Name: "+i.getName());
        }
        }
    //'...' Variable Character
    static ArrayList<Model> viewSelectiveRecords(String ...str) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Driver loaded successfully...");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kit","root","");
        System.out.println("DB connected");
        Statement st = con.createStatement();
        ArrayList<Model> obj = new ArrayList<>();
        for(String i:str){
            Model tem = new Model();
             ResultSet rs =st.executeQuery("Select * from b6a where ID = '"+i+"'");
            rs.next();
            tem.setID(rs.getString("ID"));
            tem.setName(rs.getString("sname"));
            obj.add(tem);
        }
        return obj;
    }
 }
