package iAsses_Interface_Stall;

public class PremiumStall implements Stall {
	public PremiumStall(String stallName, int cost, String ownerName, int projector) {
		super();
		this.stallName = stallName;
		this.cost = cost;
		this.ownerName = ownerName;
		this.projector = projector;
	}
	public PremiumStall() {
		super();
		// TODO Auto-generated constructor stub
	}
	String stallName;
	  int cost;
	  String ownerName;
	  int projector;
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Stall Name:"+stallName);
	    System.out.println("Cost:"+cost+".Rs");
	    System.out.println("Owner Name:"+ownerName);
	    System.out.println("Number of Projectors:"+projector);
	}

}
