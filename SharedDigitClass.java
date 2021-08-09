package com.technoelevate.trainig;

public class SharedDigitClass {
	
	public static boolean getSharedDigit(int start,int end)
	{
		if(( start <10 && start >99)||(end<10 && end>99))
		{
			return false;
		}
		
			int temp=end;
			while(start!=0)
			{
				int rem=start%10;
				while(end!=0)
				{
					int rem1=end%10;
					if(rem==rem1)
					return true;
					end=end/10;
				}
				start=start/10;
				end=temp;
			}
			return false;
		
		
	}
	
	public static void main(String[] args) {
		boolean a=getSharedDigit(12,24);
		System.out.println(a);
		}

}
