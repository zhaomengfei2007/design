package com.proxy.statics.inherit;

public class Admin implements Manager {

	@Override
	public void doSomething() {
		System.out.println("Admin do something.");
	}

}
