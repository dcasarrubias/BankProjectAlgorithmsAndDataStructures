//This account inherits methods from account but simply returns information to the toString to output later. 
public class NonInterestCheckingAccount extends Account{
	
//inherits parameters from the Account class. 
public NonInterestCheckingAccount(String name, int accountNumber, float balanceCurrent){
	super( name,  accountNumber,  balanceCurrent);
}
//Returns the information necessary for the toString method so it can be displayed when called later. 
public String toString(){
	return getAccountNumber() + " " + getAccountHolder() +" Checking "+ getCurrentBalance();
}
@Override
public int compareTo(Account account) {
	// TODO Auto-generated method stub
	return getAccountHolder().compareTo(account.getAccountHolder()); 
}




}

