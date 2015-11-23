// Account.java
// Colton Hines, Joshua Cheseman, Dave
// COSC 201
// 10/08/2015
// Account class defines variables associated with accounts. Methods are defined to deposit, withdraw, get and set variables in account, and output the variables to a string (toString method).

// Account class declaration.
public abstract class Account implements Comparable<Account> {
	private String AccountHolder;
	private int AccountNumber;
	private float CurrentBalance;
	
	public Account(){ // Account variable values initialized to account holder Josh, account number 0, and current balance 0.
		AccountHolder="Josh";
		AccountNumber=0;
		CurrentBalance=0;
		
	}
	
	
	// Account constructor with parameters .
	public Account(String name, int accountNumber, float balanceCurrent){
		AccountHolder = name;
		AccountNumber = accountNumber;
		CurrentBalance = balanceCurrent;
		
	}
	//Compares the values in the array in order to organize them into an alphabetized list of accounts from the text file. 
	public int CompareTo(Account account){
		
	return AccountHolder.compareTo(account.AccountHolder);
	}
	
	// Deposit method sets balance to current balance plus incoming deposit.
	public void Deposit(float IncomingDeposit){
		
		CurrentBalance=CurrentBalance+ IncomingDeposit;
	}
	
	// Withdraw method sets the balance to the current balance minus the current withdraw.
	public void Withdraw(float CurrentWithdrawl){
		CurrentBalance=CurrentBalance-CurrentWithdrawl;
	}
	
	// Getter method for account holder.
	public String getAccountHolder() {
		return AccountHolder;
	}
	
	// Setter method for account holder.
	public void setAccountHolder(String accountHolder) {
		AccountHolder = accountHolder;
	}
	
	// Getter method for account number.
	public int getAccountNumber() {
		return AccountNumber;
	}
	
	// Setter method for account number.
	public void setAccountNumber(int accountNumber) {
		AccountNumber = accountNumber;
	}
	
	// Getter method for current balance.
	public float getCurrentBalance() {
		return CurrentBalance;
	}
	
	// Setter method for current balance.
	public void setCurrentBalance(float currentBalance) {
		CurrentBalance = currentBalance;
	}

	// ToString method returns the account holder, account number, and current balance.
	public String toString(){
		return AccountHolder + AccountNumber + CurrentBalance;
	}
}
