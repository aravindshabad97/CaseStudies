package oops2.casestudy1;

import java.util.Scanner;

public class DriverMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Address1 address1 = new Address1();

		System.out.println("Enter Address Line 1 : ");
		address1.setAddressLine1(scanner.nextLine());

		System.out.println("Enter Address Line 2 : ");
		address1.setAddressLine2(scanner.nextLine());

		System.out.println("Enter the City Name : ");
		address1.setCity(scanner.nextLine());

		System.out.println("Enter the State Name : ");
		address1.setState(scanner.nextLine());

		System.out.println("Enter the Pincode : ");
		address1.setPincode(scanner.nextInt());

		System.out.println("The Address Details are \n"+address1);
		scanner.close();
	}

}
