package com.proxy.statics.inherit;
/*
 * 代理模式(Proxy)
 * 给某一个对象提供一个代理，并由代理对象控制对原对象的引用。
 * 
 * 代理模式包含如下角色：
 * ISubject：抽象主题角色，是一个接口。该接口是对象和它的代理共用的接口。
 * RealSubject：真实主题角色，是实现抽象主题接口的类。
 * Proxy：代理角色，内部含有对真实对象RealSubject的引用，从而可以操作真实对象。
 */
public interface Manager {
	public void doSomething();
}
