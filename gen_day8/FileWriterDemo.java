package gen_day8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class FileWriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "File handling in java using file writer in the example for writing something into file";

try {
	FileWriter fw = new FileWriter("C:\\Genpact Questions\\text.txt");
	for(int i = 0;i<s.length();i++)
		fw.write(s.charAt(i));
	System.out.println("writing done");
	fw.close();
	FileReader fr = new FileReader("C:\\Genpact Questions\\text.txt");
	BufferedReader bu = new BufferedReader(fr);
	int k;
	while((k=bu.read())!=-1) {
		System.out.print((char)k);
	}
}catch (Exception e) {
	// TODO: handle exception
}
	}

}
