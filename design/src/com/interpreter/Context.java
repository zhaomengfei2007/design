package com.interpreter;

public class Context {
	private String in;
	private int out;
	public Context(String in) {
		this.in = in;
	}
	public String getIn() {
		return in;
	}
	public void setIn(String in) {
		this.in = in;
	}
	public int getOut() {
		return out;
	}
	public void setOut(int out) {
		this.out = out;
	}
}
