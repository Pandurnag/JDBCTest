package com.jdbc.practice;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	private static Connection con;
	
	public static Connection getConnection() 
	{
		try {
			
		
		if (con==null)
		{
		  class.forName("com.mysql.jdbc.Driver");	
		  
		  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube", "root", "root");
		}
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		return con;
	}

}
