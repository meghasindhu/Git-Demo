package com.technoelevate.trainig;

public class FactorsOfTheNumber {
	public static void printFactors(int number)
	{
		if(number>1)
		{
			System.out.print("factors are of "+number+" is :");
			for(int i=2;i<=number/2;i++)
			{
				if(number%i==0)
					System.out.print(i+" , ");
			}
		}
		else
			System.out.println("invalid value");
		
	}
	
	public static void main(String[] args) {
		
		 printFactors(24);
	}

}
