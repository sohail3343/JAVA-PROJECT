package com.SpringCore.Stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
 
ApplicationContext context=new ClassPathXmlApplicationContext("com/SpringCore/Stereotype/stereoconfig.xml");
Student s = context.getBean("student",Student.class);
System.out.println(s);
Student s1 = context.getBean("student",Student.class);
System.out.println(s.hashCode());
System.out.println(s1.hashCode());

}
}
