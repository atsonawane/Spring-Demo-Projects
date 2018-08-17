package com.javatpoint.Setter_DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/javatpoint/Setter_DI/Spring.xml");
		Employee test=(Employee)context.getBean("obj");
		Question q=(Question)context.getBean("q");
		test.printdata();
		q.displayInfo();
		
	}
}
