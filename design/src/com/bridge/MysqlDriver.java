package com.bridge;

public class MysqlDriver implements Driver{
	@Override
	public void getConnection() {
		System.out.println("mysql 数据库连接");
	}
}