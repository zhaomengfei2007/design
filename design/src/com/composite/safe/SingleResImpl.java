package com.composite.safe;
//单一物品(树叶构件)
public class SingleResImpl implements IRes {
	private String name;
	private float money;
	
	public SingleResImpl(String name, float money) {
		this.name = name;
		this.money = money;
	}
	@Override
	public void pay() {
		System.out.println("购买了一件物品["+getName()+"],价钱是[" + getMoney()+"]元");
	}
	public boolean equals(Object obj){
		SingleResImpl res = (SingleResImpl)obj;
		return res.getName().equals(getName()) && res.getMoney()==getMoney();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getMoney() {
		return money;
	}
	public void setMoney(float money) {
		this.money = money;
	}
}
