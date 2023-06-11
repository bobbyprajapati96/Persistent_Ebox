package Collection_MapQ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
  public static void main(String[] args)throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	Map<String,ArrayList<Address>> map=new HashMap<>();
	System.out.println("Enter the number of addess");
	int n=Integer.parseInt(br.readLine());
	for(int i=0;i<n;i++)
	{
		System.out.println("Enter the address "+(i+1)+" detail");
		String inp=br.readLine();
		String [] arr=inp.split(",");
		String city=arr[2];
		Address ad=new Address(arr[0],arr[1],arr[2],arr[3],Integer.parseInt(arr[4]));
		if(map.containsKey(city)) {
			ArrayList<Address> x=map.get(city);
			x.add(ad);
			map.replace(city, x);
		}
		else {
			ArrayList<Address> al=new ArrayList<>();
			al.add(ad);
			map.put(city, al);
		}
	}
	System.out.println("Enter the city to be searched");
	String search=br.readLine();
	if(map.containsKey(search)) {
		System.out.println("Line 1 Line 2 City State Pincode");
		ArrayList<Address> add=map.get(search);
		for(Address a:add) {
			String line1=a.getAddressLine1();
			String line2=a.getAddressLine2();
			String city=a.getCity();
			String state=a.getState();
		    int pincode=a.getPincode();
		    System.out.printf("%-15s %-15s %-15s %-15s %s\\n",line1,line2,city,state,pincode);
		}
 	}
	else {
		 System.out.println("Searched city not found");
	}
	
	
}
}
