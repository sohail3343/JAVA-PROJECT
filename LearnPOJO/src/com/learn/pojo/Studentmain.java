package com.learn.pojo;

import com.learn.pojo.Student;

public class Studentmain {
	public static void main(String[] args) {
		Student s = new Student("sohail", "sakinaka", "888888", 20);
		Studentdao sd = new Studentdaoimp();
		sd.getValue(s);
		/*
		 * s.setAddress("sakinaka"); s.setAge(20); s.setMob("9813786116");
		 * s.setName("mudassir");
		 * 
		 */
		/*
		 * System.out.println("Address is :  "+s.getAddress());
		 * System.out.println("Age is :  "+s.getAge());
		 * System.out.println("Mob is :  "+s.getMob());
		 * System.out.println("Name is :  "+s.getName());
		 */
		/* System.out.println(s); */

	}
}
