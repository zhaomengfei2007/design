package com.responsibleityChain;
/*
 * 使多个对象都有机会处理请求，从而避免请求的发送者和接受者之间的耦合关系，
 * 将这个对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理他为止。
 * 
 * 角色
 * 抽象处理者角色(Handler)：定义出一个处理请求的接口。如果需要，接口可以定义出一个方法以设定和返回对下家的引用。这个
 *                         角色通常由一个Java抽象类或者Java接口实现。
 * 具体处理者角色(ConcreteHandler)：具体处理者接到请求后，可以选择将请求处理掉，或者将请求传给下家。由于具体处理者持
 *                                 有对下家的引用，因此，如果需要，具体处理者可以访问下家。
 * 
 * 优势：
 * （1）改变内部的传递规则
 * 在内部，项目经理完全可以跳过人事部到那一关直接找到总经理。
 * 每个人都可以去动态地指定他的继任者。
 * （2）可以从职责链任何一关开始。
 * 如果项目经理不在，可以直接去找部门经理，责任链还会继续，没有影响。
 * （3）用与不用的区别
 * 不用职责链的结构，我们需要和公司中的每一个层级都发生耦合关系。
 * 如果反映在代码上即使我们需要在一个类中去写上很多if….else语句。
 * 如果用了职责链，相当于我们面对的是一个黑箱，我们只需要认识其中的一个部门，然后让黑箱内部去负责传递就好了。
 */
public abstract class Handler {
	protected Handler successor;
	public abstract void handleRequest();
	public Handler getSuccessor() {
		return successor;
	}
	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}
}
