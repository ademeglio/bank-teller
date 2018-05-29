# Bank Teller
## Objective
Design a `BankAccount` class that will perform capabilities of a single Bank Account, a `Bank` class that will house multiple accounts and a `BankingApp` (with a main method) to simulate a user interface where you can access your accounts and perform banking transactions.

### Tasks
Inside of `BankAccount` Class program the following:

  * 3 instance variables to handle `String accountNum`, `String type`, and `double balance`
  * note the accountNum will be a unique identifier
  * create the `Constructor` that handles the 3 pieces of instance data in the order mentioned above
  * create the following methods: create appropriate methods needed for bank transactions

Inside of the `Bank` Class complete the following:

  * Create a `map` called `accounts`
  * `public Collection<BankAccount> accounts()` to return all accounts (if you prefer to name your method different please do)
  * A method to add a Bank Account
  * A `BankAccount` method to get access a particular `accountNum`
  * A `BankAccount` method to close a particular accountNum

Hint: Think of what a Bank does…it houses many bank accounts…that is why this class is created to “maintain” the collection

Inside of the `BankingApp` Class program the following:

  * A `Bank` object called `myBank`
  * A `BankAccount` object called `account1` with the following properties `("1111","Checking",500.00)`
  * A `BankAccount` object called `account2` with the following properties `("2222","Savings",2500.00)`
  * Have `myBank` `add` the 2 accounts to the map
  * Set up a user interface to give similar output to the console:
    * Note: When displaying your accounts use an enhanced for loop

### Sample Output
  * There is flexibility here, feel free to design your user interface to have the functionality your desire

```  
Here are your accounts at our bank:
Checking 500.0
Savings 100.0

What would you like to do?
Press 1 to deposit
Press 2 to withdrawal
Press 3 to check balance
Press 4 to close an account
Press -1 to exit
1
You want to deposit.
Here are your accounts
(1111) Checking 500.0
(2222) Savings 100.0
Select the account by (acct num) to perform this transaction.
1111
You have selected 1111
Enter the amount to deposit:
2000
Your updated balance is now 2500.0

What would you like to do?
Press 1 to deposit
Press 2 to withdrawal
Press 3 to check balance
Press 4 to close an account
Press -1 to exit
4
You would like to close an account.
Here are your accounts
(1111) Checking 2500.0
(2222) Savings 100.0
Enter the account number of the account you would like to close:
2222
You are closing account # 2222
Here are your remaining accounts
(1111) Checking 2500.0

What would you like to do?
Press 1 to deposit
Press 2 to withdrawal
Press 3 to check balance
Press 4 to close an account
Press -1 to exit
```