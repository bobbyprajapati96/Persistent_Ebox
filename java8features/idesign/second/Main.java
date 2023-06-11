package java8features.idesign.second;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of events");
		int n = scanner.nextInt();
		scanner.nextLine();

		List<Event> eventList = new ArrayList<>();
		System.out.println("Enter event details in CSV(Event Name,Organiser Name,Event Cost)");
		for (int i = 0; i < n; i++) {

			String[] eventDetails = scanner.nextLine().split(",");
			Event event = new Event(eventDetails[0], eventDetails[1], Double.parseDouble(eventDetails[2]));
			eventList.add(event);
		}

		Event eventObj = new Event();
		eventObj.display(eventList);
		scanner.close();
	}
}
