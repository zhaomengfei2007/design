package com.proxy.statics.inherit;

public class Client {
	public static void main(String[] args) {
		AdminProxy proxy = new AdminProxy();
		proxy.doSomething();
	}
}
