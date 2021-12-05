package ItemType1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ItemType it = new ItemType();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Item type Name : ");
		String name = sc.next();
		System.out.println("Enter Cost per day : ");
		double costPerDay = sc.nextDouble();
		System.out.println("Enter Deposit : ");
		double deposit = sc.nextDouble();
		it.setName(name);
		it.setCostPerDay(costPerDay);
		it.setDeposit(deposit);
		it.display();
		sc.close();
	}

}
