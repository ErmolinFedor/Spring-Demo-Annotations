package com.ermolin.springdemo;

public class SwimCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService thrFortuneService) {
		fortuneService= thrFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Swim 1000 m as a warm up.";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
