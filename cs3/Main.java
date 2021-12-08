package inheritance1.cs3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Choose Stall Type");
		System.out.println("1.Silver Stall");
		System.out.println("2.Gold Stall");
		System.out.println("3.Platinum Stall");
		int num = scanner.nextInt();

		switch (num) {
		case 1:
			System.out.println(
					"Enter Stall details in comma separated(Stall Name,Stall Description,Owner Name,Stall Cost)");
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			String[] arr;
			arr = bufferedReader.readLine().split(",");
			SilverStall silverStall = new SilverStall(arr[0], arr[1], arr[2], Integer.parseInt(arr[3]));
			silverStall.display();
			break;
		case 2:
			System.out.println(
					"Enter Stall details in comma separated(Stall Name,Stall Description,Owner Name,Stall Cost,Number of TV set)");
			BufferedReader b1 = new BufferedReader(new InputStreamReader(System.in));
			String[] arr1;
			arr1 = b1.readLine().split(",");
			GoldStall goldStall = new GoldStall(arr1[0], arr1[1], arr1[2], Integer.parseInt(arr1[3]),
					Integer.parseInt(arr1[4]));
			int tvset = 100 * goldStall.getTvSet();
			int cost = tvset + goldStall.getCost();
			System.out.println("Stall Name : " + goldStall.getName() + "\nDetails : " + goldStall.getDetail()
					+ "\nOwner Name : " + goldStall.getOwner() + "\nTV Sets : " + tvset + "\nTotal Cost : " + cost);
			break;
		case 3:
			System.out.println(
					"Enter Stall details in comma separated(Stall Name,Stall Description,Owner Name,Stall Cost,Number of TV set,Number of Projectors)");
			BufferedReader b2 = new BufferedReader(new InputStreamReader(System.in));
			String[] arr2;
			arr2 = b2.readLine().split(",");
			PlatinumStall platinumStall = new PlatinumStall(arr2[0], arr2[1], arr2[2], Integer.parseInt(arr2[3]),
					Integer.parseInt(arr2[4]), Integer.parseInt(arr2[5]));
			int tvset1 = 100 * platinumStall.getTvSet();
			int projector = 500 * platinumStall.getProjector();
			int cost1 = platinumStall.getCost() + tvset1 + projector;
			System.out.println("Stall Name :" + platinumStall.getName() + "\nDetails : " + platinumStall.getDetail()
					+ "\nOwner Name : " + platinumStall.getOwner() + "\nTV Sets : " + platinumStall.getTvSet()
					+ "\nProjectors : " + platinumStall.getProjector() + "\nTotal Cost : " + cost1);
			break;

		default:
			break;
		}
		scanner.close();
	}

}
