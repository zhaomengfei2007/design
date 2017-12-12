package com.prototype.regist;

public class Resume implements Cloneable{
	private String name;
	private String sex;
	private int age;
	private WorkExperience work;
	public Resume(String name) {
		this.name=name;
		work=new WorkExperience();
	}
	public void setPersonalInfo(String sex,int age){
		this.sex = sex;
		this.age = age;
	}
	public void setWorkExperience(String workDate,String company){
		work.setWorkDate(workDate);
		work.setCompany(company);
	}
	public void display(){
		System.out.println("姓名："+name+"性别："+sex+"年龄：" + age);
		System.out.println("工作日期："+work.getWorkDate()+"工作公司："+work.getCompany());
	}
	public Object clone(){
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}
	//如果使用深复制
	/*public Object clone(){
		try {
			Resume resume=(Resume) super.clone();
			return resume;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}*/
}
