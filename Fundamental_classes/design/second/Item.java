package Fundamental_classes.design.second;

public class Item {
  @Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(name);
		builder.append(",");
		builder.append(type);
		builder.append(",");
		builder.append(cost);
		builder.append(",");
		
		if(availableQuantity>0) {
			builder.append("Available");
		}
		else {
			builder.append("Not Available");
		}
		return builder.toString();
	}
public Item(String name, String type, int cost, int availableQuantity) {
		super();
		this.name = name;
		this.type = type;
		this.cost = cost;
		this.availableQuantity = availableQuantity;
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
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getAvailableQuantity() {
		return availableQuantity;
	}
	public void setAvailableQuantity(int availableQuantity) {
		this.availableQuantity = availableQuantity;
	}
private String name;
  private String type;
  private int cost;
  private int availableQuantity;
}
