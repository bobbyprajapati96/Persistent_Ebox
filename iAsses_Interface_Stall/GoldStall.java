package iAsses_Interface_Stall;

public class GoldStall implements Stall{
  String stallName;
  int cost;
  String ownerName;
  int tvSet;
public GoldStall(String stallName, int cost, String ownerName, int tvSet) {
	super();
	this.stallName = stallName;
	this.cost = cost;
	this.ownerName = ownerName;
	this.tvSet = tvSet;
}
public GoldStall() {
	// TODO Auto-generated constructor stub
}
@Override
public void display() {
    System.out.println("Stall Name:"+stallName);
    System.out.println("Cost:"+cost+".Rs");
    System.out.println("Owner Name:"+ownerName);
    System.out.println("Number of TV sets:"+tvSet);
	
}
  
}
