package com.ermolin.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component 

public class HokkeyCoach implements Coach{
	//this is singleton
	@Autowired
	@Qualifier("randomFortuneService") //use randomFortuneServicce
	private FortuneService fortuneService;
	
	

	public HokkeyCoach() {
		System.out.println(">> HokkeyCoach: inside default constructor");
	}
	
	//difine my init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">> HokkeyCoach: inside doMyStartupStuff");
	}
	@PreDestroy
	//difine my destroy method
	public void doMyCleanupStuff() {
		System.out.println(">> HokkeyCoach: inside doMyCleanupStuff");
	}

	@Override
	public String getDailyWorkout() {
		return "Gracky";
	}

	@Override
	public String getDailyFortune() {		
		return fortuneService.getFortune();
	}
	

}
