package gen_day8;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputStream1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream f = new FileInputStream("D:\\JavaIo.txt");
		BufferedInputStream b = new BufferedInputStream(f);
		int i;
		while((i=b.read())!=-1) {
			System.out.println((char)i);
		}
		b.close();
		
		f.close();

	}

}
