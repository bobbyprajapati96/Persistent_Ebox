package oops.analysis.Design.second;

public class CurrentAccount extends Account{

	public CurrentAccount(String accName, String accNo, String bankName, String tinNumber) {
		super(accName, accNo, bankName);
		this.tinNumber = tinNumber;
	}

	public String tinNumber;
	public void display() {
		super.display();
		System.out.println("\nTin Number:"+tinNumber);
	}
}
