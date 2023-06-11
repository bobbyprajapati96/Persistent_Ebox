package Exception.second;

public class Transaction {
	public Transaction(String accountNumber, Double amount) {
		super();
		this.accountNumber = accountNumber;
		this.amount = amount;
	}

	public Transaction() {

	}

	private String accountNumber;
	private Double amount;

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String aacountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public boolean validate(double transactionAmount) throws Exception {
		if(transactionAmount>amount || amount<=500) {
			throw new Exception("Insufficient Balance");
		}
		return true;
	}
}
