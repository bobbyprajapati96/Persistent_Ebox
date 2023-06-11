package WeakPasswordEx;

public class WeakPasswordException extends Exception {
  WeakPasswordException(){
	  super("Your password is weak");
  }
}
