package com.chapter15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;


public class DailyAdviceClient {
	
	public void go() {
		
		try {
			Socket soc= new Socket("127.0.0.1", 5000);
			InputStreamReader sreamReader = new InputStreamReader(soc.getInputStream());
			BufferedReader bufferedReader = new BufferedReader(sreamReader);
			
			// Read line by line of the stream. 
			String adString = bufferedReader.readLine();
			System.out.println("TOday you should "+adString);
			bufferedReader.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static void main(String []args) {
		
		DailyAdviceClient client = new DailyAdviceClient();
		client.go();
		
	}

}
