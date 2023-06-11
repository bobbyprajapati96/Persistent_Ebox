package oops.analysis.Design.second;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose Account Type\r\n" + "1.Savings Account\r\n" + "2.Current Account");
		int choice = sc.nextInt();
		if (choice == 1) {
			System.out.println(
					"Enter Account details in comma separated(Account Name,Account Number,Bank Name,Organisation Name)");
				sc.nextLine();
			String input = sc.nextLine();
			String[] arr = input.split(",");
		   System.out.println(arr.length);
		SavingAccount sac = new SavingAccount(arr[0], arr[1], arr[2], arr[3]);
			sac.display();
		} else if (choice == 2) {

			System.out.println(
					"Enter Account details in comma separated(Account Name,Account Number,Bank Name,TIN Number)");
			sc.nextLine();
			String input = sc.nextLine();
			String[] arr = input.split(",");
			CurrentAccount sac = new CurrentAccount(arr[0], arr[1], arr[2], arr[3]);
			sac.display();

		}
      
	}
}
