package com.chapter10;

public class PlayerTestDrive {
	
	public static void main(String []args) {
		// Before object is made
		System.out.println(Player.playerCount);
		
		Player player = new Player("Ronaldo");
		
		// After object is made
		System.out.println(Player.playerCount);
		
	}

}
