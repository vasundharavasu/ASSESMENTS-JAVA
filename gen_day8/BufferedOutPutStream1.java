package gen_day8;

import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
public class BufferedOutPutStream1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
		
FileOutputStream fo = new FileOutputStream("C:JavaIo.txt");
BufferedOutputStream bo = new BufferedOutputStream(fo);
String s1 = "Here we are using File IO operations with byte and character stream";
byte bb[] = s1.getBytes();
bo.write(bb);
bo.flush();
bo.close();
fo.close();



	

}catch (Exception e) {
	// TODO: handle exception
}
}
}

