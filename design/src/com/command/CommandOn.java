package com.command;

public class CommandOn implements Command {
	private Tv myTv;
	public CommandOn(Tv myTv) {
		this.myTv = myTv;
	}
	@Override
	public void execute() {
		myTv.turnOn();
	}

}
