package inheritance1.cs6;

public class Account {
	protected String accountNumber, accountHolderName;
	protected double balance;

	public Account(String accountNumber, String accountHolderName, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
}
