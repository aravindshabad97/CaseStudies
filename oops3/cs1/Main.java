package oops3.cs1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ItemTypeBO itemTypeBO = new ItemTypeBO();

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the Number of Item Type : ");
		int num = scanner.nextInt();

		ItemType itemType[] = new ItemType[num];

		if (num >= 1 && num <= 10) {
			for (int i = 0; i < num; i++) {
				System.out.printf("Enter the Item Type %d Name : ", (i + 1));
				String name = scanner.next();

				System.out.print("Enter the Deposit Amount : ");
				Double deposit = scanner.nextDouble();

				System.out.print("Enter the Cost per day : ");
				Double costPerDay = scanner.nextDouble();

				itemType[i] = new ItemType(name, deposit, costPerDay);
				itemTypeBO.add(itemType[i], itemType, i);
			}
			itemTypeBO.display(itemType);
		}
		System.out.println("Enter the Name of the item to be searched : ");
		String search = scanner.next();

		itemTypeBO.search(search, itemType);

		scanner.close();
	}

}
