
package Preliminary_Code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreatingTable {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","root");
        Statement st = con.createStatement();   
        st.executeUpdate("Insert into mystudent values ('Duk Pidor', 1101801015)");
        st.executeUpdate("Insert into mystudent values ('Ang Sivhour', 1101801012)");
        
        st.execute("delete from mystudent where ID=1101801015");
        st.executeQuery("Update mystudent set Name=('Nhet Linna') where ID=('1101801015')");
        ResultSet rs = st.executeQuery("Select * from MYSTUDENT");
        while(rs.next())
        {
            System.out.println("ID:"+rs.getString("ID")+", Name:"+rs.getString("Name"));
        }
    }
}
