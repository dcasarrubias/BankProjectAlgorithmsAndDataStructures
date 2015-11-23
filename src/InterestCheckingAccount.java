import java.text.DecimalFormat;


/*This class calculates the interest.
 * It sets the default interest rate.
 * It also returns statements to be printed out later. 
 * It also applies the interest to the original balance when needed. 
 * 
 */

//This method inherits parameters from the super and the interface in order to get the interest. 
public class InterestCheckingAccount extends Account implements InterestBearingAccount { 
	DecimalFormat df = new DecimalFormat("#,###,##0.00"); 
	private float interest;
	public InterestCheckingAccount(String name,  int accountNumber, float balanceCurrent, float interest){
		super( name, accountNumber, balanceCurrent);
		this.interest= interest/100; //sets the interest rate to percent form. 
		
	}
	//sets the default interest rate for the type of account. 
	public InterestCheckingAccount(){
		interest=3;
	}
//returns all the information needed to output the information later. 
public String toString(){
	return getAccountNumber()+ " "+ getAccountHolder() + " Interest Checking" + " " + df.format(getCurrentBalance()) +" "  + interest ;
}

//calculates the balance with interest. 
public void addInterest(){
	setCurrentBalance(getCurrentBalance() * interest + getCurrentBalance()); 
	
}
//returns the interest rate and establishes getter method for method caling later.
public float getInterest() {
	return interest;
}
//set the interest rate equal to the private interest so they are one in the same. 
public void setInterest(float interest) {
	this.interest = interest;
}
@Override
public int compareTo(Account account) {
	// TODO Auto-generated method stub
	return getAccountHolder().compareTo(account.getAccountHolder()); 
}




}

