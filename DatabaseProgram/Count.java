import java.sql.*;
import java.util.*;
public class Count {
    public static void main(String [] args) throws Exception
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter address: ");
        String add=scan.nextLine();
    Class.forName("com.mysql.cj.jdbc.Driver");
    String url="jdbc:mysql://localhost:3306/testdb";
    Connection cn=DriverManager.getConnection(url,"root","1234@");

    PreparedStatement ps=cn.prepareStatement("select count(id) from student where address=?");
    ps.setString(1,add);
    ResultSet rs=ps.executeQuery();
     rs.next();
    System.out.println("Total"+rs.getInt(1));
    cn.close();
    scan.close();


    }
    
}
