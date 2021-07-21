package com.technoelevate.trainig.challenge;

public class CatPlayTimeAndType {
	
	public static boolean  isCatPlaying (boolean summer, int temperature)
	{
		if ((summer==true)&&(temperature>=25 && (temperature<=35 || temperature<=45))) 
		{
			return summer;
		}
		else
			return false;
			
	}
	
	public static void main(String[] args) {
		boolean result= isCatPlaying(true,32);
		System.out.println(result);
		boolean result1= isCatPlaying(false,25);
		System.out.println(result1);
		boolean result2=isCatPlaying(true,49);
		 System.out.println(result2);
	}

}
