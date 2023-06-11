package java8features.iasses.first;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of bookings");
        int n = sc.nextInt();

        List<TicketBooking> bookings = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter customer name");
            String name = sc.next();
            System.out.println("Enter number of tickets");
            int noOfTickets = sc.nextInt();
            System.out.println("Enter the price");
            double price = sc.nextDouble();
            bookings.add(new TicketBooking(name, noOfTickets, price));
        }

        sc.close();

        System.out.format("%-10s %-15s %-15s\n", "Customer", "No Of Tickets", "Price");
        bookings.stream()
                .sorted(Comparator.comparing(TicketBooking::getPrice))
                .forEach(System.out::println);
    }
}