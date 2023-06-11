package iAsses_Super;

import java.text.ParseException;
import java.util.Scanner;

public class Main {
 public static void main(String[] args) throws ParseException{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your choice:\r\n"
			+ "1.Exhibition event\r\n"
			+ "2.Stage event");
	int choice=sc.nextInt();
	sc.nextLine();
	if(choice==1) {
	System.out.println("Enter the details of exhibition:");
	String details=sc.nextLine();
	String[] part=details.split(",");
	 String n=part[0];
     String d=part[1];
     String t=part[2];
     String o=part[3];
     Double co=Double.parseDouble(part[4]);
     Integer no=Integer.parseInt(part[5]);
	Exhibition ex=new Exhibition(n,d,t,o,co,no);
	System.out.println("Enter the starting date of the event:");
	String startDate=sc.nextLine();
	System.out.println("Enter the ending date of the event:");
	String endDate=sc.nextLine();
	long noOfDates=ex.NoOfDays(startDate,endDate);
	double gst=0.05;
	ex.displayGst(noOfDates,gst);
	}
	else if(choice==2) {
		System.out.println("Enter the details of stage event:");
		String details=sc.nextLine();
		String[] part2=details.split(",");
		String n=part2[0];
		String d=part2[1];
		String t=part2[2];
		String own=part2[3];
		double cst=Double.parseDouble(part2[4]);
		int s=Integer.parseInt(part2[5]);
		StageEvent se=new StageEvent(n,d,t,own,cst,s);
		System.out.println("Enter the starting date of the event:");
		String startDate=sc.nextLine();
		System.out.println("Enter the ending date of the event:");
		String endDate=sc.nextLine();
		long noOfDays=se.NoOfDays(startDate, endDate);
		double gst=0.15;
		se.displayGst(noOfDays, gst);
	}
}
}
