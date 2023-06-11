package AbstractClass_Fund;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your account number:");
		String accNo = sc.next();
		System.out.println("Enter the balance of the account:");
		double balance = sc.nextDouble();
		System.out.println("Enter the type of transfer to be made:\n1.NEFT\n2.IMPS\n3.RTGS");
		int choice = sc.nextInt();
		System.out.println("Enter the amount to be transferred:");
		double transferAmt=sc.nextDouble();
		sc.close();
		if (choice == 1) {
			NEFTTransfer neft = new NEFTTransfer();
			neft.setAccountNumber(accNo);
			neft.setBalance(balance);
			if(neft.validate(transferAmt)==false) {
				System.out.println("Account number or transfer amount seems to be wrong");
			}
			else {
			if(neft.transfer(transferAmt)) {
				System.out.println("Transfer occurred successfully");
				System.out.println("Remaining balance is "+neft.getBalance());
			}else {
				System.out.println("Transfer could not be made");
			}
		}
		} else if (choice == 2) {

			IMPSTransfer neft = new IMPSTransfer();
			neft.setAccountNumber(accNo);
			neft.setBalance(balance);
			if(neft.validate(transferAmt)==false) {
				System.out.println("Account number or transfer amount seems to be wrong");
			}
			else {
			if(neft.transfer(transferAmt)) {
				System.out.println("Transfer occurred successfully");
				System.out.println("Remaining balance is "+neft.getBalance());
			}else {
				System.out.println("Transfer could not be made");
			}
		}
		} else if (choice == 3) {
	    	RTGSTransfer neft = new RTGSTransfer();
			neft.setAccountNumber(accNo);
			neft.setBalance(balance);
			if(neft.validate(transferAmt)==false) {
				System.out.println("Account number or transfer amount seems to be wrong");
			}
			else {
			if(neft.transfer(transferAmt)) {
				System.out.println("Transfer occurred successfully");
				System.out.println("Remaining balance is "+neft.getBalance());
			}else {
				System.out.println("Transfer could not be made");
			}
		}
		}
	}
}
