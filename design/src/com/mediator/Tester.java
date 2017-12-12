package com.mediator;

public class Tester extends Colleague {

	public Tester(ProjectManagerInterface mediator) {
		super(mediator);
	}
	public void test(){
		System.err.println("test case...");
		getMediator().toNextColleague(this);
	}
}
