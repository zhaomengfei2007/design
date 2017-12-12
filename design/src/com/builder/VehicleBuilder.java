package com.builder;

public interface VehicleBuilder {
	public void buildWheel();
	public void buildEngine();
	public void buildFrame();
	public Vehicle buildVehicle();
}
