package Fundamental_classes.iasses.second;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Event {
public Event(String eventName, Date startDate, Date endDate) {
		super();
		this.eventName = eventName;
		this.startDate = startDate;
		this.endDate = endDate;
	}
public long getDay() {
	long timediff=Math.abs(this.endDate.getTime()-this.startDate.getTime());
	long days=TimeUnit.DAYS.convert(timediff,TimeUnit.MILLISECONDS);
	return days;
}
public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
private String eventName;
private Date startDate;
private Date endDate;

}
