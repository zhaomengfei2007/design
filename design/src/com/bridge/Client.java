package com.bridge;

public class Client {
	public static void main(String[] args) {
		DriverManager manager = new DriverManager(new MysqlDriver());
		manager.getConnection();
		manager = new DriverManager(new OracleDriver()); 
		manager.getConnection();
	}
}
