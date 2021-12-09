package inheritance.cs7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		char choice;

		do {
			VISACard visaCard = new VISACard();

			System.out.println("Enter the holder name : ");
			visaCard.setHolderName(scanner.nextLine());

			System.out.println("Enter the CCV number : ");
			visaCard.setCcv(scanner.nextLine());

			System.out.println("Enter the bill amount : ");
			double amount = scanner.nextDouble();

			System.out.println("Mention the type of spending : ");
			String purchaseType = scanner.next();

			System.out.println("Choose card type");
			System.out.println("1.VISA card");
			System.out.println("2.HP VISA card");

			int cardType = scanner.nextInt();

			switch (cardType) {
			case 1:

				Double computeRewardPoints = visaCard.computeRewardPoints(purchaseType, amount);
				System.out.println("Holder Name : " + visaCard.getHolderName() + "\nCVV : " + visaCard.getCcv()
						+ "\nReward Points : " + computeRewardPoints);
				break;

			case 2:
				HPVISACard hpCard = new HPVISACard();
				Double computeRewardPoints2 = hpCard.computeRewardPoints(purchaseType, amount);
				System.out.println("HolderName: " + hpCard.getHolderName() + "\nCCV:" + hpCard.getCcv()
						+ "\nReward points:" + computeRewardPoints2);
				break;

			default:
				break;
			}

			System.out.println("Do you want to continue ? (Y/N) : ");
			choice = scanner.next().charAt(0);

			if (choice == 'n' || choice == 'N')
				System.out.println("** THANK YOU **");

		} while (choice == 'y' || choice == 'Y');
		scanner.close();
	}

}
