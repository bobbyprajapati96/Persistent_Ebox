package Exception.IAssess.second;
//
//public class UserBO {
//	public static boolean isWeak(String pass) {
//		int digit=0;
//		int special=0,letter=0;
//		
//		for(int i=0;i<pass.length();i++) {
//			if(pass.charAt(i)>='0' && pass.charAt(i)<='9') digit+=1;
//			else if(pass.charAt(i)>='a' && pass.charAt(i)<='z' ||pass.charAt(i)>='A' && pass.charAt(i)<='Z') {
//				letter+=1;
//			}
//			else {
//				special++;
//			}
//		}
//		if(pass.length()>=10 && pass.length()<=20) {
//			return true;
//		}
//		if(digit>0 && special>0 && letter>0) return true;
//		return false;
//	}
//   public static void validate(User u) throws WeakPasswordException {
//	   if(isWeak(u.getPassword())) throw new WeakPasswordException();
//   }
//}
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserBO {
	//Your code here
    public static boolean isWeak(String password){
        if(password.length()<10 || password.length()>20){
            return true;
        }
        int special=0,digit=0,letter=0;
        for(int i=0;i<password.length();i++){
            if(password.charAt(i)>='0' && password.charAt(i)<='9'){
                digit+=1;
            }
            else if((password.charAt(i)>='a' && password.charAt(i)<='z') || (password.charAt(i)>='A' && password.charAt(i)<='Z') ){
                letter+=1;
            }
            else{
                special++;
            }
        }
        if(digit>0 && special>0 && letter>0){
            return false;
        }
        else {
            return true;
        }
//        Pattern p=Pattern.compile("[0-9]+^[0-9a-zA-Z]+[a-zA-Z]+{10,20}");
//        Matcher m =p.matcher(password);

//        return false;
    }
    public static void validate(User u) throws WeakPasswordException{
        if(isWeak(u.getPassword())) throw new WeakPasswordException();
    }
}

