package com.chapter8;

public class Duck2Main {
	
	public static void main(String []args) {
		
		int [] feathers  = {1,2,3,4,5};
		boolean candoMagic = true;
		
		
		//Duck2 duck2 = new Duck2();
		//Duck2 duck3 = new Duck2(23);
		
		Duck2 [] duck = new Duck2[5];
		duck[0] = new Duck2();
		duck[1] = new Duck2(23);
		duck[2] = new Duck2(feathers,23);
		duck[3] = new Duck2(candoMagic,"Dre");
		
		
	}
	
	

}
