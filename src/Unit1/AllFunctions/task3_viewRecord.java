
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

public class task3_viewRecord {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the id you want to view: ");
            int id = input.nextInt();
            Model result = viewRecord(id);
            System.out.println("ID: "+result.getID());
            System.out.println("Name:"+result.getName());
    }
    public static Model viewRecord(int id) {
        Model temp = new Model();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded...");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kit","root","");
            System.out.println("Connection Established...");
            Statement st = con.createStatement();
           
            ResultSet rs = st.executeQuery("Select * from b6a where id = '"+id+"'");
            rs.next();
            temp.setName(rs.getString("name"));
            temp.setID(rs.getString("ID")); 
        }
        catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(task3_viewRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        return temp;
        }
}

