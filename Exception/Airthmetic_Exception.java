package Exception;

import java.io.IOException;
import java.util.Scanner;

public class Airthmetic_Exception {
    public static void main(String[] args) throws IOException{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the cost of the item for n days");
		int inp=sc.nextInt();
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		try {
			int cpd=inp/n;
			System.out.println("Cost per day of the item is"+cpd);
		
		}catch(ArithmeticException ex) {
			System.out.println(ex);
		}
	}
}
