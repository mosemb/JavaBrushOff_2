package com.chapter5;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class GameHelper {
	
	public String getUserInputString(String prompt) throws IOException {
		
		String input = null;
		System.out.print(prompt+" ");
		
		BufferedReader inBufferedReader = new BufferedReader( new InputStreamReader(System.in));
		
		input = inBufferedReader.readLine();
		
		if(input.length()==0) { return null;}
		
		
		return input;
	}

}
