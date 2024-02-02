import java.sql.*;
import java.util.Scanner;
public class InsertData {
    static Scanner scan=new Scanner(System.in);

    public static void main(String[] args)
    {
        try
       {
         Class.forName("com.mysql.cj.jdbc.Driver");
          String url="jdbc:mysql://localhost:3306/testdb";
          String username="root";
           String password="1234@";
          Connection con=DriverManager.getConnection(url,username,password);
          PreparedStatement st=con.prepareStatement("INSERT INTO Student VALUES(?,?,?)");
          int count=0;
          String prompt;
          do
          {
            System.out.println("Enter Id");
            int id=scan.nextInt();
            System.out.println("Enter name");
            String name=scan.next();
            System.out.println("Enter Address");
            String add=scan.next();
            st.setInt(1,id);
            st.setString(2,name);
            st.setString(3,add);

            int r=st.executeUpdate();
            count=count+r;
            System.out.println("Press 'N' to exit otherwise continue...");
            prompt=scan.next();
          }
          while(!(prompt.toLowerCase().startsWith("n")));
          {
            System.out.println("No of records added="+count);
          }
          con.close();
       }
       catch(ClassNotFoundException e)
        {
         System.out.println(e.getMessage());
        } 
        catch(SQLException e)
        {
         System.out.println(e.getMessage());
        }  
    }
    
}
