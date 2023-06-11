package WeakPasswordEx;

public class UserBO {
  public static void validate(User u) throws WeakPasswordException{
	  if(isWeak(u.getPassword()))throw new WeakPasswordException();
  }

private static boolean isWeak(String password) {
	// TODO Auto-generated method stub
	if(password.length()<10 && password.length()>20) return true;
	int letter=0,digit=0,spchar=0;
	for(int i=0;i<password.length();i++) {
		if(password.charAt(i)>='0' && password.charAt(i)<='9')
		{
			digit++;
		}
		else if(password.charAt(i)>='a' && password.charAt(i)<='z' ||password.charAt(i)>='A' && password.charAt(i)<='A') {
			letter++;
		}
		else {
			spchar++;
		}
	}
	if(letter>0 && digit>0 && spchar>0 ) return false;
	else return true;
}
}
