package com.builder;

public class CarBuilder implements  VehicleBuilder{
	Vehicle vehicle;
	public CarBuilder() {
		vehicle=new Car();
	}
	@Override
	public void buildWheel() {
		vehicle.setWheel("生产车轮");
	}
	@Override
	public void buildEngine() {
		vehicle.setEngine("生产发动机");
	}
	@Override
	public void buildFrame() {
		vehicle.setFrame("生产车架");
	}
	@Override
	public Vehicle buildVehicle() {
		buildWheel();
		buildEngine();
		buildFrame();
		return vehicle;
	}
}
