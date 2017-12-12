package com.facade;

public class Client {

	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.test();
		ModuleFacade mf=new ModuleFacade();
		mf.a1();
		mf.b1();
	}

}
