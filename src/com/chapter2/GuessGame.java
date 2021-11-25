package com.chapter2;



public class GuessGame {
	
	Player p1;
	Player p2;
	Player p3; 
	
	public void startGame() {
		
		// Instance Variables for the player objects 
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();
		
		// Variables to hold the player scores 
		int guess1 = 0;
		int guess2 = 0; 
		int guess3 = 0; 
		
		// Declare the variables to hold if the player guesses right or not. 
		boolean p1isright = false;
		boolean p2isright = false;
		boolean p3isright = false;
		
		int targetnumber = (int) (Math.random()*10);
		System.out.println("Am thinking of a number between 0 and 9 ");
		
		while(true) {
			
			System.out.println("Number to guess is "+targetnumber);
			
			p1.guess();
			p2.guess();
			p3.guess();
			
			guess1 = p1.number;
			System.out.println("Player 1 guessed "+guess1);
			
			guess2 = p2.number;
			System.out.println("Player 2 guessed "+guess2);
			
			guess3 = p3.number;
			System.out.println("Player 3 guessed "+guess3);
			
			if(guess1 == targetnumber) {
				
				p1isright = true;
			}
			
			if (guess2 == targetnumber) {
				
				p2isright = true;
			}
			
			if (guess3 == targetnumber) {
				p3isright = true;
			}
			
			if(p1isright|| p2isright|| p3isright) {
				
				System.out.println("We have a winner ");
				System.out.println("Player 1 guessed "+p1isright);
				System.out.println("Player 2 guessed "+p2isright);
				System.out.println("Player 3 guessed "+p3isright);
				break;
			}else {
				
				System.out.println("Players will have to play again");
			}
			
		}
		
	}

}
