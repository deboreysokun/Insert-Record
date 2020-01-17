package Unit1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Task2 {
    public static void main(String[] args) {
        Model record;
        Methods methods = new Methods();
        Scanner input = new Scanner(System.in);
        System.out.println("Select your functions: ");
        System.out.println("1. Insert a record. ");
        System.out.println("2. Insert multiple records.");
        System.out.println("3. View a record.");
        System.out.println("4. View all records.");
        System.out.println("5. View selected records.");
        int option = input.nextInt();
        switch(option){
            case 1:
                record = new Model();
                System.out.println("Enter id:");
                record.setID(input.next());
                System.out.println("Enter name: ");
                record.setName(input.next());
                methods.insertRecord(record);
                break;
            case 2:
                System.out.println("Enter the number of records:");
                int num = input.nextInt();
                ArrayList<Model> arr = new ArrayList<>();
                for(int i= 0;i<num; i++){
                    record = new Model();
                    System.out.println("Enter your ID: ");
                    record.setID(input.next());
                    System.out.println("Enter your Name:");
                    record.setName(input.next());
                    arr.add(record);
                }
                methods.insertRecords(arr);
                break;
            case 3:
                System.out.println("Enter the id you want to view: ");
                int id = input.nextInt();
                Model result = methods.viewRecord(id);
                System.out.println("ID: "+result.getID());
                System.out.println("Name:"+result.getName());
                break;
        case 4:
//            ArrayList<Model> ar = methods.ViewAllRescords();
//            for(int i: arr){
//                  System.out.println("Id:"+i.getStringgetId());
//                  System.out.println("Name:"+i.getSting.getName());
//                  }
                                
        }
        
        
    }  
}
class Methods{
    Statement st;
    Methods(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded...");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kit","root","");
            System.out.println("Connection Established...");
            st = con.createStatement();
        } catch (ClassNotFoundException e) {}
           catch (SQLException e){}
        
    }

    void insertRecord(Model record) {
        try{
            //String exe = String.format("insert into b6a values('12345','')");
            st.execute("insert into b6a values('"+record.getID()+"','"+ record.getName()+"')");
        } catch (SQLException ex) {
            Logger.getLogger(Methods.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    void insertRecords(ArrayList<Model> arr) {
       arr.forEach(i->{
           try{
            st.execute("insert into b6a values('"+i.getID()+"','"+i.getName()+"')");
        } catch (SQLException ex) {
            Logger.getLogger(Methods.class.getName()).log(Level.SEVERE, null, ex);
        } 
       });}

    Model viewRecord( int i) {
        String id = String.valueOf(i);
        Model m = new Model();
        try{
            ResultSet rs = st.executeQuery("Select * from b6a where id = "+i);
            rs.next();
            m.setID(rs.getString("id"));
            m.setName(rs.getString("sname"));   
        }catch (SQLException e) {
   //         Logger.getLogger(Methods.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return m; 
    }

    ArrayList<Model> ViewAllRescords() {
        ArrayList<Model> m = new ArrayList<>();
        try{
            Model temp;
            ResultSet rs = st.executeQuery("Select * from b6a");
            while(rs.next()){
                temp=new Model();
                temp.setName(rs.getString("name"));
                temp.setID(rs.getString("id"));
                m.add(temp);
            }
    }catch (SQLException e) {
            //Logger.getLogger(Methods.class.getName()).log(Level.SEVERE, null, ex);
    }
        return m;
    
    }
    
}
    