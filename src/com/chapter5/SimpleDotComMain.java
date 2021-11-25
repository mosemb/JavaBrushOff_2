package com.chapter5;

import java.io.IOException;

public class SimpleDotComMain {
	
	public static void main (String []args) throws IOException {
		
		int numGuesses =0 ; 
		
		GameHelper helper = new GameHelper();
		
		SimpleDotCom gameCom = new SimpleDotCom();
		int rand  = (int) (Math.random()*5);
		
 		int [] location = {rand,rand+1,rand+2};
 		
 		gameCom.setLocationCells(location);
		
		boolean isalive = true;
		
		while(isalive==true) {
			
			String guessString = helper.getUserInputString("Enter number");
			String result = gameCom.checkYourSelfString(guessString);
			numGuesses = numGuesses+1;
			
			System.out.print(Math.random());
			
			if(result.equals("kill")) {
				
				isalive = false;
				
				System.out.println("You took a total of "+ numGuesses +" gueses");
				
			}
			
			
		}
		
		
	}

}
