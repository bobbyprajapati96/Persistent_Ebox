package oops.analysis.Design.third;

import java.util.Scanner;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your account Number:");
		String accountNum = sc.nextLine();
		System.out.println("Enter the balance of the account:");
		double bal = sc.nextDouble();

		System.out.println("Enter the type of transfer to be made:\r\n" + "1.NEFT\r\n" + "2.IMPS\r\n" + "3.RTGS");
		int choice = sc.nextInt();
		if (choice == 1) {
			System.out.println("Enter the amount to be transferred:");
			double transfer = sc.nextDouble();
			NEFTTransfer nt = new NEFTTransfer(accountNum, bal);

			if (!nt.validate(transfer)) {
				System.out.println("Account number or transfer amount seems to be wrong");
			} else {
				if (nt.transfer(transfer)) {
					System.out.println("Transfer occurred successfully");
					System.out.println("Remaining balance is " + nt.getBalance());
				} else {
					System.out.println("Transfer could not be made");
				}
			}
		} else if (choice == 2) {
			System.out.println("Enter the amount to be transferred:");
			double transfer = sc.nextDouble();
			IMPSTransfer nt = new IMPSTransfer(accountNum, bal);
			if (!nt.validate(transfer)) {
				System.out.println("Account number or transfer amount seems to be wrong");
			} else {
				if (nt.transfer(transfer)) {
					System.out.println("Transfer occurred successfully");
					System.out.println("Remaining balance is " + nt.getBalance());
				} else {
					System.out.println("Transfer could not be made");
				}
			}
		} else if (choice == 3) {
			System.out.println("Enter the amount to be transferred:");
			double transfer = sc.nextDouble();
			RTGSTransfer nt = new RTGSTransfer(accountNum, bal);
			if (!nt.validate(transfer)) {
				System.out.println("Account number or transfer amount seems to be wrong");
			} else {
				if (nt.transfer(transfer)) {
					System.out.println("Transfer occurred successfully");
					System.out.println("Remaining balance is " + nt.getBalance());
				} else {
					System.out.println("Transfer could not be made");
				}
			}

		} else {
			System.out.println("Invalid! Type");
		}
	}
}
