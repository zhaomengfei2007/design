package com.factory.abstractfactory;
/*
 * 抽象工厂模式(Abstract Factory Pattern)
 * 为创建一组相关或相互依赖的对象提供一个接口，而且无需指定他们的具体类。
 * 可以更好地解释这一定义。抽象工厂中包含一系列的去构造一个抽象产品的方法，
 * 而具体产品的实现则是放在了具体工厂。
 * */
public abstract class AbstractFactory {
	public abstract Flyable createFlyable();  
    public abstract Moveable createMoveable();  
    public abstract Writeable createWriteable();
}