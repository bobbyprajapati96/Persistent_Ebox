package java_28_may;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VehicleBO {
public List<Vehicle> findVehicle(List<Vehicle> vehicleList,String type){
	ArrayList<Vehicle> al=new ArrayList<>();
	for(Vehicle v:vehicleList) {
		if(v.getType().equals(type)) {
			al.add(v);
		}
	}
	return al;
}

public List<Vehicle> findVehicle(List<Vehicle> vehicleList,Date parkTime){
	ArrayList<Vehicle> al=new ArrayList<>();
	for(Vehicle v:vehicleList) {
		if(v.getTicket().getParkingTime().equals(parkTime)) {
			al.add(v);
		}
	}
	return al;
}
}
