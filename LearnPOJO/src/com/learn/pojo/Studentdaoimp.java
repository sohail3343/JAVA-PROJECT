package com.learn.pojo;

public class Studentdaoimp implements Studentdao {

	@Override
	public void getValue(Student s) {
		System.out.println(s);
		/*
		 * System.out.println("Address is :  "+s.getAddress());
		 * System.out.println("Age is :  "+s.getAge());
		 * System.out.println("Mob is :  "+s.getMob());
		 * System.out.println("Name is :  "+s.getName());
		 */
		
	}

}
