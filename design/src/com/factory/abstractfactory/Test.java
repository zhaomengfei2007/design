package com.factory.abstractfactory;

public class Test {
	public static void main(String[] args) {
		AbstractFactory factory = new Factory();
		
        Flyable flyable = factory.createFlyable();
        flyable.fly(1589);
          
        Moveable moveable = factory.createMoveable();
        moveable.move(87.6);
          
        Writeable writeable = factory.createWriteable();
        writeable.write("Hello World.");
	}
}
