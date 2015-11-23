
import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.*;

//AccountTest.java
//Colton Hines, Joshua Cheseman, Dave Cassarubius 
//COSC 201
//10/08/2015
// Driver method for the the Bank class. Takes in a filename for the command line, passes the appropriately formatted data from file to an arraylist, prints out all information about accounts in the bank.

// AccountTest class.
public class AccountTest {
	public static void main(String[] args) {

		ArrayList<Account> account = new ArrayList<Account>(); // New array list
																// declared to
																// store all
																// accounts in
																// the bank.
		try {
			String argument; // Argument stores the filename passed in from the
								// command line.

			String Line; // Line stores a line read in from the file as a
							// string.

			argument = (args[0]); // Argument set to value from command line.

			File Accounts = new File(args[0]); // File declared to be read in
												// from text file.

		
			int counter; // Counter for each line.
			counter = 0;

			Scanner scan; // Scanner object.

			scan = new Scanner(Accounts); // Scanner object reads in the file.

			while (scan.hasNextLine()) { // While there is a next line in the
											// file, store the line as a string
											// and increment the counter.

				Line = scan.nextLine();
				counter = counter + 1;

				String[] arr1; // String array to store tokens.
				arr1 = Line.split(","); // Tokens split by comma.

				switch (arr1[1]) { // Switch case for each possible type of
									// account. New account of whatever type is
									// created and added to the arraylist.
				case " Interest Checking":
					float g;
					g = Float.parseFloat((arr1[2]));
					float i;
					i = Float.parseFloat((arr1[3]));
					InterestCheckingAccount ICAccount = new InterestCheckingAccount(arr1[0], counter, g, i);
					account.add(ICAccount);

					break;
				case " Platinum Checking":

					float h;
					h = Float.parseFloat(arr1[2]);
					float j;
					j = Float.parseFloat(arr1[3]);
					PlatinumCheckingAccount PlatAccount = new PlatinumCheckingAccount(arr1[0], counter, h, j);
					account.add(PlatAccount);

					break;
				case " Checking":

					float k;
					k = Float.parseFloat(arr1[2]);
					NonInterestCheckingAccount CheckingAccount = new NonInterestCheckingAccount(arr1[0], counter,
							k);
					account.add(CheckingAccount);
				}

			}
		} catch (FileNotFoundException e) { // If file not found, print out
											// error message.
			// TODO Auto-generated catch block
			System.out.println("The file is blank");
		}
			String closeAccount; // String value to store what account number
									// you want to close.
			Scanner input = new Scanner(System.in);
			Bank banksy = new Bank(account); // New bank object declared.

			DecimalFormat df = new DecimalFormat("#,###,##0.00"); // Rounds
																	// value to
																	// two
																	// decimal
																	// places
																	// for
																	// readability.
			System.out.println("Total assests are: " + df.format(banksy.totalAssets()));
			System.out.println("***Opening Account***");
			banksy.openAccount(); // Opens account.
			System.out.println("*** Adding Interest!***");
			banksy.addInterest(); // Adds interest to all accounts in the bank.
			System.out.println("Total assests are: " + df.format(banksy.totalAssets())); // Prints
																							// out
																							// total
																							// assets
																							// in
																							// bank.

			System.out.println("***Printing***");
			System.out.println(banksy.toString()); // Prints out all account
													// information in the bank.
			System.out.println("***Close Account***");
			
			banksy.closeAccount(); // Closes account that you wish
												// to close.
			System.out.println("Closing Account");
			System.out.println("***Printing***");
			System.out.println(banksy.toString()); // Prints out new list of
													// accounts in the bank.

		}

	

	private static int ParseInt(String closeAccount) {
		// TODO Auto-generated method stub
		return 0;
	}
}
