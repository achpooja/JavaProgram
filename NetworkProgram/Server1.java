
import java.net.*;
import java.io.*;
public class Server1 {
    // public static void main(String[] args) throws IOException 
    // {
    //     ServerSocket ss=new ServerSocket(5001);
    //     Socket s=ss.accept();
    //     System.out.println("client connected");
    //     DataInputStream dis=new DataInputStream(s.getInputStream());
    //     String msg=dis.readUTF();
    //     System.out.println("The client says:"+msg);
    //     System.out.println("Reply to the client message:");
    //     String reply="Hello I am Server";
    //     DataOutputStream dout=new DataOutputStream(s.getOutputStream());
    //     dout.writeUTF(reply);
    //     dout.close();
    //     dis.close();
    //     s.close();
    //     ss.close();


    // }



    public static void main(String [] args) throws IOException
    {
        ServerSocket ss=new ServerSocket(5000);
        while(true)
        {
            Socket s=ss.accept();
            ClientHandler thread=new ClientHandler(s);
            thread.start();
        }
       
    }
}

class ClientHandler extends Thread
{
    private Socket s;
    public ClientHandler(Socket s)
    {
        this.s=s;
    }

    public void run()
    {
         try
         {
            System.out.println("Client Connected");
            DataInputStream dis=new DataInputStream(this.s.getInputStream());
            DataOutputStream dos=new DataOutputStream(this.s.getOutputStream());

            while(true)
            {
                String str=dis.readUTF();
                String reply=str+str;
                dos.writeUTF(reply);
            }

         }
         catch (IOException e)
         {
            System.out.println(e.getMessage());
         }
         

    }
 
}

