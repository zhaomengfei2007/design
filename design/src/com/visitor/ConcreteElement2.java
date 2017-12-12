package com.visitor;

public class ConcreteElement2 extends Element {

	@Override
	public void doSomething() {
		System.out.println("这是元素2");
	}

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}
}
