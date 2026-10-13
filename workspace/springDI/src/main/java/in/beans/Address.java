package in.beans;

public class Address {
	private String city;
	private int pincode;
	public void setCity(String city) {
		System.out.println("city get called");
		this.city = city;
	}
	public void setPincode(int pincode) {
		System.out.println("pincode get called");
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return city + " - " + pincode;
	}
}
