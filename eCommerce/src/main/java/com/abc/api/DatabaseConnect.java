package com.abc.api;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseConnect {
	
	private static Connection con;
	private static Statement statement;

	public static ResultSet executeQuery (String query) {
		
		ResultSet rs = null;
		return rs;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ABCCompany", "root", "root");
			
			statement = con.createStatement();
			
			rs = statement.executeQuery(query);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
	}
		
		return rs;

}
