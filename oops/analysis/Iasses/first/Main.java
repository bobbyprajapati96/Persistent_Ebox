package oops.analysis.Iasses.first;

import java.text.ParseException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws ParseException {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your choice:\r\n"
			+ "1.Exhibition event\r\n"
			+ "2.Stage event");
	int choice=sc.nextInt();
	sc.nextLine();
	if(choice==1) {
		System.out.println("Enter the details of exhibition:");
		String inp=sc.nextLine();
		String arr[]=inp.split(",");
		Exhibition ex=new Exhibition(arr[0],arr[1],arr[2],arr[3],Double.parseDouble(arr[4]),Integer.parseInt(arr[5]));
		System.out.println("Enter the starting date of the event:");
		String startDate=sc.nextLine();
		System.out.println("Enter the end date of the event:");
		String endDate=sc.nextLine();
		long noOfDays=ex.getNoOfDays(startDate,endDate);
		double gst=noOfDays*(ex.getCostPerDay()*0.05);
		System.out.println("The GST to be paid is Rs."+gst);
	}
	else if(choice==2) {
		System.out.println("Enter the details of exhibition:");
		String inp=sc.nextLine();
		String arr[]=inp.split(",");
		StageEvent ex=new StageEvent(arr[0],arr[1],arr[2],arr[3],Double.parseDouble(arr[4]),Integer.parseInt(arr[5]));
		System.out.println("Enter the starting date of the event:");
		String startDate=sc.nextLine();
		System.out.println("Enter the end date of the event:");
		String endDate=sc.nextLine();
		long noOfDays=ex.getNoOfDays(startDate,endDate);
		double gst=noOfDays*(ex.getCostPerDay()*0.15);
		System.out.println("The GST to be paid is Rs."+gst);
	}
	
}
}
