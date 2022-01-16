package gen_day_12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class PrepareStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("connection ready");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels","root","Praveen@2000");
			System.out.println("again ready");
			PreparedStatement p1 =  con.prepareStatement("insert into abc values(? ?)");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			do {
			System.out.println("enter id");  int id = Integer.parseInt(br.readLine());
			System.out.println("enter name");  String name = br.readLine();
			
			 p1.setInt(1,id);
             p1.setString(2,name);
               int row = p1.executeUpdate();
               System.out.println(row + "rows  Inserted ");
               System.out.println("Do u want to insert more records: y/n");
               String s = br.readLine();
               if (s.startsWith("n"))
               {
            	   break;
               }}
            while(true);
			
			
               }catch (Exception e) {
		// TODO: handle exception
	}
		
	
	
}
}
