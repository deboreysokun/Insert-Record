
package Unit1;
import java.sql.*;
import java.util.*;
public class InsertRecordsUsingArrayList {

    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("DRIVER HAS BEEN LOADED");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/kit","root","");
            System.out.println("Connection has been established");
            Statement st = c.createStatement();
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the number of records you want to input: ");
            int num = input.nextInt();
            Model temp;
            ArrayList<Model> records = new ArrayList<>();
            for(int i=0;i<num;i++){
                temp = new Model();
                System.out.println("Enter id: ");
                temp.setID(input.next()); 
                System.out.println("Enter name: ");
                temp.setName(input.next());
                records.add(temp);
            }
            for(Model m:records){
                st.execute("insert into b6a values('"+m.getID()+"','"+m.getName()+"')");
               // String exe = String.format("insert into b6a values('%s','%s')",m.getId(),m.getName());
               // st.execute(exe);
            }
        }catch(ClassNotFoundException e){
            
        }catch(SQLException e){
            
        }
    }
    
}

