package com.chapter15;



public class RyanAndMonica implements Runnable {
	
	private BankAccount acc = new BankAccount();

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i =0; i < 10; i++) {
			makeWithDraw(10);
			
			if(acc.getBalance()<0) {
				
				System.out.println("Overdrawn ");
			}
			
		}
		
	}
	
	
	private synchronized void makeWithDraw(int amount) {
		if(acc.getBalance() >= amount) {
			System.out.println(Thread.currentThread().getName() +" is about to withdraw ");
			
			try {
				System.out.println(Thread.currentThread().getName() +" is going to sleep ");
				Thread.sleep(500);
				System.out.println(Thread.currentThread().getName() + "Just woke up ");
				acc.withDraw(amount);
				System.out.println(Thread.currentThread().getName() + "Completes withdraw ");
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}else {
			
			System.out.println(Thread.currentThread().getName() +" Sorry not enough money on account ");
		}
		
	}
	
	
	public static void main(String []args) {
		RyanAndMonica ryanAndMonica = new RyanAndMonica();
		
		Thread oneThread = new Thread(ryanAndMonica);
		Thread twoThread = new Thread(ryanAndMonica);
		
		oneThread.setName("Ryan");
		twoThread.setName("Monica");
		
		oneThread.start();
		twoThread.start();
		
	}
	
	
}
