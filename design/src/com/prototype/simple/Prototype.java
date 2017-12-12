package com.prototype.simple;
/*
 * 原始原型模式(Prototype)
 * 原型模式属于对象的创建模式。通过给出一个原型对象来指明所要创建的对象的类型，然后用复制这个
 * 原型对象的创建办法创建出更多同类型的对象。
 * 不通过new来创建对象而是通过拷贝来创建对象的模式就叫做原型模式。
 * 
 * 简单形式的原始模型模式
 * 
 * 客户角色：客户类提出创建对象的请求。
 * 抽象原型：这是一个抽象角色，通常使用接口或抽象类实现。此角色给出所有具体原型类所需的接口。
 * 具体原型：被复制的对象。此角色需要实现抽象角色所提供的方法。
 * */
public interface Prototype extends Cloneable{
	public Prototype clone();
	public void setName(String name);
	public String getName();
}
