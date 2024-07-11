package com.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_Connection {
	
	 private static final String URL = "jdbc:mysql://localhost:3306/student_db";
	    private static final String USER = "root";
	    private static final String PASSWORD = "root";

	    public static Connection getConnection() throws SQLException {
	    	
	    	try {
	    		Class.forName("com.mysql.cj.jdbc.Driver");
	    	}catch (ClassNotFoundException e)
	    	{ 
	    		 e.printStackTrace();
	    	}
	    
	        return DriverManager.getConnection(URL, USER, PASSWORD);
	    }
}
