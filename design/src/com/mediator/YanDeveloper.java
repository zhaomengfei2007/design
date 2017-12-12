package com.mediator;

public class YanDeveloper extends Colleague {
	public YanDeveloper(ProjectManagerInterface mediator) {
		super(mediator);
	}
	public void coding() {
		System.err.println("coding by xiao yan");
		getMediator().toNextColleague(this);
	}
}
