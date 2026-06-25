package sbi.insurance.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	private DbConnection() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static Connection dbCon() throws SQLException
	{
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/sda","root","root");
		return connection;
	}

}
