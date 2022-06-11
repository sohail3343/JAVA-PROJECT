package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class embedd_demo {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure();
	SessionFactory factory = cfg.buildSessionFactory();
	Student s1=new Student();
	s1.setCity("mumbai");
	s1.setId(1234);
	s1.setName("sohail");
	Certificate c1=new Certificate();
	c1.setCourse("java");
	c1.setDuration("2 months");
	s1.setCert(c1);
	Session s = factory.openSession();
	Transaction tx = s.beginTransaction();
	s.save(s1);
	tx.commit();
	s.close();
	
	
	
	factory.close();
}
}
