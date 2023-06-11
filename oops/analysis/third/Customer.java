package oops.analysis.third;

public class Customer {
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Customer(String name, String address, int age, String mobileNumber) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
		this.mobileNumber = mobileNumber;
	}

	public void displayCustomer() {
		System.out.println(
				"Bill Details\nName " + name + "\nMobile " + mobileNumber + "\nAge " + age + "\nAddress " + address);
	}

	private String name;
	private String address;
	private int age;
	private String mobileNumber;

}
