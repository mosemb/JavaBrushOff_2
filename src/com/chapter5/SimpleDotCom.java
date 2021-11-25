package com.chapter5;

import java.util.ArrayList;

public class SimpleDotCom {
	
	//int [] locationCells;
	ArrayList<String> locationCellStrings;
	int numOfhits = 0;
	
	
    public void setLocationCells(ArrayList<String>locationCellStrings) {
    	
    	this.locationCellStrings = locationCellStrings;
    }
    
    public String checkYourSelfString(String checkguessString) {
    	
    	//int guess = Integer.parseInt(checkguessString);
    	String resultString = "miss";
    	
    /*	for(int cell :locationCells) {
    		
    		if(cell == guess) {
    			resultString = "hit";
    			numOfhits = numOfhits+1;
    			break;
    		}
    	} */
    	
    	int index = locationCellStrings.indexOf(checkguessString);
    	
    	if(index >= 0) {
    		locationCellStrings.remove(index);
    	}
    	
    	
    	/*
    	 * 
    	if(numOfhits == locationCells.length) {
    		
    		resultString = "kill"; 
    	} 
    	*/
    	
    	if(locationCellStrings.isEmpty()) {
    		resultString = "kill";
    	}else {
    		resultString = "hit";
    	}
    	
    	System.out.println(resultString);
    	return resultString;
    	
    }
	
	

}
