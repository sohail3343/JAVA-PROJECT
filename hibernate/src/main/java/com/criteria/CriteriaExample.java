package com.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.hibernate.Student;

public class CriteriaExample {

public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure();
	SessionFactory factory = cfg.buildSessionFactory();
	Session session = factory.openSession();
	
	Criteria criteria = session.createCriteria(Student.class);
	criteria.add(Restrictions.eq("name", "md2"));

	List <Student> list = criteria.list();
	for(Student s:list)
	{
		System.out.println(s);
		
	}
	
	
	
	
	
	
	session.close();
	factory.close();
}

}
