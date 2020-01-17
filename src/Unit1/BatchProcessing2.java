
package Unit1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BatchProcessing2 {
    public static void main(String[]args){
        int num = 0;
        Scanner scan = new Scanner(System.in);
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kit","root","");
           //dummy object
            PreparedStatement ps = null;
            String sql = "insert into b6a values (?,?)";
            System.out.println("Enter the number of records:");
            num = scan.nextInt();
            ps = con.prepareStatement(sql);
            for(int i =0; i<num; i++){
                System.out.println("Enter the id  and name: ");
                int id = scan.nextInt();
                String name = scan.next();
                
                ps.setInt(1,id);
                ps.setString(2, name);
                
                ps.addBatch(); 
            }
            ps.executeBatch();  
        } catch (Exception ex) {
            Logger.getLogger(BatchProcessing2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
    