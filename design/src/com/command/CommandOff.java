package com.command;

public class CommandOff implements Command {
	private Tv myTv;
	public CommandOff(Tv myTv) {
		this.myTv = myTv;
	}
	@Override
	public void execute() {
		myTv.turnOff();
	}

}
