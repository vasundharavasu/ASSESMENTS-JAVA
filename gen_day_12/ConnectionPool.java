package gen_day_12;

import java.sql.Connection;

public class ConnectionPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BasicDataSource dataSource = new BasicDataSource();
dataSource.setDriverClassName("con.mysql.jdbc.Driver");
dataSource.setUrl("jdbc:mysql://localhost:3306/mydatabase");
dataSource.setUsername("root");
dataSource.setPassword("");
dataSource.setInitialSize(1);
Connection con = dataSource.getConnection();
System.out.println("Connection Object information :"+ con);
	}

}
