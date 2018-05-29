package org.wecancodeit.bank_teller;

public class BankAccount {

	private String accountNumber;
	private String type;
	private double balance;

	// Constructor
	public BankAccount(String accountNumber, String type, double balance) {
		this.accountNumber = accountNumber;
		this.type = type;
		this.balance = balance;
	}

	// Getters
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public String getAccountType() {
		return type;
	}

	public double getBalance() {
		return balance;
	}
	
	// Methods
	public void withdraw(double amount) {
		balance -= amount;
	}

	public void deposit(double amount) {
		balance += amount;		
	}

}
