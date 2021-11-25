package com.chapter1;

public class BeerSong {
	
	public static void main (String []args) {
		
		int beerNum = 99;
		String wordString = "bottles";
		
		while(beerNum>0) {
			
			if(beerNum==1) {
				wordString = "bottle";
			}
			
			System.out.println(beerNum + " "+wordString +" "+" of beer");
			beerNum=beerNum-1;
			
			if(beerNum==0) {
				
			System.out.println("No more bottles of beer");
			
			}
			
		}
	}

}
