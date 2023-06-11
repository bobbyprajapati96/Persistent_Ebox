package oops.analysis.Design.second;

public class SavingAccount extends Account {
	public SavingAccount(String accName, String accNo, String bankName, String orgName) {
		super(accName, accNo, bankName);
		this.orgName = orgName;
	}

	public String orgName;
	public void display() {
		super.display();
		System.out.println("\nOrganisation Name:"+orgName);
	}

}
