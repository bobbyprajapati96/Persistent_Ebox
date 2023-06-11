package AbstractClass_Fund;

public class RTGSTransfer extends FundTransfer {

	@Override
	public Boolean transfer(double transfer) {
	  if(transfer>10000) {
		  setBalance(getBalance()-transfer);
		  return true;
	  }
	  return false;
	}

}
