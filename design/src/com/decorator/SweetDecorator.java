package com.decorator;

public class SweetDecorator extends AbstractBread {
	public SweetDecorator(IBread bread) {
		super(bread);
	}
	public void paint(){
		System.out.println("添加甜蜜素...");
	}
	public void kneadFlour(){
		this.paint();
		super.kneadFlour();
	}
}
