
package Unit1.AllFunctions;

import Unit1.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class task2_insertRecords {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of records:");
            int num = input.nextInt();
            ArrayList<Model> arr = new ArrayList<>();
            for(int i= 0;i<num; i++){
                Model record = new Model();
                System.out.println("Enter your ID: ");
                record.setID(input.next());
                System.out.println("Enter your Name:");
                record.setName(input.next());
                arr.add(record);
            }
            insertRecords(arr);
    }
    private static void insertRecords(ArrayList<Model> arr) {
        try{
           Class.forName("com.mysql.jdbc.Driver");
           System.out.print("Driver loaded successfully...");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kit","root","");
           System.out.println("DB connected");
           
           Statement st = con.createStatement();
           for (Model i:arr){
                st.execute("insert into b6a values ('"+i.getID()+"','"+i.getName()+"')"); 
           } 
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(task2_insertRecords.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(task2_insertRecords.class.getName()).log(Level.SEVERE, null, ex);
        }     }
    }
        
    

