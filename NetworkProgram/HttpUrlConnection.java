
import java.net.*;
import java.io.*;

public class HttpUrlConnection {
    public static void main(String[] args) throws IOException {
    URL url =new URL("http://www.xyz.com");
    HttpURLConnection conn = (HttpURLConnection)url.openConnection();
    if(conn.getResponseCode()==HttpURLConnection.HTTP_OK);
    {
        InputStream in = conn.getInputStream();
        int content;
        while((content = in.read()) != -1)
        {
            System.out.print((char)content);
        }
        in.close();
    }
    }
}
