//Bernie Garcia bgarcia295@toromail.csudh.edu
//Francisco Lopez flopez152@toromail.csudh.edu
public class Balance {

	private static boolean status;
	private static double balance;

	public Balance(double balance) throws AccountNotFoundException{
		Balance.balance=balance;
		Balance.status = true;
		
		
	}
	public boolean getStatus() {
		return status;
	}
	public static void setStatus(String close, Account a) {
		a.setStatus(close);
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public static void deposit(double amount,Account a) {
		if(status=true) {
			Balance bl = a.getBalance();
		   bl.setBalance(balance + amount);
		  
		}
	}
	public static void withdraw(double amount) {
		if(status=true && amount<= balance) {
			balance -= amount;
		}
		
	}
	
public String toString() {
	return ""+balance;
}	
}
