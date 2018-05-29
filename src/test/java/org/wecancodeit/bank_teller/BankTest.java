package org.wecancodeit.bank_teller;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class BankTest {
	
	Bank underTest;
	BankAccount account1;
	
	@Before
	public void setUp() {
		underTest = new Bank();
		account1 = new BankAccount("1", "Checking", 100);
	}
	
	@Test
	public void shouldBeAbleToAddAccount() {
		underTest.add(account1);
		BankAccount retrievedAccount = underTest.findAccount("1");

		assertThat(retrievedAccount, is(account1));
	}
}
