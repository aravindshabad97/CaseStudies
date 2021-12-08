package inheritance1.cs6;

public class SavingAccount extends Account {
	
	protected double minBalance;

	public SavingAccount(String accountNumber, String accountHolderName, double balance, double minBalance) {
		super(accountNumber, accountHolderName, balance);
		this.minBalance = minBalance;
	}
}
