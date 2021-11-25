package com.chapter2;

public class MovieMain {
	
	public static void main(String []args) {
		
		Movie movie = new Movie();
		movie.actorString = "Lukanga";
		movie.movieTitleString = "First Blood";
		movie.runTime = 45;
		movie.playIt();
	}

}
