package com.SpringCore.Autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
ApplicationContext context=	new ClassPathXmlApplicationContext(" com/SpringCore/Autowire/autoconfig.xml");
Employee e = (Employee) context.getBean("employee");
System.out.println(e);
System.out.println(e.getAddress().getStreet());
}
}
