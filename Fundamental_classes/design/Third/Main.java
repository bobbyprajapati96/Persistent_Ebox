package Fundamental_classes.design.Third;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
public static void main(String[] args) throws ParseException {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the date to be formatted:(MM-dd-yyyy)");
	String str=sc.nextLine();
	SimpleDateFormat sdf=new SimpleDateFormat("MM-dd-yyyy");
	Date date=sdf.parse(str);
	SimpleDateFormat sdf1=new SimpleDateFormat("EEE, MMM d, yy");
	String s1=sdf1.format(date);
	SimpleDateFormat sdf2=new SimpleDateFormat("dd.MM.yyyy");
	String s2=sdf2.format(date);
	SimpleDateFormat sdf3=new SimpleDateFormat("dd dd/MM/yyyy");
	String s3=sdf3.format(date);
	
	System.out.println("Date Format with EEE, MMM d, yy :"+s1);
	System.out.println("Date Format with dd.MM.yyyy :"+s2);
	System.out.println("Date Format with dd dd/MM/yyyy :"+s3);
}
}
