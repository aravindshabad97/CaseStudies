package oops3.cs2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int usersCount = 0;
		User[] usersArray = null;
		User user = null;
		UserBO userBO = null;
		String userToBeDeleted = null;
		boolean isUserDeleted = false;

		try {
			userBO = new UserBO();

			System.out.println("Enter the number of users");
			usersCount = scanner.nextInt();

			usersArray = new User[usersCount];

			for (int i = 0; i < usersCount; i++) {
				user = new User();

				System.out.printf("Enter the details of User %d\n", i + 1);
				System.out.println("Enter the name of the user:");
				user.setName(scanner.nextLine());

				System.out.println("Enter the mobile number of the user:");
				user.setMobileNumber(scanner.nextLine());

				System.out.println("Enter the username of the user:");
				user.setUserName(scanner.nextLine());

				System.out.println("Enter the password of the user:");
				user.setPassword(scanner.nextLine());

				userBO.addUser(usersArray, user);
			}

			System.out.println("User details as entered:");
			userBO.displayAll(usersArray);

			userBO.sortUsers(usersArray);

			System.out.println("After sorting:");
			userBO.displayAll(usersArray);

			System.out.println("Enter the user to be deleted:");
			userToBeDeleted = scanner.nextLine();

			isUserDeleted = userBO.deleteUser(usersArray, userToBeDeleted);

			if (isUserDeleted) {
				System.out.println("User deleted successfully");
				System.out.println("After Deleting:");
				userBO.displayAll(usersArray);
			} else {
				System.out.println("No user found with given name");
			}

		} catch (InputMismatchException exception) {

			System.err.println("Input is not valid!!!");

		} catch (Exception ex) {

			System.out.println("Exception is occured");
		}
		scanner.close();
	}

}
