package com.jdbcservlet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {

	//private String dB;
	private String userName;
	private String pw;
	private String dbUrl = "jdbc:mysql://localhost/test";
	Connection conn = null;
	boolean isConnected = false;

	DBManager () {
		createDBConnection();
	}


	private void createDBConnection() {

		try {

			// load class
			Class.forName("com.mysql.jdbc.Driver");	
			try {
				conn =  DriverManager.getConnection(dbUrl,userName,pw);
				isConnected = true;
			} catch (SQLException e) {

				// handle any errors
				System.out.println("SQLException: " + e.getMessage());
				System.out.println("SQLState: " + e.getSQLState());
				System.out.println("VendorError: " + e.getErrorCode());
			}

		} catch (Exception ex) {
			// handle the error
		}



	}

}

