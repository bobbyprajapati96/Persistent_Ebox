package AbstractClass_Fund;

public class NEFTTransfer extends FundTransfer {
	

	@Override
	public Boolean transfer(double transfer) {
	  double amt=transfer+transfer*0.05;
	  if(amt<getBalance()) {
		  setBalance(getBalance()-amt);
		  return true;
	  }
	  return false;
	}

}
