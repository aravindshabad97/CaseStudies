package abstractClassesAndInterfaces.cs3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your choice");
		System.out.println("1.Exhibition");
		System.out.println("2.StageEvent");

		int option = scanner.nextInt();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		switch (option) {
		case 1:
			System.out.println("Enter the details in CSV format");
			String[] string = reader.readLine().split(",");

			Exhibition exhibition = new Exhibition(string[0], string[1], string[2], string[3],
					Integer.parseInt(string[4]), Double.parseDouble(string[5]));

			System.out.println("Exhibition Details" + "\nEvent Name : " + exhibition.name + "\nDetail : "
					+ exhibition.detail + "\nType : " + exhibition.type + "\nOrganiser Name : " + exhibition.organiser);

			System.out.println("Total Cost : " + exhibition.calculateAmount());
			break;
		case 2:
			System.out.println("Enter the details in CSV format");
			String[] string2 = reader.readLine().split(",");

			StageEvent stageEvent = new StageEvent(string2[0], string2[1], string2[2], string2[3],
					Integer.parseInt(string2[4]), Double.parseDouble(string2[5]));

			System.out.println("Exhibition Details" + "\nEvent Name : " + stageEvent.name + "\nDetail : "
					+ stageEvent.detail + "\nType : " + stageEvent.type + "\nOrganiser Name : " + stageEvent.organiser);
			System.out.println("Total Cost : " + stageEvent.calculateAmount());
			break;

		default:
			System.out.println("** INVALID CHOICE **");
			break;
		}
		scanner.close();
	}

}
