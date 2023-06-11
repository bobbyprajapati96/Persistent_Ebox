package iasses_collection_first;
import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Set<User> set=new HashSet<>();
		System.out.println("Enter number of users:");
		int n=Integer.parseInt(br.readLine());
		List<User> al=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter details of user"+(i+1));
			System.out.println("Username:");
			String username=br.readLine();
			System.out.println("Bank name:");
			String bname=br.readLine();
			User u=new User(username,bname);
			set.add(u);
		}
		
		System.out.println("Enter username(Expire in one month) seperated by comma");
	    String inp=br.readLine();
	    String[] arr=inp.split(",");
	    for (String username : arr) {
	         al.add(new User(username, null));
	     }
	    
	    System.out.println("Users going to expire within a month");
	    set.retainAll(al);
	    int i=1;
	    for(User u:set) {
	    	System.out.println("User"+i);
	    	System.out.println("User Name = "+u.getUsername());
	    	System.out.println("Bank Name = "+u.getBankname());
	    	i++;
//	    	System.out.println(u);
	    }
//	    set.forEach((e)->{
//	    	System.out.println(e);
//	    });
//	  
	}
}






//===========
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.*;
//
//public class Main {
//public static void main(String[] args)throws IOException {
//	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//	Set<User> set=new HashSet<>();
//	ArrayList<User> al = new ArrayList<>();
//	System.out.println("Enter number of users:");
//	int n=Integer.parseInt(br.readLine());
//	for(int i=0;i<n;i++)
//	{
//		System.out.println("Enter details of user"+(i+1));
//		System.out.println("Username:");
//		String username=br.readLine();
//	    System.out.println("Bankname:");
//	    String bankname=br.readLine();
//	    User u=new User(username,bankname);
//	    set.add(u);
//	}
//System.out.println("Enter username(Expire in one month) separated by comma");
//     String[] expireUsernames = br.readLine().split(",");
//     for (String username : expireUsernames) {
//         al.add(new User(username, null));
//     }
//System.out.println("Users going to expire within a month");
//	    set.retainAll(al);
//	    int i=1;
//	    for(User u:set) {
//	    	System.out.println("User"+i);
//	    	System.out.println("User Name = "+u.getUsername());
//	    	System.out.println("Bank Name = "+u.getBankname());
//	    	i++;
////	    	System.out.println(u);
//	    }
//}
//}


