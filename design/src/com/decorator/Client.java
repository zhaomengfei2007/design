package com.decorator;

public class Client {

	public static void main(String[] args) {
		IBread normalBread = new NormalBread();
		normalBread = new SweetDecorator(normalBread);
		normalBread = new CornDecorator(normalBread);
		normalBread.process();
	}

}
