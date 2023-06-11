package Lang_Fundamental;

import java.util.Scanner;

public class Prime_number {
	
	public static boolean checkPrime(int n) {
		boolean flag=false;
		for(int i=2;i<=n/2;++i) {
			if(n%i==0) {
				flag=true;
				break;
			}
		}
		if(!flag) {
			return true;
		}
		else return false;
	}
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int n2=sc.nextInt();
	if(n==1)
		n++;
	while(n<=n2) {
		if(checkPrime(n)) {
			System.out.println(n+"");
		}
		n++;
	}
}
}
