package com.pagination;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.hibernate.Student;

public class PaginationExample {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure();
	SessionFactory factory = cfg.buildSessionFactory();
	Session session = factory.openSession();
	Query<Student> query = session.createQuery("from Student",Student.class);
	
	//implementing pagination using hibernate
	
	query.setFirstResult(5);
	query.setMaxResults(4);
	
	List<Student> list = query.list();
	for(Student s:list)
	{
		System.out.println(s.getName()+" : "+s.getId()+"  "+s.getCity());
	
		
	}
	
	
	
	
	
	
	
	
	session.close();
	
	factory.close();
}
}
