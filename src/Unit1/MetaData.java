//Finding the structure of the table from the database
package Unit1;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MetaData {
    public static void main(String [] args){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kit","root","");
        String srt[] = new String[100];
        DatabaseMetaData dm = con.getMetaData();
        
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("Select * from b6a");
        
        ResultSetMetaData rsm = rs.getMetaData();
        for(int i = 1; i<=rsm.getColumnCount(); i++){
            System.out.println(rsm.getColumnName(i)+":"+rsm.getColumnTypeName(i));
        }
    }   catch (Exception ex) {
            Logger.getLogger(MetaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
