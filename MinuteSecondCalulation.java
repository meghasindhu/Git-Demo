package com.technoelevate.trainig.challenge;

public class MinuteSecondCalulation 
{
	public static String  getDurationString(int min,int sec)
	{
		if((min>=0)&&(sec>=0 && sec<=59))
		{
			min *=60;
			sec +=min;
			int seconds = sec;
	        int actualSec = seconds % 60;
	        int remMinute = seconds / 60;
	        int actualMin = remMinute % 60;
	        int actualHr= remMinute / 60;
	        System.out.println("Time: "+actualHr+"hr "+actualMin+"mins "+actualSec+"secs");
	        
			
			return " ";
		}
		else
		{
			return "invalid value";
		}
		
	}
	public static String  getDurationString(int sec)
	{
		if(sec>=0)
		{
			int min;
			min=sec/60;
			sec=sec%60;
			getDurationString(min,sec);
			
			return "";
		}
		else
		{
			return "invalid value";
		}
		
		
	}
	
	public static void main(String[] args) {
		getDurationString(90);
		
	}

}
