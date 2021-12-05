package Customer2;

import java.util.Scanner;

public class CustMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("** Enter Customer Details **");
		
		System.out.println("Enter Customer Name : ");
		String name = sc.next();
		
		System.out.println("Enter Customer Email : ");
		String email = sc.next();
		
		System.out.println("Enter Customer Type : ");
		String type = sc.next();
		
		System.out.println("Enter Customer Location : ");
		String location = sc.next();
		
		Customer customer = new Customer(name, email, type, location);
		customer.display();

		sc.close();
	}

}
