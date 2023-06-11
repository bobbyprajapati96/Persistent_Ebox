package oops.analysis.third;

public class PrivilegeCustomer extends Customer{

	public PrivilegeCustomer(String name, String address, int age, String mobileNumber) {
		super(name, address, age, mobileNumber);
		// TODO Auto-generated constructor stub
	}
   public double getBillAmount(double amount) {
	   double ans=amount-(amount*0.30);
	   return ans;
   }
}
