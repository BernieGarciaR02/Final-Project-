//Bernie Garcia bgarcia295@toromail.csudh.edu
//Francisco Lopez flopez152@toromail.csudh.edu
import java.util.ArrayList;
public class Registry {

	private static ArrayList<Account> acc = new ArrayList <Account>();
	
	public static Account save(Clients client, Balance balance) {
	Account a=new Account(client,balance);
	acc.add(a);
	return a;
}
public static void list() {
	for(Account a:acc) {
		System.out.println(a);
	}
}

public static Account find(String accNumber) throws AccountNotFoundException{
	int count = 0;
	for(Account a:acc) {
		if(a.getAccountNumber().equalsIgnoreCase(accNumber)) {
			count++;
			return a;
			
		}
		//
	}
	if(count == 0) {
		throw new AccountNotFoundException(accNumber);
	}
	return null;
}

	
}
