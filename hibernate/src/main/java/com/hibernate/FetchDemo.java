package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure();
	SessionFactory factory = cfg.buildSessionFactory();
	Session session = factory.openSession();
	//get-student id:409
	Student student = (Student)session.get(Student.class,410);
	Student student1 = (Student)session.get(Student.class,411);
	System.out.println(student);
	System.out.println(student1);
	Address ad = (Address)session.load(Address.class,1);
	System.out.println(ad);
	
	
	
	session.clear();
	factory.close();
}
}
