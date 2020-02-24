package com.sdet.testcases;

import java.sql.SQLException;

import org.testng.annotations.Test;
import com.sdet.dbconnection.DBConnection;

public class DBConnectionTest extends DBConnection{
		DBConnection dbconnection;
	
	@Test
	public void connectToDB() throws ClassNotFoundException, SQLException {
		dbconnection = new DBConnection();
		dbconnection.DBConnect();
		
	}

}
