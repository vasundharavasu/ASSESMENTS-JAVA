package gen_day8;

import java.io.FileInputStream;
import java.io.InputStreamReader;

//ready(), close(), getEncoding(),
public class InputStreamReader1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	FileInputStream f = new FileInputStream("D:JavaIo.txt");
	InputStreamReader ir = new InputStreamReader(f);
	String str = ir.getEncoding();
	System.out.println(str);
	int x;
	while((x=ir.read())!=-1) {
		char r = (char) x;
		System.out.println(r);
		boolean b = ir.ready();
		System.out.println(b);
	}
	
}catch (Exception e) {
	// TODO: handle exception
}
	}

}
