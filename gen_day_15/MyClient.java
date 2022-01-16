package gen_day_15;
import java.net.*;
import java.io.*;
public class MyClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
Socket s = new Socket("localhost",5555);
DataOutputStream dos = new DataOutputStream(s.getOutputStream());
dos.writeUTF("Hello server data");
dos.flush();
dos.close();
s.close();


	}

}
