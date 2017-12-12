package com.composite.transparent;

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
		System.out.println("购买了一件物品["+getName()+"],价钱是["+getMoney()+"]元"); 
	}
	public String getName() {
		return name;
	}
	public float getMoney() {
		return money;
	}
	public boolean equals(Object obj){  
		SingleResImpl res = (SingleResImpl)obj;      
		return res.getName().equals(getName()) && res.getMoney()==getMoney();  
	}
	@Override
	public void addRes(IRes res) {
	}
	@Override
	public void removeRes(IRes res) {
	}  
}
