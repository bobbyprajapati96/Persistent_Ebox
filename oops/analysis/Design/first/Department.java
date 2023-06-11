package oops.analysis.Design.first;

public class Department {
   public String departmentName;
   Staff staff;
   public Department(String staffName,String designation,String departmentName) {
	   staff=new Staff(staffName,designation);
	   this.departmentName=departmentName;
   }
   public void displayStaff() {
	   System.out.println(staff.staffName+" is working in the "+departmentName+" department as "+staff.Designation);
   }
}
