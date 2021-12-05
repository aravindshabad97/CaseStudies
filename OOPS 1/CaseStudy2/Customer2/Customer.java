package Customer2;


public class Customer {

	public String customerName, customerEmail, customerType, customerAddress;

	public Customer() {

	}

	public Customer(String customerName, String customerEmail, String customerType, String customerAddress) {

		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.customerType = customerType;
		this.customerAddress = customerAddress;
	}

	public void display() {
		System.out.println("Name: " + customerName);
		System.out.println("Email: " + customerEmail);
		System.out.println("Type: " + customerType);
		System.out.println("Location: " + customerAddress);
	}

}
