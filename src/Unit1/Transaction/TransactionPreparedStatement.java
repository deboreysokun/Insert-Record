
package Unit1.Transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TransactionPreparedStatement {
    Connection con = null;
    PreparedStatement st = null;
    public static void main(String[] args){
        new TransactionPreparedStatement().transact();
    }
    public void transact(){
        int debId = 0;
        int creId = 0;
        int amt = 0;
        Scanner input = new Scanner(System.in);
    try{
    Class.forName("com.mysql.jdbc.Driver");
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kit","root","");
    con.setAutoCommit(false);
    
        System.out.println("Enter the account number:");
        debId  = input.nextInt();
        
        System.out.println("Enter the amount to transfer:");
        amt = input.nextInt();
        
        System.out.println("Enter the account number to credit: ");
        creId = input.nextInt();
        
        String query = "update ababank set balance = balance - ? where id = ?";
        st = con.prepareStatement(query);
        st.setInt(1, amt);
        st.setInt(2, debId);
        st.executeUpdate();
        
        query = "update ababank set balance = balance + ? where id = ?";
        st = con.prepareStatement(query);
        st.setInt(1, amt);
        st.setInt(2, creId);
        st.executeUpdate();
        con.commit();

    }   catch (Exception ex) {
            System.out.println("Unable to process your request...");
            Logger.getLogger(TransactionManagement.class.getName()).log(Level.SEVERE, null, ex);
            try {
                con.rollback();
                System.out.println("Your money is safe...");
            } catch (SQLException ex1) {
                Logger.getLogger(TransactionManagement.class.getName()).log(Level.SEVERE, null, ex1);
                System.out.println("Unable to put your money back...");
            }
        }
    }
}
