package com.factoryMothod;

/*
 * 这是一些可以play(播放)的产品。就ComputerFactory生产车间而言，它负责生产Computer。
 * 这个Computer是具有 Playable 的属性。
 * */
public class Computer implements Playable{

	@Override
	public void play() {
		System.out.println("开始生产computer");
	}

}
