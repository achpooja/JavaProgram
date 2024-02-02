import java.net.*;
import java.io.*;
public class Server3 {
    public static void main(String [] args) throws IOException
    {
        ServerSocket ss=new ServerSocket(5000);
        Socket s=ss.accept();
        System.out.println("Server running at 5000");
        DataInputStream dis=new DataInputStream(s.getInputStream());
        DataOutputStream dos=new DataOutputStream(s.getOutputStream());
        String line=dis.readUTF();
        System.out.println("client says:"+line);
        dos.writeUTF("Hello Client");

        dos.close();
        dis.close();
        s.close();
        ss.close();

    }
    
}
