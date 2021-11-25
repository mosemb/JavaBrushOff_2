package com.chapter15;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;

public class VerySimpleChatServer {
	
	ArrayList clientArrayList;
	
	public class ClientHandler implements Runnable {
		BufferedReader reader;
		Socket sock;
		
		public ClientHandler(Socket sock) {
			// TODO Auto-generated constructor stub
			try {
				this.sock = sock;
				InputStreamReader inputStreamReader = new InputStreamReader(this.sock.getInputStream());
				reader = new BufferedReader(inputStreamReader);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			String meString;
			try {
				
				while((meString=reader.readLine())!=null) {
					System.out.println("read "+meString);
					tellEveryOne(meString);
				}
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		
		
	}
	
	public void go() {
		clientArrayList = new ArrayList();
		
		try {
			ServerSocket socket = new ServerSocket(4000);
			
			while(true) {
				Socket socket2 = socket.accept();
				PrintWriter writer = new PrintWriter(socket2.getOutputStream());
				clientArrayList.add(writer);
				
				Thread thread = new Thread(new ClientHandler(socket2));
				thread.start();
				System.out.print("Got a connection ");
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void tellEveryOne(String message) {
		
		Iterator iterator = clientArrayList.iterator();
		
		while(iterator.hasNext()) {
			try {
				PrintWriter writer = (PrintWriter) iterator.next();
				writer.print(message);
				writer.flush();
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		
		
	}
	
	public static void main(String []args) {
		new VerySimpleChatServer().go();
	}

}
