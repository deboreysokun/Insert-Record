
package Unit1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class Prepared_Statement {
    public static void main(String args[]){
       Prepared_Statement phb = new Prepared_Statement();
       Model obj = new Model();
       obj.setID("500");
       obj.setName("Borey");
       insertRecord(obj);
//        obj.se("500");
//        obj.setName("Borey");
//        phb.insertName(obj);
        
    }
    static public void insertRecord(Model obj){
        try{
            String sql = " insert into b6a values(?,?)";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kit","root","");
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, obj.getID());
            ps.setString(2,obj.getName());
            ps.execute();     
            System.out.println("Inserted Successfully...");
        }catch(Exception e){}
    }
}

