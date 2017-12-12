package com.visitor;

public abstract class Element {
	public abstract void accept(IVisitor visitor);
	public abstract void doSomething();
}
