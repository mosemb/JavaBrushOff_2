package com.chapter15;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class DailyAdviceServer {
	
	String [] adviceStrings = {"Go for small Jeans", "Life is short take it like that", "He loves us all", 
			"He loves us all", "Come though fount ", "Jesus loves us all", "Mighty to save ", 
			"Faith is every thing"};
	
	
	public void go() {
		
		try {
			ServerSocket socket = new ServerSocket(5000);
			
			while(true) {
				Socket socket2 = socket.accept();
				PrintWriter writer = new PrintWriter(socket2.getOutputStream());
				String adviceString = getAdvice();
				writer.println(adviceString);
				writer.close();
				
				System.out.println(adviceString);
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	public String getAdvice() {
		// TODO Auto-generated method stub
		int random = (int) (Math.random()*adviceStrings.length);
		return adviceStrings[random];
	}
	
	public static void main(String []args) {
		
		DailyAdviceServer sDailyAdviceServer = new DailyAdviceServer();
		sDailyAdviceServer.go();
		
	}
	

}
