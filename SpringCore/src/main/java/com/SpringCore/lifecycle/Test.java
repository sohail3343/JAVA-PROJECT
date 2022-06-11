package com.SpringCore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	
	  AbstractApplicationContext context= new
	  ClassPathXmlApplicationContext(" com/SpringCore/lifecycle/config.xml");
	  Samosa s = (Samosa) context.getBean("samosa1");
	  //System.out.println(s);
	 
	 //registering shutdown hook
	 context.registerShutdownHook();
		/*
		 * System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
		 * 
		 * Pepsi p = (Pepsi) context.getBean("pepsi"); System.out.println(p);
		 */
	 
	 Example e = (Example) context.getBean("exp");
	 System.out.println(e);
}
}
