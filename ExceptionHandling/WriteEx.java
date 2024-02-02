// Java Program To Write Into a File

import java.io.IOException;
import java.io.FileOutputStream;
import java.io.File;
import java.util.Scanner;

class WriteEx
{
public static void main(String [] args)
{
Scanner s=new Scanner(System.in);
try
{
File file=new File("write.txt");
FileOutputStream fos=new FileOutputStream(file);
System.out.println("Enter the message");
String msg=s.nextLine();
byte[]b=msg.getBytes();
fos.write(b);
fos.close();
}

catch(IOException e)
{
System.out.print(e.getMessage());
}
s.close();
}
}
