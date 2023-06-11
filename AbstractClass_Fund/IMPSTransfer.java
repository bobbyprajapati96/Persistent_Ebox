package AbstractClass_Fund;

public class IMPSTransfer extends FundTransfer {

	@Override
	public Boolean transfer(double transfer) {
	  double amt=transfer+transfer*0.02;
	  if(amt<getBalance()) {
		  setBalance(getBalance()-amt);
		  return true;
	  }
	  return false;
	}

}
