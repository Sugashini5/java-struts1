package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

 public abstract class NewSql   {

	 private static Connection connection;
	static {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			connection = DriverManager.getConnection("jdbc:sqlserver://den1.mssql7.gear.host;databaseName=employedatabase1",
					"employedatabase1","mssqldb@123");
			
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	  }

	   public static Connection getConnection() {
		   return connection;
	   }
	}


