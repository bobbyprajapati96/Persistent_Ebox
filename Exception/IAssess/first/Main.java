package Exception.IAssess.first;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the stage event start date and end date");
	SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy-HH:mm:ss");
	try {
	String startdate=sc.nextLine();
	Date sd=(Date)sdf.parse(startdate);
	String endDate=sc.nextLine();
	Date ed=(Date)sdf.parse(endDate);
	System.out.println("Start date:"+sdf.format(sd)+"\nEnd date:"+sdf.format(ed));
	}catch(ParseException e) {
          System.out.println("Input dates should be in the format 'dd-MM-yyyy-HH:mm:ss'");
	}
}
 
}
