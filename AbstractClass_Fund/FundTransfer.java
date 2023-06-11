package AbstractClass_Fund;

public abstract class FundTransfer {
 private String accountNumber;
 public String getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
}
private double balance;
 public boolean validate(Double transfer) {
	 if(accountNumber.length()==10 && transfer>0 && transfer<=getBalance() ) {
		 return true;
	 }
	 return false;
 }
 public abstract Boolean transfer(double transfer);
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
}
