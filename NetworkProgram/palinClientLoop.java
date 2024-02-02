
import java.net.*;
import java.io.*;
import java.util.*;
public class palinClientLoop {
public static void main(String[] args) throws IOException{
    Socket s=new Socket("localhost",9005);
    DataOutputStream dos=new DataOutputStream(s.getOutputStream());
    DataInputStream dis=new DataInputStream(s.getInputStream());

    Scanner scan=new Scanner(System.in);
    String str;
    while(true)
    {
        System.out.println("Enter the text");
        str=scan.nextLine();
    
            // dos.writeUTF(str);
            // System.out.println(dis.readUTF());
            if(str.equals("exit"))
            {
                s.close();
                break;
            }

                 dos.writeUTF(str);
                 System.out.println(dis.readUTF());
            

        
     }
     
    scan.close();
    dos.close();
    s.close();
 }    
}
