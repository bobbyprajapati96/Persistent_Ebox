package iAsses_Super;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Event {
	private String name;
	private String detail;
	private String type;
	private String ownerName;
	private Double costPerDay;
  
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public Double getCostPerDay() {
		return costPerDay;
	}

	public void setCostPerDay(Double costPerDay) {
		this.costPerDay = costPerDay;
	}

	public Event() {
	}

	public Event(String name, String detail, String type, String ownerName, Double costPerDay) {
		super();
		this.name = name;
		this.detail = detail;
		this.type = type;
		this.ownerName = ownerName;
		this.costPerDay = costPerDay;
	}
 
	 public long NoOfDays(String dateBefore,String dateAfter) throws ParseException {
		 SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		 Date before = (Date) sdf.parse(dateBefore);
	        Date after = (Date) sdf.parse(dateAfter);
		 long timeDiff = Math.abs(after.getTime() - before.getTime());
	        long daysDiff = TimeUnit.DAYS.convert(timeDiff, TimeUnit.MILLISECONDS);
	        return daysDiff;
	    }
	 public void displayGst(long noOfDate, double gst) {
	        double totalCost = (double) (noOfDate * costPerDay * gst);
	        System.out.println("The GST to be paid is Rs." + totalCost);
	    }

}
