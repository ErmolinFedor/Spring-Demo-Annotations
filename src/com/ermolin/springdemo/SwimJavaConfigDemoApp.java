package com.ermolin.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {
	public static void main(String[] args) {
		
		// read spring config java class
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		//get the bean from the container
		//Coach theCoach= context.getBean("thatSillyCoach",Coach.class);//retrieve from bean name
		Coach theCoach= context.getBean("swimCoach",Coach.class);//retrieve default name bean
		
		//call a method from the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//call method get the dailyfortune
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();
		

	}

}
