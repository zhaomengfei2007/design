package com.singleton.starvingHolder;
/*
 * 饿汉式在类
 * 创建的同时就已经创建好一个静态的对象供系统使用，以后不再改变，所以天生是线程安全的。
 * */
public class Singleton {
	private Singleton(){};
	private static final Singleton single = new Singleton();
	public static Singleton getInstance(){
		return single;
	}
}
/*
 * 饿汉就是类一旦加载，就把单例初始化完成，保证getInstance的时候，单例是已经存在的了，
 * 懒汉比较懒，只有当调用getInstance的时候，才回去初始化这个单例。
 * 
 * 1、线程安全：
 * 饿汉式天生就是线程安全的，可以直接用于多线程而不会出现问题，
 * 懒汉式本身是非线程安全的，为了实现线程安全有几种写法。
 * 
 * 2、资源加载和性能：
 * 饿汉式在类创建的同时就实例化一个静态对象出来，不管之后会不会使用这个单例，
 * 都会占据一定的内存，但是相应的，在第一次调用时速度也会更快，因为其资源已经初始化完成，
 * 
 * 懒汉式会延迟加载，在第一次使用该单例的时候才会实例化对象出来，第一次调用时要做初始化，
 * 如果要做的工作比较多，性能上会有些延迟，之后就和饿汉式一样了。
 * 
 */