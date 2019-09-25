package com.ermolin.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	//create sone array of strings
	private String[] data= {
			"first fortuene",
			"second fortune",
			"third fortune"
	};
	
	Random myRandom = new Random();

	@Override
	public String getFortune() {
		//pick arandom string from array
		return data[myRandom.nextInt(data.length)];
		//return "RandomService: go workout!";
	}

}
