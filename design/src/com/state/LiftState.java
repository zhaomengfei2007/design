package com.state;
/*
 * 状态模式(State)
 * 一般程序中经常会使用If else if else 进行状态切换，如果针对状态的这样判断切换反复出现，就要联想到是否可以采取
 * State模式了。
 * 
 */
public abstract class LiftState {
	protected Context context;
	public void setContext(Context _context) {
		this.context = _context;
	}
	public abstract void open();
	public abstract void close();
	public abstract void run();
	public abstract void stop();
}
