package com.proxy.statics.converged;

public class AdminPoly implements Manager {
	private Admin admin;
	public AdminPoly(Admin admin) {
		super();
		this.admin = admin;
	}
	@Override
	public void doSomething() {
		admin.doSomething(); 
	}

}
