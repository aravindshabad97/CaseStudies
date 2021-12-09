package abstractClassesAndInterfaces.cs1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("List of Shapes : ");
		System.out.println("1.Circle");
		System.out.println("2.Rectangle");
		System.out.println("3.Square");

		System.out.println("Enter your choice : ");
		int choice = scanner.nextInt();

		switch (choice) {
		case 1:
			System.out.println("Enter the radius of the Circle : ");
			float radius = scanner.nextFloat();

			Circle circle = new Circle(radius);

			Double calculatePerimeterOfCircle = circle.calculatePerimeter();

			System.out.println("The perimeter is : ");
			System.out.printf("%.2f", calculatePerimeterOfCircle);

			break;

		case 2:
			System.out.println("Enter the length of the Rectangle : ");
			float length = scanner.nextFloat();

			System.out.println("Enter the breadth of the Rectangle : ");
			float breadth = scanner.nextFloat();

			Rectangle rectangle = new Rectangle(length, breadth);
			Double calculatePerimeterOfRectange = rectangle.calculatePerimeter();

			System.out.println("The perimeter is : ");
			System.out.printf("%.2f", calculatePerimeterOfRectange);

			break;

		case 3:
			System.out.println("Enter the side of the Square : ");
			float side = scanner.nextFloat();

			Square square = new Square(side);

			Double calculatePerimeterOfSquare = square.calculatePerimeter();
			System.out.println("The perimeter is : ");
			System.out.printf("%.2f", calculatePerimeterOfSquare);
			break;

		default:
			System.out.println("** Please choose from given choices **");
			break;
		}

		scanner.close();
	}

}
