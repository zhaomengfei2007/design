package com.factoryMothod;

public class ComputerFactory extends VehicleFactory {

	@Override
	public Playable create() {
		return new Computer();
	}

}
