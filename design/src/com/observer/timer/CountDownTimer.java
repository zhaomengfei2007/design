package com.observer.timer;

public class CountDownTimer implements TimerObserver, TimerDisplayable {
	private String mName;
	private long mStartStamp;
	private long mCountdownStamp;
	private long mCurrentStamp = 0L;
	public CountDownTimer(String name, long countdown) {
		this.mStartStamp = System.currentTimeMillis();
		this.mName = name;
		this.mCountdownStamp = countdown;
	}
	@Override
	public void display() {
		if (mCurrentStamp - mStartStamp <= mCountdownStamp) {
			System.out.println(getName() + "还剩" + ((mCountdownStamp - (mCurrentStamp - mStartStamp)) / 1000) + "s");
		}
	}
	@Override
	public void update(long stamp) {
		mCurrentStamp = stamp;
		display();
	}
	public boolean isDone() {
		if (mCurrentStamp - mStartStamp >= mCountdownStamp) {
			return true;
		}
		return false;
	}
	public String getName() {
		return mName;
	}
}
