package com.chapter2;

public class Dog {
	
	String nameString; 
	
	public static void main(String []args) {
		
		Dog dog = new Dog();
		dog.bark();
		dog.nameString = "Bart";
		
		// An array of dogs 
		Dog [] dog1 = new Dog[3];
		dog1[0] = new Dog();
		dog1[1] = new Dog();
		dog1[2] = new Dog();
		
		dog1[0].nameString = "Champ";
		dog1[1].nameString = "Leo";
		dog1[2].nameString = "Gracie";
		
		int x = 0; 
		while(x<dog1.length) {
			
			dog1[x].bark();
			x= x+1;
	
		}
		
		
	}
	
	public void bark() {
		
		System.out.println("Dog backs ruff ruff");
	}

}
