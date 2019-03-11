package com.itrix.Utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DbUtil {

	public static synchronized Connection getConnection() 
	{
		Connection con=null;
		try
		{
		  ResourceBundle rs=ResourceBundle.getBundle("DbConfig");
		  String driver=rs.getString("driver");
		  String url=rs.getString("url");
		  String username=rs.getString("username");
		  String password=rs.getString("password");
		  Class.forName(driver);
		  con=DriverManager.getConnection(url,username,password);
		  System.out.println(con);
		  System.out.println("Database Connection");
		  
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return con;
	}
	
}
