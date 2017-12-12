package com.factory.simple;

public class Computer implements Runnable{

	@Override
	public void run() {
		System.out.println("开始生产computer");
	}

}
