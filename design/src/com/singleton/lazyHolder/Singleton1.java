package com.singleton.lazyHolder;
/*
 * 懒汉式单例
 * 它是线程不安全的，并发环境下很可能出现多个Singleton实例
 * */
public class Singleton1 {
	private Singleton1() {};
	private static Singleton1 singleton =null;
	public static Singleton1 getInstance() {
		if(singleton==null) {
			singleton=new Singleton1();
		}
		return singleton;
	}
}
