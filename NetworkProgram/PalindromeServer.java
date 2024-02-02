
import java.net.*;
import java.io.*;

class PalindromeServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(9001);
        Socket socket = ss.accept();
        System.out.println("Connected");
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        DataInputStream dis = new DataInputStream(socket.getInputStream());

         String line=dis.readUTF();
        //String line;
      //  while ((line = dis.readUTF()) != null) {
            if (isPalindrome(line)) {
                // System.out.println("Palindrome ");

                dos.writeUTF("Palindrome");
            } else {
                // System.out.println("No Palindrome");
                dos.writeUTF("Not Palindrome");
            }
       // }

        dis.close();
        dos.close();
        socket.close();
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

// import java.io.*;
// import java.net.*;

// public class PalindromeServer {
// public static void main(String[] args) throws IOException {
// ServerSocket ss = new ServerSocket(5000);
// Socket socket = ss.accept();
// PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
// BufferedReader in = new BufferedReader(new
// InputStreamReader(socket.getInputStream()));
// String line;
// while ((line = in.readLine()) != null) {
// if (isPalindrome(line)) {
// out.println("Palindrome");
// } else {
// out.println("Not a Palindrome");
// }
// }
// in.close();
// out.close();
// ss.close();
// }

// public static boolean isPalindrome(String str) {
// int i = 0, j = str.length() - 1;
// while (i < j) {
// if (str.charAt(i) != str.charAt(j)) {
// return false;
// }
// i++;
// j--;
// }
// return true;
// }
// }
