package com.builder;

public class Test {

	public static void main(String[] args) {
		VehicleDirector vd=new VehicleDirector();
		Vehicle car=vd.constructVehicle(new CarBuilder());
		Vehicle truck=vd.constructVehicle(new TruckBuilder());
	}

}
