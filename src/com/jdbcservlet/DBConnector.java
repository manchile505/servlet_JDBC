package com.jdbcservlet;

import java.sql.Connection;

public class DBConnector {
	Connection conn = null;
	
	private String DB;
	private String userName;
	private String pw; 
	
		
	public String getDB() {
		return DB;
	}


	public void setDB(String dB) {
		DB = dB;
	}


	public String getUserName() {
		return userName;
	}




	public void setUserName(String userName) {
		this.userName = userName;
	}





	public String getPw() {
		return pw;
	}





	public void setPw(String pw) {
		this.pw = pw;
	}





	public Connection connectToDB() {
		
		
		try {
			// The newInstance() call is a work around for some
			// broken Java implementations

			Class.forName("com.mysql.jdbc.Driver");
			
		} catch (Exception ex) {
			// handle the error
		}
		return conn;
	}

}
