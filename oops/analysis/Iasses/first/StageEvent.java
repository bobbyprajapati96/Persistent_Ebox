package oops.analysis.Iasses.first;

public class StageEvent extends Event {
public StageEvent(String name, String detail, String type, String ownerName, double costPerDay,int noOfSeats) {
		super(name, detail, type, ownerName, costPerDay);
		this.noOfSeats=noOfSeats;
		// TODO Auto-generated constructor stub
	}

public int noOfSeats;
}
