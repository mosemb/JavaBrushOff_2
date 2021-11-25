package com.chapter1;


public class PhraseOmatic {
	
	static String [] liStrings  = {"great is your faithfulness", "great are you lord", "great are you lord"};
	static String [] liStrings2 = {"To worship you", "To Love you", "To Adore you"};
	static String [] liStrings3 = {"To marginify you", "we are your children", "we gathered here today"};
	
	static int lenliStrings = liStrings.length;
	static int lenliString2 = liStrings2.length;
	static int len3 = liStrings3.length;
	
	static int rand1 = (int) (Math.random()*lenliStrings);
	static int rand2 = (int) (Math.random()*lenliString2);
	static int rand3 = (int) (Math.random()*len3);
	
	
	public static void main (String []args) {
	
		
		String phraseString = liStrings[rand1] + " "+liStrings2[rand2]+ " "+liStrings3[rand3];
		System.out.print(rand1);
		System.out.println(phraseString);
		
		
	}

}
