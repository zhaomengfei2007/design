package com.factory.abstractfactory;

public class Car implements Moveable {

	@Override
	public void move(double speed) {
		System.out.println("我是一辆汽车，我目前的时速为："+speed+"千米。");
	}

}
