package com.utility;

import java.sql.DriverManager;

public class Jdbc_connector {

	public static void getParticularData() {
		String url = "jdbc:mysql://localhost:3306/employees";
		String username = "root";
		String password = "root@123";
		String query = "select * FROM employees";
		
		DriverManager.getConnection(url, username, password){
			
		}
	}
}
