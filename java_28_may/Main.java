package java_28_may;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
   public static void main(String[] args) throws NumberFormatException, IOException, ParseException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter no of vehicles");
	int c=Integer.parseInt(br.readLine());
	List<Vehicle> al=new ArrayList<>();
	SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy HH:MM:SS");
	while(c-->0) {
		System.out.println("Enter details(registrationNo,name,type,weight,ticketNo,parkingtime,cost)");
        String inp=br.readLine();
        String [] arr=inp.split(",");
        String ticketNo=arr[4];
        Date parkTime=(Date)sdf.parse(arr[5]);
        Double cost=Double.parseDouble(arr[6]);
        Ticket t=new Ticket(ticketNo,parkTime,cost);
        Vehicle v=new Vehicle(arr[0],arr[1],arr[2],Double.parseDouble(arr[3]),t);
        al.add(v);
	}
	
	System.out.println("Enter the choice\n1)Vehicle Type\n2)Parking Time");
	int n=Integer.parseInt(br.readLine());
	VehicleBO vb=new VehicleBO();
	if(n==1) {
		System.out.println("Enter vehicle type");
		String vt=br.readLine();
//		List<Vehicle> al2=new ArrayList<>();
		System.out.println("FourWheeler are:");
			System.out.println(vb.findVehicle(al,vt));
		
	}
	else if(n==2){
        System.out.println("Enter park time");
        String date=br.readLine();
        Date d=sdf.parse(date);
        VehicleBO bo=new VehicleBO();
        System.out.println(bo.findVehicle(al,d));
    }else{
        System.out.println("Invalid");
    }
	
}
}
