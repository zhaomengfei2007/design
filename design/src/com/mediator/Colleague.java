package com.mediator;

public abstract class Colleague {
	private ProjectManagerInterface mediator;
	public Colleague(ProjectManagerInterface mediator) {
		this.mediator = mediator;
	}
	public ProjectManagerInterface getMediator() {
		return mediator;
	}
}
