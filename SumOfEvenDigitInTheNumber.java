package com.technoelevate.trainig;

import java.util.Scanner;

public class SumOfEvenDigitInTheNumber {

	public static int getEvenDigitSum(int number)
	{
		int sum=0;
		if(number>0)
		{
			while(number!=0)
			{
				int rem=number%10;
				if(rem%2==0)
				{
					sum+=rem;
				}
				number/=10;
			}
			return sum;
		}
		else
			return -1;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();		
		int sum=getEvenDigitSum(num);
		System.out.println("the sum of even digit in the given number is :"+sum);
	}
}
