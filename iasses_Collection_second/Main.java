package iasses_Collection_second;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of User details to be added");
		int n=Integer.parseInt(br.readLine());
		UserBO b=new UserBO();
		b.addAll(UserBO.getList());
	   for(int i=1;i<=n;i++)
	   {
			System.out.println("Enter the user "+i+" detail in csv format");
			String inp=br.readLine();
			String [] arr=inp.split(",");
		    b.add(new User(arr[0],arr[1],arr[2],arr[3]));
	   }
	   
//	   b.addAll(UserBO.getList());
	   System.out.printf("%-20s%-20s%-20s%-20s\n","Name","Contact Number","Username","Email");
		 for(User bo:b) {
			 bo.display();
		 }
	 
	 System.out.println("Enter the range to be removed from array list");
	 int n1=Integer.parseInt(br.readLine());
	 int n2=Integer.parseInt(br.readLine());
	 b.removeUser(n1,n2);
	 System.out.printf("%-20s%-20s%-20s%-20s\n","Name","Contact Number","Username","Email");
	 for(User bo:b) {
		 bo.display();
	 }
 
	}
}
