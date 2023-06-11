package iasses_Collection_second;

public class User {
//   @Override
//	public String toString() {
//		return "User [name=" + name + ", contactNumber=" + contactNumber + ", userName=" + userName + ", email=" + email
//				+ "]";
//	}

String name;
   String contactNumber;
   String userName;
   String email;
public User(String name, String contactNumber, String userName, String email) {
	super();
	this.name = name;
	this.contactNumber = contactNumber;
	this.userName = userName;
	this.email = email;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getContactNumber() {
	return contactNumber;
}
public void setContactNumber(String contactNumber) {
	this.contactNumber = contactNumber;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}
   
public void display() {
	System.out.printf("%-20s%-20s%-20s%-20s%n", name, contactNumber, userName, email);
}
}
