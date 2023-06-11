package iAsses_Interface_Stall;

public class ExecutiveStall implements Stall {
	public ExecutiveStall(String stallName, int cost, String ownerName, int screens) {
		super();
		this.stallName = stallName;
		this.cost = cost;
		this.ownerName = ownerName;
		this.screens = screens;
	}
	public ExecutiveStall() {
		super();
		// TODO Auto-generated constructor stub
	}
	String stallName;
	  int cost;
	  String ownerName;
	  int screens;
	@Override
	public void display() {
		System.out.println("Stall Name:"+stallName);
	    System.out.println("Cost:"+cost+".Rs");
	    System.out.println("Owner Name:"+ownerName);
	    System.out.println("Number of Screens:"+screens);
	}
}
