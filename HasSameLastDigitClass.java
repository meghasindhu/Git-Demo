package com.technoelevate.trainig;

public class HasSameLastDigitClass {
	public static boolean hasSameLastDigit(int x,int y,int z)
	{
		if((x<10 && x>1000)||(y<10 && y>1000)||(z<10 &&z>1000))
		{
			return false;
		}
		
		int temp=y%10;
		int temp1=z%10;
	    int rem=x%10;
			if((temp==temp1)||(temp1==rem)||(rem==temp))
		      return true;
			else
				return false;
	}
	
	public static void main(String[] args) {
		boolean x=hasSameLastDigit(123,765,543);
		System.out.println(x);
		
		boolean y=hasSameLastDigit(122,322,422);
		System.out.println(y);
		
		boolean z=hasSameLastDigit(121,322,423);
		System.out.println(z);

	}

}
