package com.adapter;

public class TwoPinSoketChina implements TwoPinSoket {

	@Override
	public void chargeWithTwoPin() {
		System.out.println("中国标准的两孔的插座");
	}

	@Override
	public int voltage() {
		return 220; //中国电压是220伏
	}

}
