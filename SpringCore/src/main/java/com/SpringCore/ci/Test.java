package com.SpringCore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("com/SpringCore/ci/ciconfig.xml");
	Person per = (Person) context.getBean("person");
	System.out.println(per);
}
}
