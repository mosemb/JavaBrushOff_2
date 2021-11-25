package com.chapter10;

public class Player {
	
	static int playerCount; 
	private String nameString; 
	
	public Player(String nameString) {
		
		this.nameString = nameString;
		playerCount++;
		
	}

}
