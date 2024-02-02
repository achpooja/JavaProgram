// Java Program To Read From a File

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


class ReadEx
{
public static void main(String [] args)
{
try
{
File file=new File("write.txt");
FileInputStream fis=new FileInputStream(file);
int data;
while((data=fis.read())!=-1)
{
System.out.print((char)data);
}
fis.close();
}
catch(IOException e)
{
System.out.print(e.getMessage());
}
}
}