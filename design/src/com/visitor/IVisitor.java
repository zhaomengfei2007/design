package com.visitor;
/*
 * 访问者模式(Visitor)
 * 
 * 角色
 * 抽象访问者：抽象类或者接口，声明访问者可以访问哪些元素，具体到程序中就是visit方法中的参数定义哪些
 *            对象是可以被访问的。
 * 访问者：实现抽象访问者所声明的方法，它影响到访问者访问到一个类后该干什么，要做什么事情。
 * 抽象元素类：接口或者抽象类，声明接受哪一类访问者访问，程序上是通过accept方法中的参数来定义的。抽象
 *            元素一般有两类方法，一部分是本身的业务逻辑，另外就是允许接收哪类访问者来访问。
 * 元素类：实现抽象元素类所声明的accept方法，通常都是visitor.visit(this)，基本上已经形成一种定式了。
 * 结构对象：一个元素的容器，一般包含一个容纳多个不同类、不同接口的容器，如List、Set、Map等，在项目中
 *          一般很少抽象出这个角色。
 */
public interface IVisitor {
	public void visit(ConcreteElement1 el1);
	public void visit(ConcreteElement2 el2);
}

/*
 * 优点
 * 符合单一职责原则：凡是适用访问者模式的场景中，元素类中需要封装在访问者中的操作必定是与元素类本身关系
 *                  不大且是易变的操作，使用访问者模式一方面符合单一职责原则，另一方面，因为被封装的操
 *                  作通常来说都是易变的，所以当发生变化时，就可以在不改变元素类本身的前提下，实现对变
 *                  化部分的扩展。
 * 扩展性良好：元素类可以通过接受不同的访问者来实现对不同操作的扩展。
 * 
 * 缺点
 * 增加新的元素类比较困难。在元素类数目不确定的情况下，应该慎用访问者模式。
 * 
 * 适用场景
 * 假如一个对象中存在着一些与本对象不相干（或者关系较弱）的操作，为了避免这些操作污染这个对象，则可以使
 * 用访问者模式来把这些操作封装到访问者中去。
 * 假如一组对象中，存在着相似的操作，为了避免出现大量重复的代码，也可以将这些重复的操作封装到访问者中去。
 */