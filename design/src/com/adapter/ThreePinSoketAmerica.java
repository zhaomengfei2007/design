package com.adapter;

public class ThreePinSoketAmerica implements ThreePinSoket {
	@Override
	public void chargeWithThreePin() {
		System.out.println("美国标准的三孔的插座");
	}
	@Override
	public int voltage() {
		return 110; //美国电压是110伏
	}
}
