package com.proxy.statics.converged;

public class Client {
	public static void main(String[] args) {
		Admin admin = new Admin();
		Manager m = new AdminPoly(admin);
		m.doSomething();
	}
}
