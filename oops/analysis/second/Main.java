package oops.analysis.second;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
public static void main(String[] args) throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the Customer Details\nEnter the name");
	String name=br.readLine();
	System.out.println("Enter the email");
	String email=br.readLine();
	System.out.println("Enter the type");
	String type=br.readLine();
	System.out.println("Enter the location");
	String loc=br.readLine();
	
Customer c=new Customer(name,email,type,loc);
c.displayDetails();
	
}
}
