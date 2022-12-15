//Bernie Garcia bgarcia295@toromail.csudh.edu
//Francisco Lopez flopez152@toromail.csudh.edu
public class Account {

	private static int accNumber=1000;
	private Clients client;
	private Balance balance;
	private String accountNumber;
	private String status;
	public Account(Clients client, Balance balance) {
		this.client = client;
		this.balance = balance;
		this.accountNumber = ""+accNumber++;
		this.status="open";
	}


	public Clients getClient() {
		return client;
	}
	public Balance getBalance() {
		return balance;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setStatus(String s) {
		this.status = s;
	}

	public String toString() {
		return accountNumber+"" +client.toString()+ " : " +balance.toString()+ " : Open: " +status;

	}
	}
	
