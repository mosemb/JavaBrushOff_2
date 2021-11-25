package com.chapter7;

public class Dog extends Canine implements Pet {
	

	public String getNoiseString() {
		
		noiseString = "Wrap Wrap";

		return noiseString;
	}
	
	public void eat() {
		
		System.out.println("Dog eating ");
		
	}

	@Override
	public void beFriendly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

}
