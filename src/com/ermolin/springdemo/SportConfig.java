package com.ermolin.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.ermolin.springdemo") //если вызываем через бин , то эта анотация не нужна 
public class SportConfig {
	
	//difine a bean for our sad fortune service
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	//difine a bean for a swim coach and inject dependency
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService()); //важно! аргумент конструктора метод , который тоже с аноатцией бин
	}

}
