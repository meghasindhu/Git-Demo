package com.technoelevate.trainig;

public class PackageClass {
	public static boolean canPack(int bigCount, int smallCount, int goal )
	{
		if(bigCount<0 && smallCount<0 && goal<0)
			return false;
		
		int big=bigCount*5;
		int small=smallCount*1;
		if(goal==big+small)
			return true;
		else if(goal< big+small)
		{
			goal=big;
		    return true;
		}
		else
		return false;
		
	}
	
	public static void main(String[] args) {
		 boolean a=canPack(2,5,20);
		 System.out.println(a);
	}

}
