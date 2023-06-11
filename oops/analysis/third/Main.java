package oops.analysis.third;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1)Privilege Customer\r\n" + "2)SeniorCitizen Customer\r\n" + "Enter Customer Type");
		int choice=sc.nextInt();
		if(choice==1) {
			System.out.println("Enter the name");
			String name=sc.nextLine();
			sc.nextLine();
			System.out.println("Enter the Age");
			int age=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the Address");
			String add=sc.nextLine();
			System.out.println("Enter The Mobile Number");
			String mob=sc.nextLine();
	       System.out.println("Enter The Purchased Amount");
	       double amt=sc.nextDouble();
	       PrivilegeCustomer pc=new PrivilegeCustomer(name, add, age, mob);
	       double ans=pc.getBillAmount(amt);
	       pc.displayCustomer();
	       System.out.println("Your bill amount is Rs "+amt+". Your bill amount is discount under privilege customer\r\n"
	       		+ "You have to pay Rs"+ans);
	       }
		else if(choice==2) {
			System.out.println("Enter the name");
			String name=sc.nextLine();
			sc.nextLine();
			System.out.println("Enter the Age");
			int age=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the Address");
			String add=sc.nextLine();
			System.out.println("Enter The Mobile Number");
			String mob=sc.nextLine();
	       System.out.println("Enter The Purchased Amount");
	       double amt=sc.nextDouble();
	       SeniorCitizenCustomer pc=new SeniorCitizenCustomer(name, add, age, mob);
	       double ans=pc.getBillAmount(amt);
	       pc.displayCustomer();
	       System.out.println("Your bill amount is Rs "+amt+". Your bill amount is discount under privilege customer\r\n"
	       		+ "You have to pay Rs"+ans);
	       }
		else {
			System.out.println("Invalid Customer");
		}
	}
}
