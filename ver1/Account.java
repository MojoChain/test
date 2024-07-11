package ver1;

public class Account {
	// Instance variable, only available inside this class.
	private double balance;
	
	public Account(double initBalance) {
		balance = initBalance;
	}

	// A "getter" method that simply returns the balance.
	public double getBalance() {
		return balance;
	}
	
// A method that increases the balance by amount
public void deposit(double amount) {
	if(amount>0) {
		balance += amount;
	}
}

public void withdraw(double amount) {
	if(amount>0) {
		balance -= amount;
	}
}

public String toString() {
	String msg = "Balance= $" + balance;
	return msg;
}
	
	// Informal test code
	public static void main(String[] args) {
		Account a1 = new Account(1000.0);
		//Deposit
		System.out.println("Balance= $" + a1.getBalance());
		a1.deposit(500.0);
		System.out.println("Balance= $" + a1.getBalance());
		a1.deposit(1000.00);
		System.out.println("Balance= $" + a1.getBalance() +"\n");
		//Withdraw
		a1.withdraw(200.0);
		System.out.println("Balance= $" + a1.getBalance() +"\n");
		//toString
		System.out.println(a1.toString());
		System.out.println(a1);
		
	}
}
