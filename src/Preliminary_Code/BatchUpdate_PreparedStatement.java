
package Preliminary_Code;

import Unit1.Model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BatchUpdate_PreparedStatement {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","root");
        String query ="insert into mystudent values (?,?,?,?)";
        
        PreparedStatement pst = con.prepareStatement(query);
        pst.setString(1,"Song Rithy");
        pst.setInt(2,1101801040);
        pst.setString(3,"KIT");
        pst.setString(4,"BMC");
        pst.addBatch();
        pst.executeBatch();
        
    }
}
