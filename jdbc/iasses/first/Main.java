package jdbc.iasses.first;
import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;

public class Main{
    
    public static void main(String [] args) throws Exception{
        //fill your code here
        
        Scanner sc=new Scanner(System.in);
       
       ArrayList<User> users = UserDAO.listUsers();
        System.out.format("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %s\n", "Id", "Name", "Email", "Password", "Age", "Role", "CreatedDate", "Status");
        for (User user : users) {
            System.out.format("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %s\n",
                    user.getId(), user.getName(), user.getEmail(), user.getPassword(), user.getAge(),
                    user.getRole(), user.getCreatedDate(), user.getStatus());
            // System.out.println(user);
        }

        // Delete a user based on their ID
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Id :");
        int userId = scanner.nextInt();
        UserDAO.deleteUser(userId);

        // Display the list of users after deleting
        users = UserDAO.listUsers();
        System.out.println("After the Delete");
        System.out.format("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %s\n", "Id", "Name", "Email", "Password", "Age", "Role", "CreatedDate", "Status");
        for (User user : users) {
            System.out.format("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %s\n",
                    user.getId(), user.getName(), user.getEmail(), user.getPassword(), user.getAge(),
                    user.getRole(), user.getCreatedDate(), user.getStatus());
            // System.out.println(user);
        }
    }
}