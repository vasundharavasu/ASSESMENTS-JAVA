package gen_day8;

import java.io.File;

public class JavaFileHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	File obj = new File("D:\\JavaIo.txt");
	if(obj.createNewFile()) {
		System.out.println(obj.getName());
	}else
	{
		System.out.println("File already exist");
	}
}catch (Exception e) {
	// TODO: handle exception
}
	}

}
