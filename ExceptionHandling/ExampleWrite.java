import java.io.*;
import java.util.Scanner;

class ExampleWrite
{
public static void main(String [] args)
{
    
Scanner s=new Scanner(System.in);
FileOutputStream fis=new FileOutputStream("record.txt");
DataOutputStream dos=new DataOutputStream(fis);


do
{
 System.out.println("Enter name");
String name=s.next();
System.out.println("Enter roll");
int roll=s.nextInt();
System.out.println("Enter Address");
String address=s.next();

dos.writeInt(roll);
dos.writeUTF(name);
dos.writeUTF(address);

System.out.println("Press n to exit;press any key to continue");
String prompt=s.next();

}
while(!((String prompt).toLowerCase().startsWith("n")));


dos.close();
fis.close();
}
}