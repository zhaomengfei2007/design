package com.prototype.regist;

public class Client {
	public static void main(String[] args) {
		Resume a = new Resume("鸟哥");
		a.setPersonalInfo("男",29);
		a.setWorkExperience("1998-2000", "XXXX-公司");
		Resume b = (Resume)a.clone();
		b.setWorkExperience("1998 - 2006", "YY企业");
		Resume c = (Resume)a.clone();
		c.setWorkExperience("1998-2003", "ZZ企业");
		a.display();
		b.display();
		c.display();
	}
}
/*
 * 两种形式的比较：
 * 如果要创建的原型对象数目较少而且比较固定的话，可以采用第一种形式，即简单形式的原始模型。
 * 如果要创建的原型对象数目不固定的话，可以采取第二种形式，也即登记形式的原始模型模式。
 * 
 * 原型模式的优点
 * 原型模式允许动态的添加或减少产品类。
 * 原始模型模式提供简单的创建结构。
 * 原始模型模式具有给一个应用软件动态加载新的功能能力。
 * 产品类不需要非得有任何事先确定的等级结构。
 * 
 * 原型模式的缺点
 * 每一个类都必须配备一个克隆的方法。
 */