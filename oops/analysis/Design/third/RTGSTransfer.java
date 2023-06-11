package oops.analysis.Design.third;

public class RTGSTransfer extends FundTransfer{
	 public RTGSTransfer(String accNo,double bal){
		 super(accNo,bal);
	 }
		@Override
		public boolean transfer(double transfer) {
			if(transfer>10000) {
				setBalance(getBalance()-transfer);
				return true;
			}
			return false;
		}

	}
