package gen_day8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileInputStream f = new FileInputStream("D:\\p1.txt");
//int data = f.read();
//System.out.println((char)data);//

int i = 0;
while((i=f.read())!=-1) {
	System.out.println((char)i);
}
f.close();

	}

}
