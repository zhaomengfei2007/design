package com.decorator;
/*
 * 装饰者模式(Decorator)
 * java.io中很多使用了装饰者模式
 * 
 * (1)被装饰者抽象Component:是一个接口或者抽象类,定义最核心的对象,这个类是装饰者的基类,例如IBread接口；
 * (2)被装饰者具体实现ConcreteComponent:这是Component接口或抽象类的实现,例如本例中的NormalBread；
 * (3)装饰者Decorator:一般是抽象类,实现Component,它里面必然有一个指向Component的引用,例如本例中AbstractBread；
 * (4)装饰者实现ConcreteDecorator1和ConcreteDecorator2:用来装饰最基本的类,如本例中的CornDecorator。
 * 
 * 使用场合
 * 1.需要为某个现有对象添加一个新的功能或职责时,可以考虑使用装饰者模式；
 * 2.某个对象的职责经常发生变化或经常需要动态添加职责,避免为了适应这种变化造成的继承扩展方式。
 */
public interface IBread {
	public void prepair();
	public void kneadFlour();
	public void steamed();
	public void process();
}
