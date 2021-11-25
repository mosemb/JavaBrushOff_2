package com.chapter7;


public class Cat extends Feline implements Pet {
	
	
	
	public String getNoiseString() {

		return noiseString;
	}
	
	public void eat() {
		
		System.out.println("Cat eating ");
		
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beFriendly() {
		// TODO Auto-generated method stub
		
	}

}
