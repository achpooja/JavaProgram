// import java.sql.ResultSet;
// import java.sql.SQLException;

import java.sql.*;

class selectData 
 {
   public static void main(String[] args)
   {
      try
       {
         Class.forName("com.mysql.cj.jdbc.Driver");
          String url="jdbc:mysql://localhost:3306/javapro";
          String username="root";
           String password="1234@";
          Connection con=DriverManager.getConnection(url,username,password);

          // Statement st=con.createStatement();
          // String query="SELECT * FROM tablefirst";
          // ResultSet rs=st.executeQuery(query);
 
          PreparedStatement ps=con.prepareStatement("select * from tablefirst where Name=?");
          ps.setString(1,"pooja");
          ResultSet rs=ps.executeQuery();
          while(rs.next())
          {
            System.out.println("Id="+rs.getInt(1)+" Name="+rs.getString(2)+" City="+rs.getString(3));
          }

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
