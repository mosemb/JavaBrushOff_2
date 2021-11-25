package com.chapter7;

public  class Animal {
	
	int picturepixels; 
	String foodString;
	boolean hunger;
	double bounderies;
	String locationString;
	String noiseString;
	
	public void makeNoiseString(String noise) {
		
		noiseString = noise;
	}
	
	public String getNoiseString() {
		
		return noiseString;
	}
	
	public void eat() {
		
		System.out.println("Animal eating ");
		
	}
	
	public void sleep() {
		
	}
	
	public void roam() {
		
		
	}
	
	

}
