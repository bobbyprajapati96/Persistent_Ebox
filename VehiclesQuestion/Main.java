package VehiclesQuestion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException, ParseException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter no of vehicles");
		int n=Integer.parseInt(br.readLine());
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy HH:MM:SS");
		ArrayList<Vehicle> al=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			String inp=br.readLine();
			String [] arr=inp.split(",");
			Date d=(Date)sdf.parse(arr[5]);
			Ticket t=new Ticket(arr[4],d,Double.parseDouble(arr[6]));
			Vehicle v=new Vehicle(arr[0],arr[1],arr[2],Double.parseDouble(arr[3]),t);
			al.add(v);
		}
		System.out.println("Enter the choice\n1)Vehicle\n2)Parking Time");
		int choice=Integer.parseInt(br.readLine());
		switch(choice) {
		case 1:
			VehicleBO vb=new VehicleBO();
			System.out.println("Enter vehicle Type");
			String type=br.readLine();
			List<Vehicle> list=vb.findVehicle(al, type);
			System.out.println(type+" are :");
			for(Vehicle name:list) {
				System.out.println(name.getName());
			}
			break;
		case 2:
			VehicleBO vb2=new VehicleBO();
			System.out.println("Enter parking time");
			String time=br.readLine();
			Date d1=(Date)sdf.parse(time);
			List<Vehicle> list2=vb2.findVehicle(al, d1);
			System.out.println("Vehicles are :");
			for(Vehicle name:list2) {
				System.out.println(name.getName());
			}
			break;
			default: System.out.println("Invalid Option!!");
		}
			
		
	}
}
