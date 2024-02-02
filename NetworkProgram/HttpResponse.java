import java.net.*;
import java.io.*;
public class HttpResponse {
    public static void main(String [] args) throws IOException
    {
        URL url = new URL("http://xyz.com");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

        System.out.println("Response Code : " + conn.getResponseCode());
        System.out.println("Response message : " + conn.getResponseMessage());
        System.out.println("Connection Timeout : " + conn.getConnectTimeout());
        System.out.println("Encoding : " + conn.getContentEncoding());
        System.out.println("Length of Content : " + conn.getContentLength());
        System.out.println("Type of Content : " + conn.getContentType());
        System.out.println("Response Type : " + conn.getRequestMethod());
        System.out.println("Date : " + conn.getDate());
    }
    
}
