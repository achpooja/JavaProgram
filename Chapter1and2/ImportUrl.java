
import java.net.URL;
import java.net.URLConnection;
import java.net.MalformedURLException;
import java.io.IOException;
import java.io.InputStream;
import java.io.FileOutputStream;

public class ImportUrl {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://ncit.edu.np");
            // URL url = new URL("https://www.xyz.com");
            // InputStream inputStream = url.openStream();
            URLConnection con=url.openConnection();
            InputStream is=con.getInputStream();

            // int data = inputStream.read();
            int content;
            while((content=is.read())!=-1)
            {
                System.out.print((char)content);
                
            }
            is.close();
            // while (data != -1) {
            //     System.out.print((char) data);
            //     data = inputStream.read();
            // }
            // inputStream.close();

            // Save content to file


            FileOutputStream fos=new FileOutputStream("index.html");
             con=url.openConnection();
            is=con.getInputStream();
            while((content=is.read())!=-1)
            {
                fos.write((char)content);
            }
            fos.close();

            // FileOutputStream fileOutputStream = new FileOutputStream("index.html");
            // inputStream = url.openStream();
            // data = inputStream.read();
            // while (data != -1) {
            //     fileOutputStream.write((char) data);
            //     data = inputStream.read();
            // }
            // inputStream.close();
            // fileOutputStream.close();
        } catch (MalformedURLException e) {
            System.out.println("The URL is invalid.");
        } catch (IOException e) {
            System.out.println("An I/O error has occurred.");
        }
    }
}

