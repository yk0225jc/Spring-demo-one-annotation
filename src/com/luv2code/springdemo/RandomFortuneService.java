package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	//create an array of strings
	private String[] listOfFortune= {"Beware of the wolf in the sheeps's clothing", 
			"Dligence is the moether of good luck", 
			"The journey is the reward"};
	
	private Random myRandom = new Random();
	
	
	@Override
	public String getFortune() {
		int index = myRandom.nextInt(listOfFortune.length);
		String theFortune = listOfFortune[index];
		
		return theFortune;
	}

}
