package com.bridge;
/*
 * 桥梁模式(Bridge)
 * 将抽象化与实现化脱耦，使得二者可以独立地变化。
 */
public abstract class Manager {
	private Driver driver;
	public  void getConnection(){
		driver.getConnection();
	}
	public void setDriver(Driver driver){
		this.driver = driver;
	}
}
