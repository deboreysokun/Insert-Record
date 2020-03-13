package Unit1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InsertRecord {
    public static void main(String[] args){
        try{
           Class.forName("com.mysql.jdbc.Driver");
           System.out.print("Driver loaded successfully...");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kit","root","");
           System.out.println("DB connected");
           
           Statement st = con.createStatement();
           System.out.println("Statement created...");
           
           Scanner input = new Scanner(System.in);
           System.out.println("Enter your ID and name:");
           String id = input.next();
           String name = input.next();
           
           //to cancadiante the input to database
            st.execute("insert into b6a values ('"+id+"','"+name+"')");  
        } catch (SQLException ex) {
            Logger.getLogger(InsertRecord.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InsertRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }

