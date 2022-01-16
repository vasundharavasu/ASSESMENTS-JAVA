package gen_day_12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("connection ready");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels","root","Praveen@2000");
			System.out.println("again ready");
			Statement stmt = con.createStatement();
			int insert = stmt.executeUpdate(insert into abc(id,name)values(1,'abc'),(2,'xyz'));
					
		}
	}
}

}
