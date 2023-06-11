package oops.analysis.Design.third;

public class NEFTTransfer extends FundTransfer {
 public NEFTTransfer(String accNo,double bal){
	 super(accNo,bal);
 }
	@Override
	public boolean transfer(double transfer) {
		double amount=transfer+(transfer*0.05);
		if(amount<getBalance()) {
			double amt=getBalance()-amount;
			setBalance(amt);
			return true;
		}
		return false;
	}

}