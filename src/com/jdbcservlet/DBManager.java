package com.jdbcservlet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {

	//private String dB;
	private String userName;
	private String pw;
	private String dbUrl = "jdbc:mysql://localhost/testt";
	Connection conn = null;
    boolean isConnected = false;
    
	DBManager () {
		createDBConnection();

	}


	private void createDBConnection() {


		try {
			// The newInstance() call is a work around for some
			// broken Java implementations

			Class.forName("com.mysql.jdbc.Driver");	
			try {
				conn =  DriverManager.getConnection(dbUrl,userName,pw);
				isConnected = true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (Exception ex) {
			// handle the error
		}
      
		

	}

}

