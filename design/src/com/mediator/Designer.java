package com.mediator;

public class Designer extends Colleague {
	public Designer(ProjectManagerInterface mediator) {
		super(mediator);
	}
	public void disignerImage(){
		System.err.println("draw a  circle...");
		getMediator().toNextColleague(this);
	}
}
