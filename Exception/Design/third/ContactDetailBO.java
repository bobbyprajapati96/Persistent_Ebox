package Exception.Design.third;

public class ContactDetailBO  {
 public static void validate(String mobile,String alterMobile)throws DuplicateMobileNumberException {
	 if(mobile.equals(alterMobile)) {
		 throw new DuplicateMobileNumberException();
	 }
 }
}
