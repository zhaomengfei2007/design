package com.observer.timer;

public interface TimerSubject {
	public void registerObserver(TimerObserver o);
	public void removeObserver(TimerObserver o);
	public void notifyObservers();
}
