package java_28_may;
import java.util.*;
public class Ticket {
     @Override
	public String toString() {
		return "";
	}
	public String getTicketNo() {
		return ticketNo;
	}
	public void setTicketNo(String ticketNo) {
		this.ticketNo = ticketNo;
	}
	public Date getParkingTime() {
		return parkingTime;
	}
	public void setParkingTime(Date parkingTime) {
		this.parkingTime = parkingTime;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public Ticket(String ticketNo, Date parkingTime, double cost) {
		super();
		this.ticketNo = ticketNo;
		this.parkingTime = parkingTime;
		this.cost = cost;
	}
	String ticketNo;
     Date parkingTime;
     double cost;
     
}
