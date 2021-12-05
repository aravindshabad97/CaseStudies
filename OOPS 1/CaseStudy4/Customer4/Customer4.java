package Customer4;

public class Customer4 {

	private String name;
	private Customer4Add address;

	public Customer4() {
	}

	public Customer4(String name, Customer4Add address) {
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Customer4Add getAddress() {
		return address;
	}

	public void setAddress(Customer4Add address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return name + " " + address.toString();
	}

}
