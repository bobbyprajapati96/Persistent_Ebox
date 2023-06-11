package oops.analysis.Design.third;

public class IMPSTransfer extends FundTransfer {
	 
	 public IMPSTransfer(String accNo,double bal){
		 super(accNo,bal);
	 }
		@Override
		public boolean transfer(double transfer) {
			double amount=transfer+(transfer*0.02);
			if(amount<getBalance()) {
				double amt=getBalance()-amount;
				setBalance(amt);
				return true;
			}
			return false;
		}

	}