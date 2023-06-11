package oops.analysis.Iasses.first;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Event {
  public Event(String name, String detail, String type, String ownerName, double costPerDay) {
		super();
		this.name = name;
		this.detail = detail;
		this.type = type;
		this.ownerName = ownerName;
		this.costPerDay = costPerDay;
	}
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
	public double getCostPerDay() {
		return costPerDay;
	}
	public void setCostPerDay(double costPerDay) {
		this.costPerDay = costPerDay;
	}
	public Long getNoOfDays(String sdate,String edate)throws ParseException {
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		Date beforeDate=(Date)sdf.parse(sdate);
		Date afterDate=(Date)sdf.parse(edate);
		long timeDiff=Math.abs(afterDate.getTime()-beforeDate.getTime());
		long daysDiff=TimeUnit.DAYS.convert(timeDiff, TimeUnit.MILLISECONDS);
		return daysDiff;
	}
public String name;
  public String detail;
  public String type;
  public String ownerName;
  public double costPerDay;
}
