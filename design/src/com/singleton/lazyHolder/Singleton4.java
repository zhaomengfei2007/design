package com.singleton.lazyHolder;
/*
 * 懒汉单例
 * 静态内部类
 * 比1,2都好一些，既实现了线程安全，又避免了同步带来的性能影响。
 * */
public class Singleton4 {
	private static class LazyHolder {
		private static final Singleton4 INSTANCE = new Singleton4();
	}
	private Singleton4(){};
	public static final Singleton4 getInstance() {
		return LazyHolder.INSTANCE;
	}
}
