package com.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.hibernate.Student;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		/* System.out.println( "Hello World!" ); */
        Configuration cfg=new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();
        Address a=new Address();
        a.setStreet("Street2");
        a.setCity("Mumbai");
        a.setOpen(true);
        a.setAddeddate(new Date());
        a.setX(20.0);
        
        Student st=new Student();
        st.setCity("mumbai");
        st.setId(410);
        st.setName("sameer");
        System.out.println(st);
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(st);
        session.save(a);
        tx.commit();
       
        session.close();
        System.out.println("done");
      
    }
}
