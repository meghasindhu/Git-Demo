package com.technoelevate.trainig;

public class SumOfNumbers
{
	public static void main(String[] args)
	{
		int sum=0,count=0;
		for(int i=1;i<=1000;i++)
		{
			
			if((i%3==0)&&(i%5==0))
			{
				count++;
				if(count<=5)
				{
					System.out.println(i);
					sum+=i;
				}
				else
					break;
			}
			
		}
		System.out.println("The sum of numbers are: "+sum);
		
	}

}
