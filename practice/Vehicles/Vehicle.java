package practice.Vehicles;

public class Vehicle {
 
	@Override
	public String toString() {
		return "Vehicle ( name=" + name + ", type=" + type + ", time=" + time + ")";
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
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public Vehicle(String name, String type, String time) {
		super();
		this.name = name;
		this.type = type;
		this.time = time;
	}
	String name;
	String type;
	String time;
	
}
