//Bernie Garcia bgarcia295@toromail.csudh.edu
//Francisco Lopez flopez152@toromail.csudh.edu
import java.util.Scanner;
import java.util.List;
public class BankingAccount {

	public static void main(String[] args) throws AccountNotFoundException{
		String input;
		String firstName;
		String lastName;
		String SSN;
		String accountName;
		String accountNumber;
		String close = null;
		double balance = 0;
		long withdraw=0;
		long deposit=0;
		Scanner scanner = new Scanner(System.in);
		Registry r = new Registry();
		
		{
			while(true) {
				System.out.println("~~~~~~~~~~~~~Welcome To Our Bank!~~~~~~~~~~~~~");
				System.out.println("1-Open Account");
				System.out.println("2-List Accounts");
				System.out.println("3-Deposit Funds");
				System.out.println("4-Withdraw Fund");
				System.out.println("5-Close An Account");
				System.out.println("6-Exit");
				System.out.print("Please Enter Your Choice: ");
				input =scanner.nextLine();
				
				if(input.equals("1"))	{
					System.out.println("~~~~~~~~~~~~~Opening Account~~~~~~~~~~~~~");
					System.out.print("Enter Your First Name: ");
					firstName = scanner.nextLine();
					System.out.print("Enter Your Last Name: ");
					lastName = scanner.nextLine();
					System.out.print("Enter Your Social Security Number: ");
					SSN = scanner.nextLine();
					System.out.print("Name Your Account: ");
					accountName = scanner.nextLine();
					System.out.println("Thank You, Your Account Number Is: " );
					
					Registry.save(new Clients(firstName, lastName, SSN, accountName), new Balance(balance));
					
					
				}
				
				if(input.equals("2"))	{
					System.out.println("~~~~~~~~~~~~~Listing Accounts~~~~~~~~~~~~~");
				Registry.list();
				}
				
				if(input.equals("3"))	{
					System.out.println("~~~~~~~~~~~~~Deposting Funds~~~~~~~~~~~~~");
					System.out.println("Enter Your Account Number: ");
					accountNumber = scanner.nextLine();
					try {
						System.out.println(Registry.find(accountNumber));
					}
					catch(AccountNotFoundException e) {
						
						System.out.println("The Account number " +accountNumber+ " Not Found!");
					}
					
					
					System.out.println("Enter The Amount To Deposit: ");
					balance = scanner.nextDouble();
					Balance.deposit(balance,Registry.find(accountNumber));
				}
				
				if(input.equals("4"))	{
					System.out.println("~~~~~~~~~~~~~Withdrawing Funds~~~~~~~~~~~~~");
					System.out.println("Enter Your Account Number: ");
					accountNumber = scanner.nextLine();
					try {
						System.out.println(Registry.find(accountNumber));
					}
					catch(AccountNotFoundException e) {
						
						System.out.println("The Account number " +accountNumber+ " Not Found!");
					}
					System.out.println("Enter The Amount To Withdraw: ");
					balance = scanner.nextDouble();
					Balance.withdraw(balance);
					
				}
				
				if(input.equals("5"))	{
					System.out.println("~~~~~~~~~~~~~Closing Account~~~~~~~~~~~~~");
					System.out.println("Enter Account Number To Close: ");
					accountNumber = scanner.nextLine();
					try {
						System.out.println(Registry.find(accountNumber));
					}
					catch(AccountNotFoundException e) {
						
						System.out.println("The Account number " +accountNumber+ " Not Found!");
					}
					System.out.println("Enter Close");
					close = scanner.nextLine();
					Balance.setStatus(close,Registry.find(accountNumber));
				}
				
				if(input.equals("6"))	{
					System.out.println("Now Exiting Program \nHave A Nice Day!");
					System.exit(0);
				}
				
			}
		}
}
}
