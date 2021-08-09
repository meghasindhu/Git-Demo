package com.technoelevate.trainig;

import java.util.Scanner;

public class IsOddSumMainClass
{
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		IsOddClass odd = new IsOddClass();
		
		System.out.println("enter the number to find whether it is odd or not");
		int num=sc.nextInt();
		
		boolean n=odd.isOdd(num);
		System.out.println("is the number entered odd :"+n+"\n");
		
		System.out.println("enter the starting range to find sum of odd numbers");
		int start=sc.nextInt();
		System.out.println("enter the ending range to find sum of odd numbers");
        int end=sc.nextInt();
        
		int sum=odd.sumOdd(start, end);
		System.out.println(" sum of odd numbers in the given range is :"+sum);

		}
}
