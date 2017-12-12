package com.builder;

public class Vehicle {
	private String wheel;
	private String engine;
	private String frame;
	public Vehicle() {}
	public Vehicle(String wheel, String engine, String frame) {
		this.wheel = wheel;
		this.engine = engine;
		this.frame = frame;
	}
	public String getWheel() {
		return wheel;
	}
	public void setWheel(String wheel) {
		this.wheel = wheel;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getFrame() {
		return frame;
	}
	public void setFrame(String frame) {
		this.frame = frame;
	}
}
