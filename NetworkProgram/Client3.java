import java.net.*;
import java.io.*;
import java.util.*;
public class Client3 {
    public static void main(String [] args) throws IOException
    {
        Socket s=new Socket("localhost",5000);
        Scanner scan =new Scanner(System.in);
        DataOutputStream dos=new DataOutputStream(s.getOutputStream());
        DataInputStream dis=new DataInputStream(s.getInputStream());
        // dos.writeUTF("Hello Server");
        // String str=dis.readUTF();
        // System.out.println("Server says:"+str);

        while(true)
        {
            System.out.println("Enter message");
            String str=scan.nextLine();

            if(str.equalsIgnoreCase("exit"))
            {
                System.out.println("Session closed");
                break;
            }

        dos.writeUTF(str);
        String reply=dis.readUTF();
        System.out.println(reply);
        }
        dis.close();
        dos.close();
        scan.close();
        s.close();
        
    }
    
}
