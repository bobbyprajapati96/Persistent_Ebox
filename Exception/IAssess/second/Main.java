package Exception.IAssess.second;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the user Details");
	String inp=sc.nextLine();
	String[] arr=inp.split(",");
	User u=new User(arr[0],arr[1],arr[2],arr[3]);
	UserBO ub=new UserBO();
	try {
	UserBO.validate(u);
	System.out.println(u.toString());
	
	}catch(WeakPasswordException e) {
		System.out.println(e);
	}
	
}
}
