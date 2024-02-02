import java.net.*;
import java.io.*;

public class palinServerLoop {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(9005);
        Socket socket = ss.accept();
        System.out.println("Connected");
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        DataInputStream dis = new DataInputStream(socket.getInputStream());
        String line;

        
    //     // String line = dis.readUTF();
   
    //         while((line=dis.readUTF())!=null)
    //         {
    //     if (isPalindrome(line)) {
    //         dos.writeUTF("Palindrome");
    //     } else {

    //         dos.writeUTF("Not Palindrome");
    //     }
    // }


       line=dis.readUTF();
    while(true)
    {
        if (isPalindrome(line)) {
                    dos.writeUTF("Palindrome");
                } 
                // else {
        
                    dos.writeUTF("Not Palindrome");
                // }
           
    }



    // dis.close();
    //     // dos.close();
    //     socket.close();
    //     ss.close();
    //     dos.close();

    }




    public static boolean isPalindrome(String line) {
        int i = 0, j = line.length() - 1;
        while (i < j) {
            if (line.charAt(i) != line.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}
