package com.chapter4;


public class GoodDog {
	
	private int size;
	private String  name; 
	
	
	public void setNameString(String names) {
		this.name = names;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSize(int size) {
		
		this.size = size;
	}
	
	public void bark() {
		if(size <20) {
			System.out.println("Hip Hip");
		}
		
		if(size >20 && size<=40) {
			System.out.println("Hop Hop");
		}
		
		if(size>40) {
			
			System.out.println("Wrap Wrap Wrap");
		}
	}
	
	

}
