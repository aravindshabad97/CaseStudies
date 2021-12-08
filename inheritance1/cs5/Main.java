package inheritance1.cs5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the name of the event:");
		String name = scanner.nextLine();

		System.out.println("Enter the detail of the event:");
		String eventDetail = scanner.nextLine();

		System.out.println("Enter the owner name of the event:");
		String ownerName = scanner.next();

		System.out.println("Enter the type of the event:");
		System.out.println("1.Exhibition");
		System.out.println("2.StageEvent");
		int choice = scanner.nextInt();

		switch (choice) {

		case 1:
			System.out.println("Enter the number of stalls:");
			int noOfStalls = scanner.nextInt();

			Exhibition exhibition = new Exhibition(name, eventDetail, ownerName, noOfStalls);

			System.out.println("The projected revenue of the event is: " + exhibition.projectedRevenue());

		case 2:
			System.out.println("Enter the number of shows:");
			int noOfShows = scanner.nextInt();

			System.out.println("Enter the number of seats per show:");
			int noOfSeats = scanner.nextInt();

			StageEvent stageEvent = new StageEvent(name, eventDetail, ownerName, noOfShows, noOfSeats);

			System.out.println("The projected revenue of the event is:" + stageEvent.projectedRevenue());

		}
		scanner.close();
	}

}
