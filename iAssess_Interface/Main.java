package iAssess_Interface;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Choose Stall Type\r\n" + "1)Gold Stall\r\n" + "2)Premium Stall\r\n" + "3)Executive Stall\r\n" + "");
		int choice = sc.nextInt();
		sc.nextLine();
		String[] arr=new String[4];
		switch (choice) {
		case 1:
			System.out.println(
					"Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of TV sets)");
			String input = sc.nextLine();
			 arr = input.split(",");
			String name = arr[0];
			int cost = Integer.parseInt(arr[1]);
			String oname = arr[2];
			int tv = Integer.parseInt(arr[3]);
			GoldStall gd = new GoldStall(name, cost, oname, tv);
			gd.display();
			break;
		case 2:
			System.out.println(
					"Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of Projectors)");
			String input2 = sc.nextLine();
			 arr = input2.split(",");
			String name2 = arr[0];
			int cost2 = Integer.parseInt(arr[1]);
			String oname2 = arr[2];
			int pro = Integer.parseInt(arr[3]);
			PremiumStall gd2 = new PremiumStall(name2, cost2, oname2, pro);
			gd2.display();
			break;
		case 3:
			System.out.println(
					"Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of Screens)");
			String input3 = sc.nextLine();
			 arr = input3.split(",");
			String name3 = arr[0];
			int cost3 = Integer.parseInt(arr[1]);
			String oname3 = arr[2];
			int scr = Integer.parseInt(arr[3]);
			ExecutiveStall gd3 = new ExecutiveStall(name3, cost3, oname3, scr);
			break;
		default:
			System.out.println("Invalid Stall Type");

		}
	
	}
}
