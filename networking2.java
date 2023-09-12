import java.net.*;
import java.io.*;

class URLConnectionDemo{
    public static void main(String[] args) {
        try {
            URL obj = new URL("https://www.youtube.com");
            HttpURLConnection conn = (HttpURLConnection) obj.openConnection();
            
            System.out.println("Last modified: " + new java.util.Date(conn.getLastModified()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

