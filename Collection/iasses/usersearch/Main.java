package Collection.iasses.usersearch;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
     System.out.println("Enter number of users:");
     int numUsers = scanner.nextInt();
     scanner.nextLine(); // Consume newline character
     
     Set<User> userSet = new HashSet<>();
     for (int i = 1; i <= numUsers; i++) {
         System.out.println("Enter details of user" + i);
         System.out.println("Username:");
         String username = scanner.nextLine();
         System.out.println("Bank name:");
         String bankname = scanner.nextLine();
         User user = new User(username, bankname);
         userSet.add(user);
     }
     
     System.out.println("Enter username(Expire in one month) separated by comma");
     String[] expireUsernames = scanner.nextLine().split(",");
     List<User> userList = new ArrayList<>();
     for (String username : expireUsernames) {
         userList.add(new User(username, null));
     }
     
     userList.retainAll(userSet);
     
     System.out.println("Users going to expire within a month");
     for (User user : userList) {
         System.out.println("User " + (userList.indexOf(user) + 1));
         System.out.println("User Name = " + user.getUserName());
         System.out.println("Bank Name = " + user.getBankName());
     }
     
     scanner.close();
 }
}