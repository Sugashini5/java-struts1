package Sqll;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {

	
	public static void main(String[] args) throws ClassNotFoundException
	{

	try {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		DriverManager.getConnection("jdbc:sqlserver://den1.mssql7.gear.host;databaseName=employedatabase1",
				"employedatabase1","mssqldb@123");
		
		
		System.out.println("Connection established");
	} catch (SQLException e) {
		e.printStackTrace();
		// TODO Auto-generated c
}
	}
}
