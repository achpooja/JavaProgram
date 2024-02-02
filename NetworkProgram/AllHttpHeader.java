import java.net.*;
import java.io.*;
import java.util.*;

public class AllHttpHeader {
 

    public static void main(String[] args)throws IOException ,ClassNotFoundException{

        URL url= new URL("https://www.google.com/%22");
        HttpURLConnection cn=(HttpURLConnection)url.openConnection();
        Map <String,List<String>>headers=cn.getHeaderFields();

        for(Map.Entry<String,List<String>>h:headers.entrySet()){

        System.out.println(h.getKey()+":"+h.getValue());



        }

    }
}

