import java.net.*;
public class AllIpAddress {
    public static void main(String[] args) throws UnknownHostException{
        InetAddress[]netflix=InetAddress.getAllByName("www.netflix.com");
        for(InetAddress add:netflix) {
            System.out.println(add.getHostAddress());

        }
    }
}
