package com.chapter4;

public class DogMain {
	
	public static void main(String []args) {
		
		Dog dog = new Dog();
		dog.nameString = "Blake";
		dog.size = 15;
		
		Dog dog2 = new Dog();
		dog2.nameString = "Spike";
		dog2.size = 30;
		
		Dog dog3 = new Dog();
		dog3.nameString = "Ronald";
		dog3.size = 56;
		
		dog.bark();
		dog2.bark();
		dog3.bark();
		
	}

}
