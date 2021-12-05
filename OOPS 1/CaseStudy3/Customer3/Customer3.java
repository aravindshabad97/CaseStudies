package Customer3;

import java.util.Objects;

public class Customer3 {

	@Override
	public String toString() {
		return "Customer3 [name=" + name + ", address=" + address + "]";
	}

	private String name;
	private AddressExample3 address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AddressExample3 getAddress() {
		return address;
	}

	public void setAddress(AddressExample3 address) {
		this.address = address;
	}

	public Customer3() {
	}

	public Customer3(String name, AddressExample3 address) {
		super();
		this.name = name;
		this.address = address;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Customer3 other = (Customer3) obj;
		return Objects.equals(name, other.name) && Objects.equals(address, other.address);
	}

}
