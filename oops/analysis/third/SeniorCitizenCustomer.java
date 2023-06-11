package oops.analysis.third;

public class SeniorCitizenCustomer extends Customer {

	public SeniorCitizenCustomer(String name, String address, int age, String mobileNumber) {
		super(name, address, age, mobileNumber);
	}
     public double getBillAmount(double amount) {
    	 double ans=amount-(amount*0.12);
    	 return ans;
     }
}
