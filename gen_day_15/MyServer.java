package gen_day_15;
import java.net.*;
import java.io.*;
public class MyServer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
ServerSocket s1 = new ServerSocket(5555);
Socket s = s1.accept();
DataInputStream dis = new DataInputStream(s.getInputStream());
String st = dis.readUTF();
System.out.println("Data = "+ st);
s1.close();

	}

}
