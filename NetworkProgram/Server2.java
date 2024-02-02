


import java.net.*;
import java.io.*;

public class Server2 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(5002);
        Socket s = ss.accept();
        System.out.println("Server Connectrd");
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        DataInputStream dis = new DataInputStream(s.getInputStream());

        String line;
        while ((line = dis.readUTF()) != null) {
            if (isPalindrome(line)) {
                dos.writeUTF("Palindrome");
            } else {
                dos.writeUTF("Not Palindrome");
            }
        }

        dis.close();
        dos.close();
        s.close();
        ss.close();

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
