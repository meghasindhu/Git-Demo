package com.technoelevate.trainig;

import java.util.Scanner;

public class sumFirstAndLastDigitClass 
{

	public static  int sumFirstAndLastDigit (int number)
	{
		int sum=0,reverse=0;
		
		if(number>0)
		{
			int y=number%10;
			while(number!=0)
			{
				int last=number%10;  
				reverse = reverse * 10 + last;  
				number = number/10;
			}
			int x=reverse%10;
			sum=x+y;
			return sum;
		}
		else
			return -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to find the sum of its first and last digit");
		int num=sc.nextInt();
		int sum= sumFirstAndLastDigit(num);
		System.out.println("the sum of its first and last digit of "+num+" is : "+sum);
		
	}
	
}
