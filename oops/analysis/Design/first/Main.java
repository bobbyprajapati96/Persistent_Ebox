package oops.analysis.Design.first;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	     System.out.println("Enter the name of staff:");
	     String name=sc.nextLine();
	     System.out.println("Enter the staff designation:");
	     String designation=sc.nextLine();
	     System.out.println("Enter the department name:");
	     String dept=sc.nextLine();
	     Department dp=new Department(name,designation,dept);
	     dp.displayStaff();
}      
}
