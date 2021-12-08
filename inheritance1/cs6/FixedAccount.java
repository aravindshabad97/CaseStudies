package inheritance1.cs6;

public class FixedAccount extends SavingAccount {
	private int lockingPeriod;

	public int getLockingPeriod() {
		return lockingPeriod;
	}

	public void setLockingPeriod(int lockingPeriod) {
		this.lockingPeriod = lockingPeriod;
	}

	public FixedAccount(String accountNumber, double balance, String accountHolderName, double d, int lockingPeriod) {
		super(accountNumber, accountHolderName, balance, d);
		this.lockingPeriod = lockingPeriod;
	}

}
