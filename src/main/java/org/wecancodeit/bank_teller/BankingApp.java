package org.wecancodeit.bank_teller;

import java.util.Scanner;

public class BankingApp {

	/*
	 * WeCanCodeIT Module Bridge Project Module 3
	 * by Anthony J. DeMeglio
	 * 5/29/2018
	 * 
	 * "Bank Teller" App
	 * Design a BankAccount class that will perform capabilities of a single
	 * Bank Account, a Bank class that will  house multiple accounts and a
	 * BankingApp (with a main method) to simulate a user interface
	 * where you can access your accounts and perform banking transactions.
	 * 
	 * https://github.com/ademeglio/bank-teller
	 * 
	 */
	
	public static void main(String[] args) {
		
		Bank myBank = new Bank();
		BankAccount account1 = new BankAccount("1111", "Checking", 500.00);
		BankAccount account2 = new BankAccount("2222", "Savings", 2500.00);
		Scanner userInput = new Scanner(System.in);
		
		// Add accounts to the bank
		
		// Display current account status
		
		// Menu (Loop)
		
	}

}
