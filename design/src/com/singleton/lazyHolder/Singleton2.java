package com.singleton.lazyHolder;
/*
 * 懒汉单例
 * 改进Singleton1，在getInstance方法上加同步
 * */
public class Singleton2 {
	private Singleton2() {};
	private static Singleton2 singleton =null;
	public static synchronized Singleton2 getInstance() {
		if(singleton==null) {
			singleton=new Singleton2();
		}
		return singleton;
	}
}
