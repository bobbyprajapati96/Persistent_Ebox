package Fundamental_classes.design.second;

import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
	System.out.println("Enter the number of items:");
	Scanner sc=new Scanner(System.in);
	int n=Integer.parseInt(sc.next());
	System.out.println("Enter the item details in the format(Item Name$Item Type$Item Cost$Item Availability)");
	Item[] it=new Item[n];
	sc.nextLine();
	for(int i=0;i<n;i++)
	{
		String s=sc.nextLine();
		String []arr=s.split("\\$");
		it[i]=new Item(arr[0],arr[1],Integer.parseInt(arr[2]),Integer.parseInt(arr[3]));
	}
	System.out.println("Items:");
	for(Item x:it) {
		System.out.println(x.toString());
	}
}
}
