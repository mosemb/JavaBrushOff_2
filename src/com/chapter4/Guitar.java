package com.chapter4;

public class Guitar {
	
	String brandString;
	int numOfpickUps;
	boolean rockStarUsesIt;
	
	public void setbrandString(String abrand) {
		brandString = abrand;
	}
	
	public String getBrand() {
		return brandString;
	}
	
	public void setnumOfPickUps(int pickups) {
		
		numOfpickUps = pickups;
	}
	
	public int getnumOfPickUps() {
		return numOfpickUps;
	}
	
	public void setrockStarUsesIt(boolean rockstarusesit) {
		rockStarUsesIt = rockstarusesit;
	}
	
	public boolean rockStarUsesIt() {
		
		return rockStarUsesIt;
	}

}
