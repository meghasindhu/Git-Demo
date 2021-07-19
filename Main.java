package com.technoelevate.OopsConcept;

public class Main {

	public static void main(String[] args) {
	
		Dog rotwiler=new Dog("Rotwiler", 2, 28, 2, 4, 1, "straight and coarse");
		
		//rotwiler.eat();
		rotwiler.walk();
		rotwiler.run();
		
		Fish bony =new Fish("bony",2,3,5,2,1);
		bony.move(2,6);
		

	}

}
