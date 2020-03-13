
package Preliminary_Code;

import Unit1.Transaction.TransactionManagement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Transaction_Management {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner input = new Scanner(System.in);
        int amt = 0;
        int debID = 0;
        int CreID = 0;
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kit","root","");
        con.setAutoCommit(false);
        
        System.out.println("Enter the Credit account ID: ");
        CreID = input.nextInt();
        
        System.out.println("Enter the Debit acoount ID: ");
        debID = input.nextInt();
        
        System.out.println("Enter the amount to deliver: ");
        amt = input.nextInt();
        
        Statement st = con.createStatement();
        st.executeUpdate("update Bank set Balance = Balance - '"+amt+"' where Id ='"+debID+"'");
        st.executeUpdate("update Bank set Balance = Balance + '"+amt+"' where Id ='"+CreID+"'");
        con.commit();   
        try {
            con.rollback();
            System.out.println("Your money is safe...");
        }catch (SQLException ex1) {
            Logger.getLogger(TransactionManagement.class.getName()).log(Level.SEVERE, null, ex1);
            System.out.println("Unable to put your money back...");
        }        
}}
