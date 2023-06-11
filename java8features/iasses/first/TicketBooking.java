package java8features.iasses.first;

public class TicketBooking {
   @Override
	public String toString() {
	   return String.format("%-10s %-15s %-15s", customerName, noOfTickets, price);
	}
public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getNoOfTickets() {
		return noOfTickets;
	}
	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
public TicketBooking() {
		super();
		// TODO Auto-generated constructor stub
	}
public TicketBooking(String customerName, int noOfTickets, double price) {
		super();
		this.customerName = customerName;
		this.noOfTickets = noOfTickets;
		this.price = price;
	}
private String customerName;
   private int noOfTickets;
   private double price;
}
