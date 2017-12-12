package com.factory.simple;
/*
 * 简单工厂模式(Simple Factory Pattern)
 * 对于简单的工厂模式，其实也可以将其理解成为一个创建对象的工具类。
 * 在这个工具类里面，我们就可以进行一些其他操作，比如对象的初始化。
 * 这样就避免了把对象初始化的大量代码(如果有大量代码的话)放在构造函数里了。
 * */
public class SimpleFactory {
	public Object create(Class<?> clazz){
		if (clazz.getName().equals(Computer.class.getName())) {  
            return createComputer();  
        } else if (clazz.getName().equals(Phone.class.getName())) {  
            return createPhone();  
        }
		return null;
	}
	private Computer createComputer() {
		return new Computer();
	}
	private Phone createPhone() {
		return new Phone();
	}
}
