package com.technoelevate.trainig.challenge;

public class MainOfArea {

	public static void main(String[] args) {
        
		AreaOfShapes as= new AreaOfShapes();
		double area=as.area(4.8);
		System.out.println("Area of Circle = "+area+"meters squares");
		double area1=as.area(5.3, 6.4);
		System.out.println("Area of Rectangle = "+area1+"meters squares");

	}

}
