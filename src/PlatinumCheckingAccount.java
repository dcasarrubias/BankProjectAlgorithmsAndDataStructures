import java.text.DecimalFormat;


//This class doubles the interest rate of a typical Interest Checking account and returns it to be displayed when called.
public class PlatinumCheckingAccount extends InterestCheckingAccount {

	DecimalFormat df = new DecimalFormat("#,###,##0.00"); 
	
	private float interest;
	//takes in parameters and inherits from the InterestCheckingAccount class and also adjust the interest rate so its a percentage.
	public PlatinumCheckingAccount(String name, int accountNumber, float balanceCurrent, float interest) {
		super(name, accountNumber, balanceCurrent, interest);
		this.interest=interest;
		interest=interest/100; //this adjust the interest rate to do it is a percentage. 
}
	public void addInterest(){ //calculates the interest and doubles the given interest in order to make it a platinum account.
		interest=interest/100;
		setCurrentBalance(getCurrentBalance() * getInterest()*2 + getCurrentBalance());  //calculates the interest and doubles the interest rate so its a platinum account.
	}
	public String toString(){ //returns all the information to be called by the to string method in Bank. 
		
		return getAccountNumber()+ " "+getAccountHolder() +" " +" Platinum Checking "  + " " +df.format(getCurrentBalance())+ " " + interest*2;
		
	}
}
