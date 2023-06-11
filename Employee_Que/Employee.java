package w3resource_java.Employee_Que;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Employee {
    public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", hireDate=" + hireDate + "]";
	}
	String name;
    double salary;
    Date hireDate;
	public Employee(String name, double salary, Date hireDate) {
		super();
		this.name = name;
		this.salary = salary;
		this.hireDate = hireDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	
	
	
	public  int calculateService(String name,ArrayList<Employee> al) throws ParseException {
		int res=0;
		for(Employee e:al) {
			if(name.equals(e.getName())) {
				SimpleDateFormat currDate=new SimpleDateFormat("dd-MM-yyyy");
				  Date date = new Date();  
				  String curr=currDate.format(date);  	
				String pd=currDate.format(e.getHireDate());
				Date beforeDate=(Date)currDate.parse(pd);
				Date afterDate=(Date)currDate.parse(curr);
				@SuppressWarnings("deprecation")
				int year1=beforeDate.getYear();
				@SuppressWarnings("deprecation")
				int year2=afterDate.getYear();
				
			 res=(year2-year1);
				
			}
		}
		return res;
		
	}
}
