
package Unit1;

import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BatchProcessing {
    public static void main(String[] args){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/kit","root","");
            Statement st = con.createStatement();
            
//            st.addBatch("insert into b6a values ('123','Ben')");
//            st.addBatch("update b6a set sname = 'Catherine' where ID = '1234'");
            st.addBatch("delete from b6a where ID ='125'");
            
            st.executeBatch();
            System.out.println("3 records inserted...");
        } catch (Exception ex) {
            Logger.getLogger(BatchProcessing.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
    
    
  
