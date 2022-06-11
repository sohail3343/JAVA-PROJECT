package com.map;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class map_demo1 {

	private static Class Answer1;

public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure();
	SessionFactory factory = cfg.buildSessionFactory();
	
	/*
	 * Question1 q=new Question1(); q.setQuestion_id(1112);
	 * q.setQuestion("what is java"); Answer1 a1=new Answer1();
	 * a1.setAnswer_id(1215); a1.setAnswer("java is a programming language");
	 * a1.setQuestion(q); Answer1 a2=new Answer1(); a2.setAnswer_id(1218);
	 * a2.setAnswer("it is object oriented "); a2.setQuestion(q); List<Answer1>
	 * l=new ArrayList<Answer1>(); l.add(a1); l.add(a2); q.setAnswers(l);
	 */
	 
 Session s = factory.openSession();
 Transaction tx = s.beginTransaction();
	
	/*
	 * s.save(q); s.save(a1); s.save(a2);
	 */
 //fetching
		 /*Question1 question12 =(Question1) s.get(Question1.class,1112 );	
		 System.out.println(question12.getQuestion());
		 for(Answer1 x: q.getAnswers())
		 {
			 
			 System.out.println(x.getAnswer());
			 
		 }
		 */
 
 
         Question1 que1 =(Question1) s.get(Question1.class, 1112);
         System.out.println(que1.getQuestion_id());
         System.out.println(que1.getQuestion());
         
	 
 

 tx.commit();
 s.close();
 factory.close();
	
}
}
