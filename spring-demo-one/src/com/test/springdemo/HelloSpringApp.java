package com.test.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		//Load the spring configuration file
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from SPring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		// Call methods on the bean
		
		System.out.println(theCoach.getDailyWorkout());
		
		//close the context
		context.close();
	}

}
