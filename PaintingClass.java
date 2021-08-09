package com.technoelevate.trainig;

public class PaintingClass {
	
	public static int getBucketCount(double width,double height,Area areaPerBucket,int extraBuckets)
	{
		Area a= new Area(height,width);
		if(width<=0 || height<=0 || a.area() <=0 || extraBuckets<0)
		{
			return -1;
		}
		return 0;
	}

}
