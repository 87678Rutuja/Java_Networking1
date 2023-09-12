import java.net.*;
import java.io.*;

class URLDemo{
	public static void main(String[] ar)throws MalformedURLException{
	URL obj= new URL("http://www.core2web.in");
	System.out.println(obj.getProtocol());
	System.out.println(obj.getPort());
	System.out.println(obj.getFile());
}
}
