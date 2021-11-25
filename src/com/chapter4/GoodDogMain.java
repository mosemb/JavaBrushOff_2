package com.chapter4;

public class GoodDogMain {
	
	public static void main(String[]args) {
		
		GoodDog good = new GoodDog();
		good.setNameString("Rick Shaw");
		good.setSize(12);
		//good.bark();
		
		GoodDog [] dogs = new GoodDog[2];
		dogs[0] = new GoodDog();
		dogs[0].setNameString("James Hines");
		dogs[0].setSize(23);
		dogs[0].bark();
		dogs[0].getName(); 
		
		System.out.print(dogs[0].getName());
	}

}
