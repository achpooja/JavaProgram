import java.io.*;
import java.util.*;
public class InputWrite {
public static void main(String [] args) throws IOException
{
    FileOutputStream fos=new FileOutputStream("abc.txt");
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter your message");
    String str=scan.nextLine();

    byte b[]=str.getBytes();
    scan.close();
    fos.write(b);
    fos.close();
}    
}
