package net.user.action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect  {
	public Connection driverDbcon() throws ClassNotFoundException, SQLException{
		System.out.println("드라이버로딩 및db연결");
		Connection reconn=null;
		Class.forName("com.mysql.jdbc.Driver");
		
		String jdbcDriver = "jdbc:mysql://localhost:3306/dev22db07?" +
				"useUnicode=true&characterEncoding=euckr";
		String dbUser = "dev22id07";
		String dbPass = "dev22pw07";
		
		reconn = DriverManager.getConnection(jdbcDriver, dbUser, dbPass);
		System.out.println(reconn);
		return reconn;
		
	}
}
