package com.observer.weather;
/*
 * 观察者模式(Observer)
 * 在数据有修改的时候去及时通知所有的观察者。
 */
public interface Observer {
	public void update(float temperature, float humidity, float pressure);
}
