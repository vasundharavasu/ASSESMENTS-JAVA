package gen_day_12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_Demo {
public static void main(String[] args) {
	try {
		
Class.forName("com.mysql.jdbc.Driver");
System.out.println("connection ready");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels","root","Praveen@2000");
System.out.println("again ready");
Statement stmt = con.createStatement();
ResultSet rs = stmt.executeQuery("select * from eproduct");
while(rs.next())
	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
con.close();
		


	}catch (Exception e) {
		// TODO: handle exception
	}
}
}
