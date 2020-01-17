
package Unit1.AllFunctions;

import Unit1.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class task1_insertRecord {
   public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Model record = new Model();
        System.out.println("Enter id:");
        record.setID(input.next());
        System.out.println("Enter name: ");
        record.setName(input.next());
        insertRecord(record);
   } 
    private static void insertRecord(Model record) {

        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded...");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kit","root","");
            System.out.println("Connection Established...");
            Statement st = con.createStatement();
            
            st.execute("insert into b6a values('"+record.getID()+"','"+ record.getName()+"')");
        } catch (SQLException ex) {
            Logger.getLogger(Methods.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) { 
           Logger.getLogger(task1_insertRecord.class.getName()).log(Level.SEVERE, null, ex);
       } 
    }

    private static class Methods {

        public Methods() {
        }
    }
}
