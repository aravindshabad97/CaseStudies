package Customer4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Customer4 customer = null;
		Customer4Add address = null;

		customer = new Customer4();
		address = new Customer4Add();

		System.out.println("Enter Name : ");
		customer.setName(scanner.next());

		System.out.println("Enter Street :");
		address.setStreet(scanner.next());

		System.out.println("Enter City : ");
		address.setCity(scanner.next());

		System.out.println("Enter Pincode : ");
		address.setPincode(scanner.nextInt());

		customer.setAddress(address);

		System.out.println(customer);

		scanner.close();
	}

}
