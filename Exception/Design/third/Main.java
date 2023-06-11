package Exception.Design.third;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the contact details");
	String inp=sc.nextLine();
	String[] arr=inp.split(",");
	ContactDetail cd=new ContactDetail(arr[0], arr[1], arr[2], arr[3],arr[4]);
	ContactDetailBO cb=new ContactDetailBO();
	try {
	ContactDetailBO.validate(cd.getMobile(), cd.getAlternateMobile());
	System.out.println(cd.toString());
	}catch(DuplicateMobileNumberException e) {
		System.out.println(e);
	}
}
}
