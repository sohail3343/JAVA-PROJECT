package com.SpringCore.Standalone.Collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
ApplicationContext context=new ClassPathXmlApplicationContext("com/SpringCore/Standalone/Collections/aloneconfig.xml");

Person p = (Person) context.getBean("person");
Person p1 = (Person) context.getBean("person1");
System.out.println(p);
System.out.println(p1);
Person p2 = (Person) context.getBean("person2");
System.out.println(p2);
}




}
