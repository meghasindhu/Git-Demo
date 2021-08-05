package com.technoelevate.ty_training_challenge.crossingpeople;

public class CrossingPeopleClass {
	public static void main(String[] args) {
		 int[] arr = {1,0,1,1,0,0,1,0,0};
		 
		 int numberOfPeople = solution(arr);
		System.out.println(numberOfPeople);
	}
	public static int solution(int[] a) {
		int numberOfPersonCrossing=0;
		for(int i=0;i<a.length;i++)
			for(int j=1;j<a.length;j++)
				if(a[i]!=a[j] && i!=j)
					numberOfPersonCrossing++;
		return numberOfPersonCrossing;
	}
}
