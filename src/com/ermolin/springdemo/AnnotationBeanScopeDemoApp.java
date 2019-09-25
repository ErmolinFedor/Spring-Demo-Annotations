package com.ermolin.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		// load spring config file
		ClassPathXmlApplicationContext context= 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		Coach tneCoach= context.getBean("tennisCoach", Coach.class);
		
		Coach alphaCoach= context.getBean("tennisCoach", Coach.class);
		
		System.out.println(tneCoach==alphaCoach);
		
		System.out.println("Memory location fo the tneCoach: "+tneCoach);
		
		System.out.println("Memory location fo the alphaCoach: "+alphaCoach);
		
		//Coach hokkeyCoach=context.getBean("hokkeyCoach", Coach.class);
		
		//System.out.println(hokkeyCoach.getDailyWorkout());
		
		context.close();

	}

}
