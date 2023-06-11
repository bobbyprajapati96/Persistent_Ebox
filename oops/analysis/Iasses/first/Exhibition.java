package oops.analysis.Iasses.first;

public class Exhibition extends Event {
   public int getNoOfStall() {
		return noOfStall;
	}

	public void setNoOfStall(int noOfStall) {
		this.noOfStall = noOfStall;
	}

public int noOfStall;

public Exhibition(String name, String detail, String type, String ownerName, double costPerDay, int noOfStall) {
	super(name, detail, type, ownerName, costPerDay);
	// TODO Auto-generated constructor stub
	this.noOfStall=noOfStall;
}

}
