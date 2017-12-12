package com.proxy.dynamics.cglib;

public class Client {
	public static void main(String[] args) {
		CGLibProxy proxy = new CGLibProxy();
		Train t = (Train) proxy.getProxy(Train.class);
		t.move();
	}
}
