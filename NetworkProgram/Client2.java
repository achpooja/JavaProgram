
import java.net.*;
import java.util.*;
import java.io.*;

public class Client2 {
    public static void main(String[] args) throws IOException
     {
        Socket s=new Socket("localhost",5002);
        DataOutputStream dos=new DataOutputStream(s.getOutputStream());
        DataInputStream dis=new DataInputStream(s.getInputStream());

        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the String");
        String msg=scan.nextLine();
        dos.writeUTF(msg);
        System.out.println(dis.readUTF());

        scan.close();
        dis.close();
        dos.close();
        s.close();
     }

}


