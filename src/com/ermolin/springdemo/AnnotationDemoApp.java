package com.ermolin.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		// read spring config file
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean from the container
		//Coach theCoach= context.getBean("thatSillyCoach",Coach.class);//retrieve from bean name
		Coach theCoach= context.getBean("tennisCoach",Coach.class);//retrieve default name bean
		
		//call a method from the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//call method get the dailyfortune
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();

	}

}
