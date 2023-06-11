package java8features.idesign.second;

import java.util.List;

public class Event {
public Event() {
		super();
		// TODO Auto-generated constructor stub
	}
public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getOrganiserName() {
		return organiserName;
	}
	public void setOrganiserName(String organiserName) {
		this.organiserName = organiserName;
	}
	public double getEventCost() {
		return eventCost;
	}
	public void setEventCost(double eventCost) {
		this.eventCost = eventCost;
	}
public Event(String eventName, String organiserName, double eventCost) {
		super();
		this.eventName = eventName;
		this.organiserName = organiserName;
		this.eventCost = eventCost;
	}
private String eventName;
private String organiserName;
private double eventCost;


public void display(List<Event> eventList) {
	eventList.stream().forEach(event->{
		System.out.println(event.getEventName()+"|"+event.getOrganiserName()+"|"+event.getEventCost());
	});
}
}
