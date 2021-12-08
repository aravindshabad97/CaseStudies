package inheritance1.cs4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);
		TicketsBooking ticketBooking = new TicketsBooking();

		System.out.println("Enter the booking details");
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		String[] ticket;
		ticket = bufferedReader.readLine().split(",");
		ticketBooking.setStageEvent(ticket[0]);
		ticketBooking.setCustomer(ticket[1]);
		ticketBooking.setNoOfSeats(Integer.parseInt(ticket[2]));

		System.out.println("Payment Mode");
		System.out.println("1.Cash payment");
		System.out.println("2.Wallet payment");
		System.out.println("3.Credit card payment");

		int paymentMode = scanner.nextInt();

		switch (paymentMode) {

		case 1:
			System.out.println("Enter the amount");
			double amount = scanner.nextDouble();
			ticketBooking.makepayment(amount);
			break;

		case 2:
			System.out.println("Enter the amount");
			double amount1 = scanner.nextDouble();

			System.out.println("Enter the wallet number");
			String walletNumber = scanner.next();

			ticketBooking.makePayment(walletNumber, amount1);

			break;

		case 3:
			System.out.println("Enter cardholder name");
			String name = scanner.next();

			System.out.println("Enter the amount");
			double amount2 = scanner.nextDouble();

			System.out.println("Enter the credit card type");
			String card = scanner.next();

			System.out.println("Enter the CCV number");
			String ccv = scanner.next();

			ticketBooking.makePayment(card, ccv, name, amount2);

			break;
		default:
			break;
		}
		scanner.close();
	}

}
