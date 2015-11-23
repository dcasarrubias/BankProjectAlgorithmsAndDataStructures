/* This class creates the array that will store everything scanned from the text file.
 * It will also calculate the total sum, the sum with added interest.
 * It opens a new account based on user input and will close an account chosen by the user.
 * Finally it converts everything to a string to return to be displayed  in the AccountTest class.
 * 
 */
import java.util.*;

//This method generates the the ArrayList that reads in everything from the text file and is passed to the other methods. 
public class Bank {
	ArrayList<Account>account = new ArrayList<>(); 
	

	public Bank(ArrayList<Account> account){ //sets private variable equal to the parameter account. 
		this.account=account;
	}
	
	public float totalAssets(){ //calculates the sum of all the accounts. 
		float sum=0;
		for(int k=0; k<account.size(); k++){
			
			sum+=account.get(k).getCurrentBalance();
			
		}
		
		return sum;  // returns sum of all the balances  in all accounts
	}
	
	public void addInterest(){
	 // invokes the add interest method for all accounts in the bank that are interest bearing.	
		 
		for(int i = 0; i <account.size(); i++){
			if(account.get(i) instanceof NonInterestCheckingAccount);
			
			 
			else{
			((InterestCheckingAccount)account.get(i)).addInterest();
			
			}
		}
	}
	
	public void openAccount(){  // opens a new  account based on user input and makes a new account type object to be stored into the array. 
	
		Scanner scan=new Scanner(System.in);
		String AccountName;
		int AccountNumber;
		AccountNumber=1;
		String AccountType;
		float balance;
		balance=0;
		float deposit;
		float interest = 3;
		System.out.println("Enter name: ");
		AccountName=scan.nextLine();
		System.out.println(AccountName);
		
		System.out.println("Enter the deposit: ");
		deposit=scan.nextFloat();
	
		System.out.println(deposit);
		
		
		System.out.println("Enter the Account type: ");
		AccountType=scan.next();
		
		switch(AccountType){
		case "Checking":  NonInterestCheckingAccount CheckingAccount=new NonInterestCheckingAccount(AccountName,AccountNumber,  deposit);
				account.add(CheckingAccount);
		break;
		case "Interest": InterestCheckingAccount InterestCheckAccount=new InterestCheckingAccount(AccountName, AccountNumber, deposit, interest);
		account.add(InterestCheckAccount);
		break;
		case "Platinum": PlatinumCheckingAccount PlatCheckAccount=new PlatinumCheckingAccount(AccountName, AccountNumber, deposit, interest);
		account.add(PlatCheckAccount);
		break;
		
		}
		
		
		
	}
	
	public void closeAccount(){  //closes account by removing the account the user inputs by typing the corresponding number. 
		int closeAccount;
		Scanner input =new Scanner(System.in);
		System.out.println("Which account do you want to close: ");
		closeAccount = input.nextInt();
		for(Account account_i : account){
			if (account_i.getAccountNumber()==(closeAccount)){
				account.remove(account_i);
			
				return;
			}
				
		}
	}
	
	public String toString(){ // returns a string containing a list of accounts with all account information, one per line, sorted by name.
		String all_accounts = "";
		for(int y=0; y<account.size(); y++){
			all_accounts += account.get(y).toString();
			all_accounts += "\n";
			Collections.sort(account);
		}
		return all_accounts;  
	}
	
	
	
}
