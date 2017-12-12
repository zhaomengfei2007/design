package com.bridge;

public class OracleDriver implements Driver {
	@Override
	public void getConnection() {
		System.out.println("oracle数据库连接");
	}
}
