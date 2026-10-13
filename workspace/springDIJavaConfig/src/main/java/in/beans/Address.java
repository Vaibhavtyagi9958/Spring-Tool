package in.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Address {
	private String city;
	private int pincode;
	
	public Address(String city, int pincode) {
		this.city = city;
		this.pincode = pincode;
	}
	
	public String toString() {
		return city + " - " + pincode;
	}
}
