package com.prototype.simple;

public class Test {
	public static void main(String[] args) {
		Prototype prototype = new ConcretePrototype();
		prototype.setName("zhangsan");
		Prototype p = prototype.clone();
		System.out.println(prototype == p);
		System.out.println(prototype.getName());
		System.out.println(p.getName());
	}
}
