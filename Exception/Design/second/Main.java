package Exception.Design.second;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int [] arr=new int[100];
	System.out.println("Enter the number of seats to be booked:");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++) {
		System.out.println("Enter the seat number "+i);
		try {
			int inp=sc.nextInt();
			arr[inp-1]=inp;
		}
		catch(ArrayIndexOutOfBoundsException e) {
		System.out.println(e);
		System.exit(0);
	}
}
	System.out.println("Enter seats booked are:");
	for(int x:arr) {
		if(x!=0) {
			System.out.println(x);
		}
	}
}
}
