package springdemo;

import java.util.Random;

public class SadFortuneService implements FortuneService {

//	create an array of strings
	private String[] data = {
			"Today sucks",
			"Wow what a horrible day", 
			"UGH!"
	};
	
//	create a random number generator
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
//		pick a random string from the array
		int index = myRandom.nextInt(data.length);
		String theFortune = data[index];
		return theFortune;
	}
}
