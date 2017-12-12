package com.memetno;

public class Client {
	public static void main(String[] args) {
		MemoRole role = new MemoRole( 0,"发电机", 1);
		MemoManager manager = new MemoManager();
		System.out.println("机器开始发电:");
		role.getCurrentState();
		System.out.println("---保存当前的机器状态---");
		manager.setMemento(role.createMemoObject());
		role.setDeviceName("发电机");
		role.setStateLevel(5);
		role.setUseTime(1000);
		System.out.println("已经持续发电1000小时");
		role.getCurrentState();
		role.setMemento(manager.getMemento());
		System.out.println("恢复后发电机当前状态：");
		role.getCurrentState();	//表示回到了初始状态，起到了备份作用。
	}
}
