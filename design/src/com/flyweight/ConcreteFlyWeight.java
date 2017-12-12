package com.flyweight;

public class ConcreteFlyWeight implements FlyWeight {
	private String name;
	public ConcreteFlyWeight(String name) {
		this.name = name;
	}
	@Override
	public void action(String externalState) {
		System.out.println(this.name+"\t"+externalState);

	}

}
