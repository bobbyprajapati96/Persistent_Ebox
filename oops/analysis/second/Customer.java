package oops.analysis.second;

public class Customer {
  public Customer(String customerName, String email, String customerType, String customerAddress) {
		super();
		this.customerName = customerName;
		Email = email;
		this.customerType = customerType;
		this.customerAddress = customerAddress;
	}
  
  public void displayDetails() {
	  System.out.printf("Name: %s\nE-mail: %s\nType: %s\nLocation: %s",customerName,Email,customerType,customerAddress);
  }
public String customerName;
  public String Email;
  public String customerType;
  public String customerAddress;
  
}
