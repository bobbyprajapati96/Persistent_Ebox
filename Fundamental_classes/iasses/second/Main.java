package Fundamental_classes.iasses.second;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Main {
  public static void main(String[] args) throws NumberFormatException, IOException, ParseException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the number of events");
	ArrayList<String> al=new ArrayList<>();
	int n=Integer.parseInt(br.readLine());
	SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	System.out.println("Enter event details in CSV(Event Name,Start Date,End Date) Date:dd/MM/yyyy");
	for(int i=0;i<n;i++)
	{
		String inp=br.readLine();
		String [] arr=inp.split(",");
		Date sd=(Date)sdf.parse(arr[1]);
		Date ed=(Date)sdf.parse(arr[2]);
		Event ev=new Event(arr[0],sd,ed);
		if(ev.getDay()<1) {
			al.add(arr[0]);
		}
		
	}
	boolean c=false;
	for(String a:al) {
		if(al.size()>=1) {
			System.out.println(a);
			c=true;
		}
	}
	if(!c) {
		System.out.println("no events");
	}
//	if(al.size()>=1)
//	System.out.println(al.toString());
//	else
//		System.out.println("no events");
}
}
