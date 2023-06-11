package VehiclesQuestion;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VehicleBO {
   public List<Vehicle> findVehicle(List<Vehicle> vehicleList,String type){
	   List<Vehicle> al=new ArrayList<>();
	   for(Vehicle v:vehicleList) {
		   if(v.getType().equals(type)) {
			   al.add(v);
		   }
	   }
	   return al;
   }
public List<Vehicle> findVehicle(List<Vehicle> vehicleList,Date parkTIme){
	List<Vehicle> al=new ArrayList<>();
	for(Vehicle v:vehicleList) {
		if(v.getTicket().getParkingTime().equals(parkTIme)) {
			al.add(v);
		}
	}
	   return al;
   }
}
