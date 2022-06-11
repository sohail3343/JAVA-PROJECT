package com.mapping.xml;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class person_main {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure();
	SessionFactory factory = cfg.buildSessionFactory();
	
	person p=new person();
	p.setId(1);
	p.setName("sohail");
	p.setPhoneno("8898525960");
	p.setAddress("sakinaka");
	Session session = factory.openSession();
	Transaction tx = session.beginTransaction();
	session.save(p);
	tx.commit();
	
	
	
	
	
	
	
	session.close();
	factory.close();
}
}
