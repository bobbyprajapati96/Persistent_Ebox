package Exception.second;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the transaction details");
	System.out.println("Enter the account number");
	String acc=sc.nextLine();
	System.out.println("Enter the available amount");
	double amt=sc.nextDouble();
	Transaction t=new Transaction(acc,amt);
	String choice;
	try {
		do {
		System.out.println("Enter the transaction amount");
		double transAmt=sc.nextDouble();
		t.validate(transAmt);
		t.setAmount(t.getAmount()-transAmt);
		System.out.println("Do you want to enter more?(yes/no)");
		choice=sc.nextLine();
		sc.nextLine();
		}while(!choice.equals("no"));
	}catch(Exception e) {
		System.out.println("Insufficient Balance");
	}
	finally {
		System.out.println("Your available balance "+t.getAmount());
	}
}
}
