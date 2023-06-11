package Fundamental_classes.iasses;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the code");
	String inp=sc.nextLine();
	StringBuilder sb=new StringBuilder(inp.substring(0,2));
	StringBuilder numcode=new StringBuilder(inp.substring(2));
	if(sb.toString().equals("MB")) {
		sb.replace(0, 2, "MUM");
	}
	else if(sb.toString().equals("DH")) {
		sb.replace(0, 2, "DEL");
	}else if(sb.toString().equals("KL")){
		sb.replace(0, 2, "KOL");
	}
	
	StringBuilder ans=new StringBuilder();
	StringBuilder zeros=new StringBuilder();
	int n=5-numcode.length();
	while(n-->0) {
		zeros.append('0');
	}
	ans.append(sb);
	zeros.append(numcode);
	ans.append(zeros);
	System.out.println("Formatted code");
	System.out.println(ans);
}
}
