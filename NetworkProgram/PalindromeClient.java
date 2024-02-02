
import java.net.*;
import java.util.*;
import java.io.*;

public class PalindromeClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 9001);
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        DataInputStream dis = new DataInputStream(socket.getInputStream());

        Scanner scan = new Scanner(System.in);
        String msg;
        System.out.print("Enter the string:");
        msg = scan.nextLine();
        dos.writeUTF(msg);
        System.out.println(dis.readUTF());

        // dos.flush();
        scan.close();
        dis.close();
        dos.close();
        socket.close();

    }
}

// import java.io.*;
// import java.net.*;
// import java.util.Scanner;

// public class PalindromeClient {
// public static void main(String[] args) throws IOException {
// Socket socket = new Socket("localhost", 5000);
// PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
// BufferedReader in = new BufferedReader(new
// InputStreamReader(socket.getInputStream()));
// Scanner scan = new Scanner(System.in);
// String str;
// while (true) {
// System.out.print("Enter a string to check: ");
// str = scan.nextLine();
// out.println(str);
// System.out.println(in.readLine());
// }
// // scan.close();
// // in.close();
// // out.close();
// // socket.close();
// }
// }