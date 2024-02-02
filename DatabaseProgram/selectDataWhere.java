import java.sql.*;
import java.util.Scanner;
// EXAM QUESTION 2021
public class selectDataWhere 
{ 
      static Scanner scan=new Scanner(System.in);
    public static void main(String[] args)
    {
        //  static Scanner scan=new Scanner(System.in);
        try
        {
            //  static Scanner scan=new Scanner(System.in);
            System.out.println("Enter the name ");
            String name=scan.next();

            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/javapro";
            String username="root";
             String password="1234@";
            Connection con=DriverManager.getConnection(url,username,password);
  
            // Statement st=con.createStatement();

            PreparedStatement st=con.prepareStatement("SELECT COUNT(id)FROM tablefirst WHERE name=?");
            st.setString(1, name);

            ResultSet rs=st.executeQuery();
            rs.next();
            System.out.println(" Total no of student whose name is "+name+" are:"+rs.getInt(1));

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
