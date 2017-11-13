package model;

import java.sql.DriverManager;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;

public class DBConnection
{
	private Connection connection;
	private static DBConnection dbConn;
	
	private DBConnection()
	{
		String dbname = "wdi";
		String connurl = "jdbc:mysql://localhost:3306/" + dbname;
		String username = "root";
		String password = "root";
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			connection = (Connection) DriverManager.getConnection(connurl, username, password);
			System.out.println("CONNECTED");
		} 
		catch (Exception e)
		{
			e.printStackTrace();
			System.err.println("Exception: " + e.getMessage());
		} 
	}
	
	public Connection getConnection()
	{
		return connection;
	}
	
	public static DBConnection getInstance()
	{
		if(dbConn == null)
		{
			dbConn = new DBConnection();
		}
		return dbConn;
	}
}
