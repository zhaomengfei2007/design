package com.builder;

public class TruckBuilder implements  VehicleBuilder{
	Vehicle vehicle;
	public TruckBuilder() {
		vehicle=new Truck();
	}
	@Override
	public void buildWheel() {
		vehicle.setWheel("生产车轮");
	}

	@Override
	public void buildEngine() {
		vehicle.setWheel("生产发动机");
	}

	@Override
	public void buildFrame() {
		vehicle.setWheel("生产车架");
	}

	@Override
	public Vehicle buildVehicle() {
		buildWheel();
		buildEngine();
		buildFrame();
		return vehicle;
	}

}
