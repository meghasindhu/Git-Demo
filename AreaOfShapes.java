package com.technoelevate.trainig.challenge;

public class AreaOfShapes
{
	public double area(double rad)
	{
		if(rad>0)
		{
		double areaOfCircle;
		areaOfCircle=3.14*rad*rad;
		return areaOfCircle;
		}
		else
			return -1.0;
	}
	public double area(double x,double y)
	{
		if(x>0 && y>0)
		{
			return x*y;
		}
		else
			return -1.0;
	}

	

	
}
