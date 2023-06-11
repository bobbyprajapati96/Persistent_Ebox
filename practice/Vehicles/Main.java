package practice.Vehicles;
import java.io.*;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
public class Main {
public static void main(String[] args)throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	ArrayList<Vehicle> al=new ArrayList<>();
	String ans=null;
	do {
	System.out.println("Enter the Vehicle name , type , parking time[hh:mm]");
	String inp=br.readLine();
	String [] arr=inp.split(",");
	Vehicle v1=new Vehicle(arr[0], arr[1], arr[2]);
	al.add(v1);
	System.out.println("Do you want to add more? yes/no");
	ans=br.readLine();
	}while(ans.equals("yes"));
	
	System.out.println("Search vehicle by type - Enter vehicle type");
	String vt=br.readLine();
	for(int i=0;i<al.size();i++)
	{
		Vehicle v=al.get(i);
		if(v.getType().equals(vt)) {
			System.out.println(v.toString());
		}
	}
	
//	LocalDateTime dt=LocalDateTime.now();
//	DateTimeFormatter df=DateTimeFormatter.ofPattern("h:m");
//	System.out.println(df.format(dt));
	
//	SimpleDateFormat sdf=new SimpleDateFormat("H:m");
	System.out.println("Search Vehicle by parking time [hh:mm]");
	String inp2=br.readLine();
	for(int i=0;i<al.size();i++) {
		Vehicle v=al.get(i);
		if(v.getTime().equals(inp2)) {
			System.out.println(v.toString());
		}
	}
}
}
