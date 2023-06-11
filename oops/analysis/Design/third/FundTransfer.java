package oops.analysis.Design.third;

public abstract class FundTransfer {
    public String getAccountNumber() {
		return accountNumber;
	}
	public FundTransfer(String acno, Double bal) {
        this.accountNumber = acno;
        this.balance = bal;
    }
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public  String accountNumber;
    public double balance;
    public boolean validate(double transfer) {
    	if(accountNumber.length()==10 && transfer>0 && transfer<=getBalance()) {
    		return true;
    	}
    	return false;
    }
    public abstract boolean transfer(double transfer);
}
