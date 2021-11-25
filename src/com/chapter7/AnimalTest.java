package com.chapter7;

public class AnimalTest {
	
	public static void main(String []args) {
		Animal anim = new Animal();
		
		// An array of type animal
		Animal [] animal = new Animal[5];  // Polymorhpishm
		
		animal[0] = new Dog();
		animal[1] = new Wolf();
		animal[2] = new Cat();
		animal[3] = new Tiger();
		animal[4] = new Lion();
		
		for(Animal ani:animal) {
			
			//System.out.println(ani);
			ani.eat(); // Polymorhpism calling different methods attached to different classes. 
			
		}
		
		//animal[1].eat();
	}

}
