package com.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cache.ehcache.internal.EhcacheRegionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.Student;

import net.sf.ehcache.hibernate.EhCacheRegionFactory;

public class SecondcacheDemo {
public static void main(String[] args) {

	Configuration cfg=new Configuration();
	cfg.configure();
	SessionFactory factory = cfg.buildSessionFactory();
	Session s1 = factory.openSession();
	Student st1 = s1.get(Student.class, 5);
	System.out.println(st1);
	s1.close();
	Session s2 = factory.openSession();
	Student st2 = s2.get(Student.class, 5);
	System.out.println(st2);
	Student st3 = s2.get(Student.class, 6);
	System.out.println(st3);
	
	
	s2.close();
	
	
	
	factory.close();
}
}
