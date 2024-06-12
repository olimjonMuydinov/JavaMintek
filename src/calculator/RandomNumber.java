package calculator;

import java.util.Random;

public class RandomNumber extends Range{

	public RandomNumber(int min, int max) {
		super(min, max);
	}

	/**
	 * 	This class will generate random numbers
		TODO:
		1. Add a static method getRandomInteger:
		parameter: type Range
		return: random generated int value within range of min and max values of the Range object
		
		2. overload a static method getRandomInteger:
		parameter: type int
		return: random generated positive int value within range of 1 and the 
		value of parameter
	 */
	public static int getRandomInteger(Range number){

		int max = number.getMax();
		int min = number.getMin();
		Random random = new Random();
		return random.nextInt(min,max);
	}

	public static int getRandomInteger(int number){
		Random random = new Random();
		return random.nextInt(1,number);
	}



}
