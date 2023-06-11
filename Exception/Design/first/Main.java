package Exception.Design.first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
public static void main(String[] args) throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the Item type details:");
	System.out.println("Enter the name:");
	String name=br.readLine();
	System.out.println("Enter the deposit:");
	try {
	double depo=Double.parseDouble(br.readLine());
	System.out.println("Enter cost per day:");
	double cost=Double.parseDouble(br.readLine());
	ItemType it=new ItemType(name,depo,cost);
	 System.out.println("The details of the item type are:");
		System.out.println(it.toString());
	}catch(NumberFormatException e) {
		System.out.println(e);
	}
}
}
