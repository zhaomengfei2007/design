package com.factory.abstractfactory;

public class Factory extends AbstractFactory {
	@Override
	public Flyable createFlyable() {
		return new Aircraft();
	}
	@Override
	public Moveable createMoveable() {
		return new Car();
	}
	@Override
	public Writeable createWriteable() {
		return new Pen();
	}
}
