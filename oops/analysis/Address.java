package oops.analysis;

public class Address {
  public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
public Address(String street, String city, int pincode, String country) {
		super();
		this.street = street;
		this.city = city;
		this.pincode = pincode;
		this.country = country;
	}

public void displayAddress() {
//	System.out.println("Street: "+getStreet());
//	System.out.println("City: "+getCity());
//	System.out.println("Pincode: "+getPincode());
//    System.out.println("Country: "+getCountry());
	  System.out.printf("Street: %s\nCity: %s\nPincode: %d\nCountry: %s",street,city,pincode,country);
}
public String street;
  public String city;
  public int pincode;
  public String country;
  
}
