package com.learn.pojo;

public class Student {
	
	private String name;
	private String address;
	private String mob;
	private int age;
	public Student() {
		super();
		}
	public Student(String name, String address, String mob, int age) {
		super();
		this.name = name;
		this.address = address;
		this.mob = mob;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", mob=" + mob + ", age=" + age + "]";
	}
	
	

}
