import java.sql.*;
class FDatabase
  {
    public static void main(String [] args)
       {
       try
         {
          Class.forName("com.mysql.cj.jdbc.Driver");
           String url="jdbc:mysql://localhost:3306/javapro";
           String username="root";
           String password="1234@";
          Connection con=DriverManager.getConnection(url,username,password);

          if(con.isClosed())
          {
            System.out.println("Connection Closed");
          }
          else
          {
            System.out.println("Connection Created");
          }
         } 
        catch(Exception e)
          {
           e.printStackTrace();
          }
       }
    }