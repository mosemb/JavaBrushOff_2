package com.chapter4;

public class Dog {
	
	String nameString; 
	int size;
	
	public void bark() {
		
		if(size < 20) {
			System.out.println("Hip hip ");
		}
		
		if(size >20 && size < 40) {
			System.out.println("Hop Hop");
		}
		
		if(size >= 40) {
			System.out.println("Wrap Wrap");
		}
	}

}
