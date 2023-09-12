import java.net.*;
import java.io.*;

class IPAddress{
	public static void main(String[] ar) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String Site = br.readLine();
		InetAddress ip = InetAddress.getByName(Site);
		System.out.println("IP Address=" + ip);
	}
}

