package com.prototype.regist;

public class WorkExperience {
	private String workDate;
	private String company;
	public String getWorkDate() {
		return workDate;
	}
	public void setWorkDate(String workDate) {
		this.workDate = workDate;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	/*
	 * 深复制
	 * 浅复制的现象，只复制所考虑的对象，而不复制它的引用对象。使用深复制可以解决此问题。
	 * 如果采用深复制，本类实现Cloneable接口，重写以下注释中的方法，在Resume中clone()改为
	 * 注释中的形式。
	 */
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
