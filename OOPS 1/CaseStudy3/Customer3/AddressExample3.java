package Customer3;

import java.util.Objects;

public class AddressExample3 {
	@Override
	public String toString() {
		return "AddressExample3 [city=" + city + ", street=" + street + ", pincode=" + pincode + "]";
	}

	private String city;
	private String street;
	private int pincode;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public AddressExample3() {
	}

	public AddressExample3(String city, String street, int pincode) {
		super();
		this.city = city;
		this.street = street;
		this.pincode = pincode;
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
		AddressExample3 other = (AddressExample3) obj;
		return Objects.equals(city, other.city) && Objects.equals(pincode, other.pincode)
				&& Objects.equals(street, other.street);
	}

}
