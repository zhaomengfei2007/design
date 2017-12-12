package com.adapter;
/*
 * 适配器模式(Adapter)
 * 有三个重要角色：
 * 目标角色（Target），要转换成的目标接口。在例子中，是中国的两孔接口。
 * 源角色（Adaptee），需要被转换的源接口。在例子中，是美国的三孔接口
 * 适配器角色（Adapter），核心是实现Target接口, 组合Adaptee接口。
 * 
 * Adaptee和Target两个原本不兼容的接口，就可以在一起工作了（荣耀手机可以在美国充电了）。
 * 这里的面向接口编程，得到了松耦合的效果。
 * 
 */
public class AmericaAdapter implements TwoPinSoket {
	ThreePinSoket threePinSoket; //组合三孔插座(adaptee)
	public AmericaAdapter(ThreePinSoket threePinSoket) {
		this.threePinSoket = threePinSoket;
	}
	@Override
	public void chargeWithTwoPin() {
		threePinSoket.chargeWithThreePin();
	}
	@Override
	public int voltage() {
		return threePinSoket.voltage()*2; //适配器把电压从110V升到220V
	}
}
