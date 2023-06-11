package WeakPasswordEx;
import java.io.*;
public class Main {
public static void main(String[] args)throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the user Details");
	String inp=br.readLine();
	String [] arr=inp.split(",");
	User u=new User(arr[0],arr[1],arr[2],arr[3]);
	try {
		UserBO.validate(u);
		System.out.println(u.toString());
	} catch (WeakPasswordException e) {
		System.out.println(e);
	}
}
}
