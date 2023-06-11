package stringBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of items:");
		int n = sc.nextInt();
		ArrayList<Item> al = new ArrayList<Item>();
		System.out.println("Enter the item details in the format(Item Name$Item Type$Item Cost$Item Availability)");
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i <= n; i++) {
			String in=sc.nextLine();
			sb.append(in);
//			Item it = new Item(arr[1], arr[2], x, y);
		}
	String[] arr = sb.toString().split("$");
	 System.out.println(arr.length);
		int x = Integer.parseInt(arr[3]);
		int y = Integer.parseInt(arr[4]);
		Item it = new Item(arr[1], arr[2], x, y);
		System.out.println(
				"Items:\n" + it.getName() + "," + it.getType() + "," + it.getCost() + "," + it.getAvailableQuantity());
	}
}
