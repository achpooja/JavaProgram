import java.net.*;
import java.io.*;
public class URIConnection {
    
    public static void main(String[] args) throws IOException {
    URL url=new URL("http://www.google.com");
    URLConnection cn=url.openConnection();
    InputStream is=cn.getInputStream();
    int content;
    while((content=is.read()) != -1) {
    System.out.print((char)content);
    }
    is.close();
    }
    

}
