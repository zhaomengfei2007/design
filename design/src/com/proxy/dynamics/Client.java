package com.proxy.dynamics;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
//静态代理的代理类是编写好的，而动态代理则不需要编写代理类，在程序中动态生成的。
	public static void main(String[] args) throws InterruptedException {
		Car car = new Car();
		InvocationHandler h = new TimeHandler(car);
		Class<?> cls = car.getClass();
		//需要3个参数：类加载器（要进行代理的类），被代理类实现的接口，事务处理器
		Moveable m = (Moveable)Proxy.newProxyInstance(cls.getClassLoader(),cls.getInterfaces(),h);
		m.move();
	}
}
/*
 * 动态代理与静态代理相比较，最大的好处是接口中声明的所有方法都被转移到调用处理器一个集中的方法中处理。
 * 在接口方法数量比较多的时候，可以进行灵活处理，而不需要像静态代理那样对每一个方法或方法组合进行处理。
 */