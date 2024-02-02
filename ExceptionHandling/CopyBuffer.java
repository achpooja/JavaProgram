// Java Program To Copy a File Using Buffer

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;

class CopyBuffer
{
public static void main(String [] args)
{
try
{
FileInputStream fis=new FileInputStream("walp.jfif");
FileOutputStream fos=new FileOutputStream("copy.jfif");
BufferedInputStream bis=new BufferedInputStream(fis);
BufferedOutputStream bos=new BufferedOutputStream(fos);

int data;
while((data=bis.read())!=-1)
{
bos.write(data);
}
bos.close();
bis.close();
fos.close();
fis.close();
}

catch(IOException e)
{
System.out.print(e.getMessage());
}
}
}