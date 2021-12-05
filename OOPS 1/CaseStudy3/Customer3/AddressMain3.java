package Customer3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AddressMain3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Customer3[] customersObj = new Customer3[100];
		Customer3[] duplicateCustomers = new Customer3[100];
		Customer3 customer1 = null;
		AddressExample3 address = null;
		int customersObjCount = 0, duplicateCustomersCount = 0, i = 0, j;
		try {
			System.out.print("Enter Number of Customers : ");
			customersObjCount = scanner.nextInt();
			while (i < customersObjCount) {
				customer1 = new Customer3();
				address = new AddressExample3();
				System.out.printf("Enter the Customer Details %d \n", i + 1);
				System.out.print("Enter the Name : ");
				customer1.setName(scanner.next());

				System.out.print("Enter the street : ");
				address.setStreet(scanner.next());

				System.out.println("Enter the City : ");
				address.setCity(scanner.next());

				System.out.println("Enter the Pincode : ");
				address.setPincode(scanner.nextInt());

				customer1.setAddress(address);
				customersObj[i] = customer1;
				i++;
			}
			for (i = 0; i < customersObjCount; i++) {
				for (j = i + 1; j < customersObjCount; j++) {
					if (customersObj[i].equals(customersObj[j])) {
						duplicateCustomers[duplicateCustomersCount++] = customersObj[i];
					}
				}
			}
			if (duplicateCustomers[0] == null) {
				System.out.println("No duplicate details");
			} else {
				System.out.println("The identical Customers Details:");
				for (i = 0; i < duplicateCustomersCount; i++) {
					System.out.println((i + 1) + ")" + duplicateCustomers[i]);
				}
			}
		} catch (InputMismatchException exception) {
			System.err.println("Given input is not valid!!! Please give valid input");

		}
		scanner.close();

	}
}
