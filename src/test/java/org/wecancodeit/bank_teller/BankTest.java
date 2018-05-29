package org.wecancodeit.bank_teller;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class BankTest {
	
	Bank underTest;
	BankAccount account1;
	BankAccount account2;
	
	@Before
	public void setUp() {
		underTest = new Bank();
		account1 = new BankAccount("1", "Checking", 100);
		account2 = new BankAccount("2", "Savings", 100);
	}
	
	@Test
	public void shouldBeAbleToAddAccount() {
		underTest.add(account1);
		BankAccount retrievedAccount = underTest.findAccount("1");

		assertThat(retrievedAccount, is(account1));
	}
	
	@Test
	public void ShouldBeAbleToAddTwoAccounts() {
		underTest.add(account1);
		underTest.add(account2);
		Collection<BankAccount> allAccounts = underTest.getAllAccounts();
		
		assertThat(allAccounts, containsInAnyOrder(account1,account2));
	}
	
	@Test
	public void shouldBeAbleToCloseAnAccount() {
		underTest.add(account1);
		underTest.close(account1);
		BankAccount retrievedAccount = underTest.findAccount(account1.getAccountNumber());
		
		assertThat(retrievedAccount, is(nullValue()));
	}
	
	@Test
	public void shouldWithdrawFromAccount() {
		underTest.add(account1);
		underTest.withdraw(account1.getAccountNumber(), 50);
		
		assertThat(account1.getBalance(), is(50));
	}
	
	@Test
	public void shouldDepositToAccount() {
		underTest.add(account1);
		underTest.deposit(account1.getAccountNumber(), 50);
		
		assertThat(account1.getBalance(), is(150));
	}
	
} // End Test();
