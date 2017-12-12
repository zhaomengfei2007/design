package com.memetno;
/*
 * 备忘录模式(Memetno)
 * 在不破坏封装性的前提下，获取到一个对象的内部状态，并在对象之外记录或保存这个状态。在有需要的时候可将该对象恢复到
 * 原先保存的状态。我们相当于把对象原始状备份保留。
 * 
 * 角色对象组成： 
 * （1）发起者对象：负责创建一个备忘录来记录当前对象的内部状态，并可使用备忘录恢复内部状态。 
 * （2）备忘录对象：负责存储发起者对象的内部状态，并防止其他对象访问备忘录。 
 * （3）管理者对象:负责备忘录权限管理，不能对备忘录对象的内容进行访问或者操作。
 * 
 * 优点：
 * （1）备忘录模式可以把发起人内部信息对象屏蔽起来，从而可以保持封装的边界。
 * （2）简化了发起人类。当发起人角色的状态改变的时候，有可能这个状态无效，这时候就可以使用暂时存储起来的备忘录将状态复原。
 * 
 * 缺点：
 * （1）如果状态需要完整地存储到备忘录对象中，那么在资源消耗上面备忘录对象比较昂贵。
 * （2）当发起者对象的状态改变的时候，有可能这个协议无效。如果状态改变的成功率达不到要求，可以考虑采取“假如”协议模式。
 */
public class MemoRole {
	private int useTime;
	private String deviceName;
	private int stateLevel;
	public MemoRole(int useTime, String deviceName, int stateLevel) {
		super();
		this.useTime = useTime;
		this.deviceName = deviceName;
		this.stateLevel = stateLevel;
	}
	public MemoRole() {
		super();
	}
	public int getUseTime() {
		return useTime;
	}
	public void setUseTime(int useTime) {
		this.useTime = useTime;
	}
	public String getDeviceName() {
		return deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	public int getStateLevel() {
		return stateLevel;
	}
	public void setStateLevel(int stateLevel) {
		this.stateLevel = stateLevel;
	}
	public MemoBean createMemoObject() {
		MemoBean memento = new MemoBean();
		memento.setDeviceName(deviceName);
		memento.setStateLevel(stateLevel);
		memento.setUseTime(useTime);
		return memento;
	}
	public void setMemento(MemoBean memento) {
		this.deviceName = memento.getDeviceName();
		this.stateLevel = memento.getStateLevel();
		this.useTime = memento.getUseTime();
	}
	public void getCurrentState() {
		System.out.println("当前设备名称：" + 
				this.deviceName + "当前使用时间：" + 
				this.useTime + "当前工作状态：" + 
				this.stateLevel);
	}
}
