package com.ermolin.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// this is bean name
//@Component("thatSillyCoach") 

//default name of the bean is tennisCoach, and name should not write in annotation
@Component 
@Scope("prototype")//бех той анотации по дефолту бин синглтон
/*
 * singleton

Определяет один единственный бин для каждого контейнера Spring IoC (используется по умолчанию).

prototype

Позволяет иметь любое количество экземпляров бина.

request

Создаётся один экземпляр бина на каждый HTTP запрос. Касается исключительно ApplicationContext.

session

Создаётся один экземпляр бина на каждую HTTP сессию. Касается исключительно ApplicationContext.

global-session

Создаётся один экземпляр бина на каждую глобальную HTTP сессию. Касается исключительно ApplicationContext.
 */

public class TennisCoach implements Coach {
	
	//this is a field injection
	@Autowired
	//@Qualifier("databaseFortuneService") //use databaseFortuneService
	@Qualifier("randomFortuneService") //use randomFortuneServicce
	private FortuneService fortuneService;
	
	/*
	  //this is for constructor injection or setter injection
	private FortuneService fortuneService;
	*/
	
	//define a default constructor(in case of setter injection without any constructor)
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor");
	}
	
	//Use constructor or setter with private object "private FortuneService fortuneService;"
	// this example is dependency injection
	/*@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService= theFortuneService;
	}
	*/
	
	//instead dependency injection we can use setter injection
	
	//define a setter method (injection)
	/*@Autowired
	public void setFortuneService (FortuneService thefortuneService) {
		fortuneService= thefortuneService;
		System.out.println(">> TennisCoach: inside setFortuneService() method");
	}
	*/
	//just for fun setter we can name any way
	/*@Autowired
	public void doSomeCrazyStuff (FortuneService thefortuneService) {
		fortuneService= thefortuneService;
		System.out.println(">> TennisCoach: inside doSomeCrazyStuff() method");
	}
	*/

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {		
		return fortuneService.getFortune();
	}

	

}
