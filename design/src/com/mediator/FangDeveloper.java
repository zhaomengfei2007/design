package com.mediator;

public class FangDeveloper extends Colleague {
	public FangDeveloper(ProjectManagerInterface mediator) {
		super(mediator);
	}
	public void coding() {
		System.err.println("coding by xiao fang");
		getMediator().toNextColleague(this);
	}
}
