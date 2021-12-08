package inheritance1.cs2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) throws ParseException {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your choice");
		System.out.println("1.Exhibition Event");
		System.out.println("2.Stage Event");
		int accountType = scanner.nextInt();
		try {
			switch (accountType) {
			case 1:
				System.out.println("Enter the details, name, detail, type, ownerName, costPerDay, noOfStall");
				String line1 = scanner.next();
				String[] arr = line1.split(",");

				System.out.println("Enter the starting date of the event");
				Date startDate = (Date) new SimpleDateFormat("dd-mm-yyyy").parse(scanner.next());

				System.out.println("Enter the Ending date of the event");
				Date endDate = (Date) new SimpleDateFormat("dd-mm-yyyy").parse(scanner.next());

				long differmail = endDate.getTime() - startDate.getTime();
				long differ = TimeUnit.DAYS.convert(differmail, TimeUnit.MILLISECONDS);

				Exhibition exhibition = new Exhibition(arr[0], arr[1], arr[2], arr[3], Double.parseDouble(arr[4]),
						Integer.parseInt(arr[5]));
				double costPerday = exhibition.getCostPerDay();
				double cost = costPerday * differ;
				double gst = cost * 0.05;
				System.out.println("GST :" + gst);
				break;
			case 2:
				System.out.println("Enter the details of stage event:");
				String line = scanner.next();
				String arr1[] = line.split(",");

				System.out.println("Enter the starting date of the event:");
				Date startDate1 = (Date) new SimpleDateFormat("dd-MM-yyyy").parse(scanner.next());

				System.out.println("Enter the ending date of the event:");
				Date endDate1 = (Date) new SimpleDateFormat("dd-MM-yyyy").parse(scanner.next());

				long differMill1 = endDate1.getTime() - startDate1.getTime();
				long differ1 = TimeUnit.DAYS.convert(differMill1, TimeUnit.MILLISECONDS);
				StageEvent stageEvent = new StageEvent(arr1[0], arr1[1], arr1[2], arr1[3], Double.parseDouble(arr1[4]),
						Integer.parseInt(arr1[5]));
				double costPerDay2 = stageEvent.getCostPerDay();
				double cost1 = costPerDay2 * differ1;
				double gst1 = cost1 * 0.15;
				System.out.println("The GST to be paid is Rs." + gst1);

				break;
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		scanner.close();
	}

}
