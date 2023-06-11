package oops.analysis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Main {
    public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Customer Address");
		System.out.println("Enter the street");
		String street=br.readLine();
		System.out.println("Enter the city");
		String city=br.readLine();
		System.out.println("Enter the Pincode");
		int pin=Integer.parseInt(br.readLine());
		System.out.println("Enter the Country");
		String country=br.readLine();
		Address add=new Address(street,city,pin,country);
		add.displayAddress();
	}
}
