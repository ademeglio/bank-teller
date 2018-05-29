package org.wecancodeit.bank_teller;

import java.util.Collection;
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
		String account; 
		double amount;
		
		Bank myBank = new Bank();
		BankAccount account1 = new BankAccount("1111", "Checking", 500.00);
		BankAccount account2 = new BankAccount("2222", "Savings", 2500.00);
		Scanner userInput = new Scanner(System.in);
		
		myBank.add(account1);
		myBank.add(account2);
		
		Collection<BankAccount> collection = myBank.getAllAccounts(); 
	
		// Add accounts to the bank
		while (true) {
		// Display current account status
			
		// Menu (Loop)
		System.out.println("Please make a transaction selection: ");
		System.out.println("1. Deposit      	4. Close Account"
					   + "\n2. Withrawal	 	5. EXIT"
					   + "\n3. Check Balance");
		
		String response = userInput.nextLine();
		
		switch (response) {
		case "1" : // Deposit
			System.out.println("Deposit, please enter account number.");
			account = userInput.nextLine();
			System.out.println("Please enter your deposit amount:");
			amount = userInput.nextDouble();
			userInput.nextLine();
			myBank.deposit(account, amount);
			System.out.println("Account Balance is now $" 
			+ myBank.findAccount(account).getBalance());
			break;
		}
			
		
		} // End Menu Loop

	}
	public void Menu() {
		
	}
} // end BankingApp();
