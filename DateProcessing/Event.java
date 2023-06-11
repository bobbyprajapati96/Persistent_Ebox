package DateProcessing;

import java.text.*;
import java.util.*;
import java.util.concurrent.TimeUnit;
public class Event {
	//fill your code here
	String eventName;
	Date startDate;
	Date endDate;
	Event(String eventName,Date startDate,Date endDate){
		this.eventName=eventName;
		this.startDate=startDate;
		this.endDate=endDate;
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

	public long noOfDay(){
		long timeDiff=Math.abs(endDate.getTime()-startDate.getTime());
//		System.out.println(timeDiff);
		long dayDiff=TimeUnit.DAYS.convert(timeDiff,TimeUnit.MILLISECONDS);
		return dayDiff;
	}
}
