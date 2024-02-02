import java.sql.*;
import java.util.Scanner;



public class switchCase {
    static Scanner scanner = new Scanner(System.in);
    public void showRecords(Connection cn) throws Exception
    {
        Statement st=cn.createStatement();
        ResultSet rs=st.executeQuery("SELECT * FROM Student ");

        while(rs.next())
        {
            System.out.println("\nId="+rs.getInt(1)+"\nName="+rs.getString(2)+"\nAddress="+rs.getString(3));
        }
    }
    public void closeConnection(Connection cn) throws Exception
    {
        cn.close();
        System.out.println("Connection closed");
    }

    public void deleteByName(Connection cn) throws Exception
    {
        System.out.println("Enter name to delete");
        String name=scanner.next();

        PreparedStatement ps=cn.prepareStatement("DELETE FROM Student WHERE name=?");
        ps.setString(1, name);

        int r =ps.executeUpdate();

        System.out.println("No of record deleted="+r);
        // String query="DELETE * FROM Student";
        // Statement st=cn.createStatement();
        // st.executeUpdate(query);

    }
    public void insertData(Connection cn) throws Exception
    
{
    PreparedStatement st=cn.prepareStatement("INSERT INTO Student VALUES(?,?,?)");

    System.out.println("Enter Id");
            int id=scanner.nextInt();
            System.out.println("Enter name");
            String name=scanner.next();
            System.out.println("Enter Address");
            String add=scanner.next();
            st.setInt(1,id);
            st.setString(2,name);
            st.setString(3,add);

            st.executeUpdate();
}
public static void main(String[] args) throws Exception
{
    Class.forName("com.mysql.cj.jdbc.Driver");
    String url="jdbc:mysql://localhost:3306/testdb";
    String username="root";
     String password="1234@";
    Connection con=DriverManager.getConnection(url,username,password);

    int choice;
    switchCase scase=new switchCase();
    scase.showMenu();

    do{
        System.out.println("Enter your choice");
        choice=scanner.nextInt();

        switch(choice)
        {
            case 1:
            scase.showRecords(con);
            break;

            case 2:
            scase.insertData(con);
            break;

            case 3:
            scase.deleteByName(con);
            break;

            case 4:
            scase.closeConnection(con);
            break;

            default:
            scase.showMenu();
        }
    }
    while(choice!=4);
}

public void showMenu()
{
    System.out.println("***** Menu *****");
    System.out.println("1.Show records");
    System.out.println("2.Insert data");
    System.out.println("3.Delete records");
    System.out.println("4.Close connection");
}
}
