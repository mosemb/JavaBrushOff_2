package com.chapter15;

public class BankAccount {
	
	int balance = 100;
	
	public int getBalance() {
		return balance;
	}
	
	public void withDraw(int amount) {
		balance = balance -amount;
	}

}


