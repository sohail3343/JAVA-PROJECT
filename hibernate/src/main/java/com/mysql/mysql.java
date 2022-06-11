package com.mysql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import com.hibernate.Student;

public class mysql {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure();
	SessionFactory factory = cfg.buildSessionFactory();
	Session s = factory.openSession();
	String q="select * from Student";
	NativeQuery nq = s.createNativeQuery(q);
	List<Object[]> list = nq.list();
	for(Object[] st:list)
		
	{
		System.out.println(Arrays.deepToString(st));
	}
	
	
	
	
}
}
