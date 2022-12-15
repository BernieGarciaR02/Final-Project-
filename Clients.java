//Bernie Garcia bgarcia295@toromail.csudh.edu
//Francisco Lopez flopez152@toromail.csudh.edu
public class Clients {

	private String firstName;
	private String lastName;
	private String SSN;
	private String accountName;
	
	public Clients(String firstName, String lastName, String SSN, String accountName) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.SSN=SSN;
		this.accountName=accountName;
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	
	}
		public String toString() {
			return "(" +accountName+ ") : " +firstName+ " " +lastName+ " : " +SSN;
		
	}
}

	
