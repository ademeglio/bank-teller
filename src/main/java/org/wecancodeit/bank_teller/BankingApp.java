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
		String account = ""; 
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
			displayAccounts(collection);	

			// Menu (Loop)
			System.out.println("\nPlease make a transaction selection: ");
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
				System.out.println(myBank.findAccount(account).getAccountType()
						+ " account Balance is now $" 
						+ myBank.findAccount(account).getBalance());
				break;
			case "2" : // Withdraw
				System.out.println("Withdrawal, please enter account number.");
				account = userInput.nextLine();
				System.out.println("Please enter your withdrawal amount:");
				amount = userInput.nextDouble();
				userInput.nextLine();
				myBank.withdraw(account, amount);
				System.out.println(myBank.findAccount(account).getAccountType() 
						+ " account Balance is now $" 
						+ myBank.findAccount(account).getBalance());
				break;
			case "3" : // Check Balance
				System.out.println("Which account would you like to check the balance on?");
				account = userInput.nextLine();
				System.out.println("You have $" + myBank.findAccount(account).getBalance()
					+ " in " +myBank.findAccount(account).getAccountType());
			case "4" : // Close Account
				System.out.println("Which account would you like to close?");
				account = userInput.nextLine();
				BankAccount bankAccount = mybank.findAccount
				myBank.close(account);
				
				System.out.println("You have $" + myBank.findAccount(account).getBalance()
					+ " in " +myBank.findAccount(account).getAccountType());
			case "5" : // Terminate app
				System.out.println("Thank you for banking with us!");
				System.exit(0);
			default :
				System.out.println("Please select from one of the options (1 - 5)");
			} // end switch
		
		
		} // End Menu Loop

	}  // End Main

	public static void displayAccounts(Collection<BankAccount> collection) {
		// iterate through bank accounts and display them
		for (BankAccount currentAccount : collection) {
			System.out.println("[" + currentAccount.getAccountNumber() + "]"
					+ " " + currentAccount.getAccountType() + " $"
					+ currentAccount.getBalance());
		}
	} // end displayAccounts();
	
} // end BankingApp();
