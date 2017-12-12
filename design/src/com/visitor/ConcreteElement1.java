package com.visitor;

public class ConcreteElement1 extends Element {

	@Override
	public void doSomething() {
		System.out.println("这是元素1");
	}

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}
}
