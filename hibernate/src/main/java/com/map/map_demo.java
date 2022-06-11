package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class map_demo {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure();
	SessionFactory factory = cfg.buildSessionFactory();
	Question q=new Question();
	q.setId(10102);
	q.setQuestion("what is java");
	Question q1=new Question();
	q1.setId(1011);
	q1.setQuestion("what is collection");
	
	
	Answer a=new Answer();
	a.setAnswer_id(9899);
	a.setAnswer("java is programming language");
	a.setQuestion(q);
	q.setAnswer(a);
	Answer a1=new Answer();
	a1.setAnswer_id(990);
	a1.setAnswer("collection is a farmework");
	a1.setQuestion(q1);
	q1.setAnswer(a1);
	Session s = factory.openSession();
	Transaction tx = s.beginTransaction();
	s.save(q);
	s.save(a);
	tx.commit();
	
	s.close();
	factory.close();
	
	
	

	
	


	
}
}
