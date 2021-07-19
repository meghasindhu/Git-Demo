package com.technoelevate.OopsConcept;

public class Fish extends Animal{
	private int fin;
	private int eyes;
	private int gills;
	private int tail;

	public Fish(String name, int size, int weight,int fin, int eyes,int tail) {
		super(name, 1,1, size, weight);
		this.eyes=eyes;
		this.fin=fin;
		this .tail=tail;
		
		System.out.println("Aniaml Name: "+name);
		System.out.println("Aniaml Body: "+body);
		System.out.println("Aniaml Size: "+size+"cm");
		System.out.println("Animal Brain: "+brain);
		System.out.println("Animal Weight: "+weight+"kg");
		System.out.println("Animal Eyes: "+eyes);
		System.out.println("Animal Tail: "+tail);
		System.out.println("Animal fins: "+fins);
	}
	public void slow(int slow) {
		System.out.println("Fish moves slow: "+slow+"Kmphr");
	}
	public void fast(int speed) {
		System.out.println("Fish moves fast: "+speed+"Kmphr");
	}
	public void move(int slow,int speed) {
		slow(2);
		fast(5);
	}
	
	

}
