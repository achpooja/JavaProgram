
import java.net.*;
import java.io.*;
public class Client1 {
    public static void main(String [] args) throws IOException 
    {
        Socket s=new Socket("Localhost",5001);
        System.out.println("Reply to the server");
        DataOutputStream dout=new DataOutputStream(s.getOutputStream());
        String msg="Hello I am a client";
        dout.writeUTF(msg);
        DataInputStream din=new DataInputStream(s.getInputStream());
        String cmsg=din.readUTF();
        System.out.println("The client says: " + cmsg);

        dout.close();
        din.close();
        s.close();
    }
}
