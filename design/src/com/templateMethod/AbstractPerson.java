package com.templateMethod;
/*
 * 模板方法模式（Template Method）
 * 准备一个抽象类，将部分逻辑以具体方法以及具体构造函数的形式实现，然后声明一些抽象方法来迫使子类实现剩余的逻辑。不同
 * 的子类可以以不同的方式实现这些抽象方法，从而对剩余的逻辑有不同的实现。
 * 
 * 角色
 * 抽象类（AbstractClass）：实现了模板方法，定义了算法的骨架。
 * 具体类（ConcreteClass)：实现抽象类中的抽象方法，已完成完整的算法。
 */
public abstract class AbstractPerson {
	public void prepareGotoSchool(){
		dressUp();
		eatBreakfast();
		takeThings();
	}
	protected abstract void dressUp();  
	protected abstract void eatBreakfast();  
	protected abstract void takeThings(); 
}
/*
 * 优点：
 * （1）模板方法模式通过把不变的行为搬移到超类，去除了子类中的重复代码。
 * （2）子类实现算法的某些细节，有助于算法的扩展。
 * （3）通过一个父类调用子类实现的操作，通过子类扩展增加新的行为，符合“开放-封闭原则”。
 * 
 * 缺点：
 * 每个不同的实现都需要定义一个子类，这会导致类的个数的增加，设计更加抽象。
 * 
 * 适用场景：
 * （1）在某些类的算法中，用了相同的方法，造成代码的重复。
 * （2）控制子类扩展，子类必须遵守算法规则。
 * 
 * 
 * 
 */