package inheritance1.cs1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose Account Type");
		System.out.println("1.Savings Account");
		System.out.println("2.Current Account");
		int accounttype = scanner.nextInt();

		SavingsAccount savingsAccount = new SavingsAccount();
		CurrentAccount currentAccount = new CurrentAccount();
		switch (accounttype) {
		case 1:
			System.out.println(
					"Enter Account details in comma separated(Account Name,Account Number,Bank Name,Organisation Name)");
			String line = scanner.next();
			String linearr[] = line.split(",");
			savingsAccount = new SavingsAccount(linearr[0], linearr[1], linearr[2], linearr[3]);
			savingsAccount.display();
			break;
		case 2:
			System.out.println(
					"Enter Account details in comma separated(Account Name,Account Number,Bank Name,Organisation Name)");
			String line1 = scanner.next();
			String linearr1[] = line1.split(",");
			currentAccount = new CurrentAccount(linearr1[0], linearr1[1], linearr1[2], linearr1[3]);
			currentAccount.display();
		}
		scanner.close();
	}

}
