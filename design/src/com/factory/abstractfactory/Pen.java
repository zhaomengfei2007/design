package com.factory.abstractfactory;

public class Pen implements Writeable {
	@Override
	public void write(String str){
		System.out.println("我是一支钢笔，我目前正在书写"+str);
	}

}
