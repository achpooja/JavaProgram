import java.io.*;

public class ReadPrint {
    public static void main(String[] args) throws IOException {
FileOutputStream fos = new FileOutputStream("text.txt");
String msg="Hello Everyone in the world!";
byte b[] = msg.getBytes();
fos.write(b);
FileInputStream fis=new FileInputStream("text.txt");
int data;
while((data=fis.read()) != -1)
{
    System.out.print((char)data);
}
fos.close();
fis.close();    
}
}