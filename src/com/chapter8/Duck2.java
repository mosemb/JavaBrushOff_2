package com.chapter8;

public class Duck2 {
	
	int size;
	boolean canDomagic;
	String nameString;
	int maxSpeed;
	int [] feathers;
	
	public Duck2(int size) {
		System.out.println("In duck with size");
		this.size = size;
	}
	
	// Constructor overloading
	public Duck2() {
		
		System.out.println("In duck with default.");
		
		this.size  = 27;
	}
	
	public Duck2(boolean canDomagic, String nameString) {
		System.out.println("Am the duck with magic and name");
		this.canDomagic = canDomagic;
		this.nameString = nameString;
		
		
	}
	
	public Duck2(int []feathers,int maxSpeed) {
		System.out.println("Am the duck with feathers and maxSpeed");
		this.feathers = feathers;
		this.maxSpeed = maxSpeed;
		
	}

}
