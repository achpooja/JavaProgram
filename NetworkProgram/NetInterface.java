import java.net.*;
import java.util.*;
public class NetInterface {
    
    public static void main(String[] args) throws SocketException {
        // TODO Auto-generated method stub
        Enumeration <NetworkInterface> ints =NetworkInterface.getNetworkInterfaces();
        for(NetworkInterface nets:Collections.list(ints)) {
            System.out.println("Display name:"+nets.getDisplayName());
            System.out.println(" name:"+nets.getName());
            System.out.println("************************");
            Enumeration<InetAddress> inet=nets.getInetAddresses();
            for(InetAddress ip:Collections.list(inet))
            System.out.println("Address:"+ip.getHostAddress());



        }


    }
}

