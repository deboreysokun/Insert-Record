
package Unit1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ReadRecord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the ID you want to view:");
        int num = scan.nextInt();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","root");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("Select * from mystudent where id ='"+num+"'");
            System.out.println("hi");
            rs.next();
            System.out.println("Name:"+rs.getString("Name"));
        } catch (Exception e) {
        }
    }
}
