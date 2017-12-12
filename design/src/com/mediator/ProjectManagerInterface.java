package com.mediator;
/*
 * 调停者模式(Mediator)
 * 包装了一系列对象相互作用的方式，使得这些对象不必相互明显引用。从而使它们可以较松散地耦合。当这些对象中的某些对象
 * 之间的相互作用发生改变时，不会立即影响到其他的一些对象之间的相互作用。
 * 
 */
public interface ProjectManagerInterface {
	public void toNextColleague(Colleague c);
}
