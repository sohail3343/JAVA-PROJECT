package com.SpringCore.Spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/SpringCore/Spel/config.xml");
		Demo d1 = context.getBean("demo",Demo.class);
		System.out.println(d1);
	}
}
