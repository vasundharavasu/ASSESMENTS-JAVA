package gen_day8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NIODemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Path file = null;  
         BufferedReader bufferedReader = null;  
         try {  
             file = Paths.get("C:\\Genpact Questions\\text.txt");  
             InputStream inputStream = Files.newInputStream(file);  
             bufferedReader = new BufferedReader(new InputStreamReader(inputStream));  
             System.out.println("Reading the Line of testout.txt file: "+ bufferedReader.readLine());  
         } catch (IOException e) {  
             e.printStackTrace();  
         }
 }

	}


