package com.technoelevate.trainig;

public class IsOddClass
{
	public boolean isOdd(int num)
	{
		if(num>0)
		{
			if(num%2!=0)
			return true;
			else
				return false;
		}
		else
			return false; 
	}
	public int sumOdd(int start,int end)
	{
		int sum=0;
		if((start>0 && end>0) && (end>=start))
		{
			for(int i=start;i<=end;i++)
			{
				boolean a=isOdd(i);
				if(a==true)
					sum+=i;		
			}
			return sum;
		}
		else
			return -1;
		
	
		
	}

}
