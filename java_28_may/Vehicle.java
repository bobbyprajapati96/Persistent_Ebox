package java_28_may;

public class Vehicle {
   @Override
	public String toString() {
		return  name;
	}
public String getRegistrationNo() {
		return registrationNo;
	}
	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public Ticket getTicket() {
		return ticket;
	}
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
public Vehicle(String registrationNo, String name, String type, double weight, Ticket ticket) {
		super();
		this.registrationNo = registrationNo;
		this.name = name;
		this.type = type;
		this.weight = weight;
		this.ticket = ticket;
	}
String registrationNo;
   String name;
   String type;
   double weight;
   Ticket ticket;
}
