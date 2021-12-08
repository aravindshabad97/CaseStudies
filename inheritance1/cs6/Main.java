package inheritance1.cs6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter account Detail:");
		String detail = scanner.nextLine();

		AccountBO accountBo = new AccountBO();

		FixedAccount accountDetail = accountBo.getAccountDetail(detail);

		System.out.println("** AccountDetails **");

		System.out.format("%-20s %-10s %-20s %-20s %s\n", "Account Number", "Balance", "Account holder name",
				"Minimum balance", "Locking period");

		System.out.format("%-20s %-10s %-20s %-20s %s\n", accountDetail.accountNumber, accountDetail.balance,
				accountDetail.accountHolderName, accountDetail.minBalance, accountDetail.getLockingPeriod());

		scanner.close();

	}

}
