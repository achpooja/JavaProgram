import java.sql.*;



class FTable
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
        
      String query="create table TableFirst(Id int(20) primary key auto_increment,Name varchar(255) not null,City varchar(255))";

      Statement st=con.createStatement();
      st.executeUpdate(query);
      System.out.println("Table created in database") ;
      con.close();            
      }
      catch(Exception e)
      {
       e.printStackTrace();
      }
   }
 }