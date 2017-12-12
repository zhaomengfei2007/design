package com.singleton.lazyHolder;
/*
 * 懒汉单例
 * 改进Singleton1，实施了双重检查锁定
 * */
public class Singleton3 {
	private Singleton3() {};
	private static Singleton3 singleton =null;
	public static Singleton3 getInstance() {
		synchronized(Singleton3.class) {
			if(singleton==null) {
				singleton=new Singleton3();
			}
		}
		return singleton;
	}
}
