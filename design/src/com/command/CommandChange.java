package com.command;

public class CommandChange implements Command {
	private Tv myTv;
	private int channel;
	public CommandChange(Tv myTv, int channel) {
		this.myTv = myTv;
		this.channel = channel;
	}
	@Override
	public void execute() {
		myTv.changeChannel(channel); 
	}

}
