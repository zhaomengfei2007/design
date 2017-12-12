package com.factory.simple;

public class Phone implements Runnable {

	@Override
	public void run() {
		System.out.println("开始生产phone");
	}

}
