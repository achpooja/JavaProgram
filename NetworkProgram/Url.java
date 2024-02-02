import java.net.*;

public class Url {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.facebook.com/photo/?fbid=6312908662102108&set=a.106827669376936%22");
            System.out.println("Protocol :" + url.getProtocol());
            System.out.println("Domain :" + url.getHost());
            System.out.println("Authority :" + url.getAuthority());
            System.out.println("Port :" + url.getPort());
            System.out.println("Defaultport :" + url.getDefaultPort());
            System.out.println("Path :" + url.getPath());
            System.out.println("File :" + url.getFile());
            System.out.println("QuertString :" + url.getQuery() + "" + "\nAnchor :" + url.getRef());
            System.out.println("URI :"+url.toURI());
            System.out.println("URI :"+url.toString());

        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }
        catch(URISyntaxException e) {
        System.out.println(e.getMessage());
        }
        
    }
}

