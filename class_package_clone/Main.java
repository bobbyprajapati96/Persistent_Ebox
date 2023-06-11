package class_package_clone;
import java.util.*;
import java.io.*;
public class Main{
 public static void main(String[] args) throws CloneNotSupportedException {
        Scanner sc = new Scanner(System.in);
        Complaint[] complaints = new Complaint[100];
        int complaintCount = 0;
        Customer previousCustomer = null;
        while(true) {
            System.out.println("Enter the customer name");
            String name = sc.nextLine();

            if(name.equals("")) {
              System.out.println("Same Customer");
                if(previousCustomer == null) {
                    System.out.println("No previous customer found");
                    continue;
                } else {
                    name = previousCustomer.name;
                }
            } else {
                System.out.println("Enter the id");
                String id = sc.nextLine();

                System.out.println("Enter the country");
                String country = sc.nextLine();

                previousCustomer = new Customer(name, id, country);
            }

            System.out.println("Enter the complaint");
            String complaint = sc.nextLine();

            complaints[complaintCount] = new Complaint(complaint, previousCustomer);
            complaintCount++;

            System.out.println("Add another complaint ??");
            String choice = sc.nextLine();

            if(choice.equalsIgnoreCase("no")) {
                break;
            }
        }

        System.out.println("Complaint Details");

        for(int i=0; i<complaintCount; i++) {
            complaints[i].display();
        }

        sc.close();
    }
}