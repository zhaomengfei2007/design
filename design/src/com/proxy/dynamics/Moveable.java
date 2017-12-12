package com.proxy.dynamics;
/*
 * 动态代理
 * 多个主题类对应一个代理类，共享“前处理，后处理”功能，动态调用所需主题，大大减小了程序规模
 */
public interface Moveable {
	public void move() throws InterruptedException;
}
