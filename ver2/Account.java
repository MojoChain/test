package ver2;

public class Account {
	// Instance variable, only available inside this class.
	private double balance;
	private String name;
	
	public Account(double balance) {
		this("unknown", balance);
	}
	public Account(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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

public void mergeAccount(Account a) {
	if(this.getName().equals(a.getName())) {
		this.balance += a.getBalance();
	}
}

public String toString() {
	String msg = "Name: " + name + "Balance= $" + balance;
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
