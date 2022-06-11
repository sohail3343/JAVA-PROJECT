package com.map1;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Mapping_Demo {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure();
	SessionFactory factory = cfg.buildSessionFactory();
  Employee e1=new Employee();
  Employee e2=new Employee();
  e1.setEid(101);
  e1.setName("mudassir");
  e2.setEid(102);
  e2.setName("sameer");
   Project p1=new Project();
   Project p2=new Project();
   p1.setPid(4);
   p1.setPname("library management system");
   p2.setPid(3);
   p2.setPname("CHATBOT");
    List<Employee> l1=new ArrayList<Employee>();
    List<Project> l2=new ArrayList<Project>();
    l1.add(e1);
    l1.add(e2);
    l2.add(p1);
    l2.add(p2);
    e1.setProjects(l2);
    p2.setEmployees(l1);
    
   Session s = factory.openSession();
   Transaction tx = s.beginTransaction();
   s.save(p2);s.save(p1);s.save(e1);s.save(e2);
   
   
   tx.commit();
   s.close();
   factory.close();
}
}
