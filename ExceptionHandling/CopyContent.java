//COPY CONTENT OF ONE FILE TO ANOTHER
import java.io.*; 

public class CopyContent {
    public static void main(String [] args) throws IOException
    {
    FileInputStream fis =new FileInputStream("abc.txt");
    FileOutputStream fos=new FileOutputStream("text.txt");
    
    int data;
    while((data=fis.read())!=-1)
    {
        fos.write(data);
    }
    fis.close();
    fos.close();
}

    
}
