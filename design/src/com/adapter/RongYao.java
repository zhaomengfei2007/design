package com.adapter;

public class RongYao {
	TwoPinSoket twoPinSoket;
	public RongYao(){}
	public void setTwoPinSoket(TwoPinSoket twoPinSoket) {
		this.twoPinSoket = twoPinSoket;
	}
	public void chargeRequest() {
		System.out.println("华为荣耀手机，"+twoPinSoket.voltage()+"伏特充电中");
	}
}
