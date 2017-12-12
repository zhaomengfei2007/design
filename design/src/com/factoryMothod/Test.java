package com.factoryMothod;

public class Test {
	public static void main(String[] args) {
		VehicleFactory factory = new ComputerFactory();  
		Playable playable = factory.create();  
		playable.play();
	}
}
