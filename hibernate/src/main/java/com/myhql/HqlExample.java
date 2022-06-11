package com.myhql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import com.map.*;

import com.hibernate.Student;

public class HqlExample {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure();
	SessionFactory factory = cfg.buildSessionFactory();
	 
	Session Session = factory.openSession();
	
	
	  String query="from Student  as s where  city=:x and name=:n"; Query q =
	  Session.createQuery(query); q.setParameter("x", "mumbai");
	  q.setParameter("n","sameer");
	 
	
	List <Student> list  = q.list();
	for(Student s: list)
	{
		System.out.println(s.getName()+  " "+ s.getCert().getCourse());
		
	}

	System.out.println("------------------------------------------------------------");
	
	  Transaction tx = Session.beginTransaction(); 
		/*
		 * Query query2 =Session.createQuery("delete from Student s where city=:c");
		 * query2.setParameter("c","abc"); int r = query2.executeUpdate();
		 * System.out.println("deleted"); System.out.println(r);
		 */
		/*
		 * Query q3 = Session.createQuery("update Student set city=:c where name=:n");
		 * q3.setParameter("c", "new york"); q3.setParameter("n", "mudassir"); int r2 =
		 * q3.executeUpdate(); System.out.println("updated"); System.out.println(r2);
		 */
	
Query q3 = Session.createQuery("select q.question,q.question_id, a1.answer from Question1 as q INNER JOIN  q.answers as a1");	  
	  List <Object []> list1 = q3.list();
	  for(Object [] arr:list1)
	  {
		  System.out.println(Arrays.toString(arr));
		  
	  }
	  
	  
	  
	  
	  
	  
	  tx.commit();
	 
    
	
	
	
	
	
	
	Session.close();
	factory.close();
}
}
