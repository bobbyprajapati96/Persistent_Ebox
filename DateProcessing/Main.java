package DateProcessing;

import java.util.*;
import java.io.*;
import java.text.*;
public class Main {

	public static void main(String[] args)throws IOException,ParseException{
		//fill your code here

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Enter the number of Events");
		int n=Integer.parseInt(br.readLine());
		ArrayList<String> al=new ArrayList<>();
		System.out.println("Enter event details in CSV(Event Name,Start Date,End Date) Date:dd/MM/yyyy");
		for(int i=0;i<n;i++)
		{
                  String inp=br.readLine();
				  String[] arr=inp.split(",");
				  Date d1=(Date)sdf.parse(arr[1]);
				  Date d2=(Date)sdf.parse(arr[2]);
				  Event e=new Event(arr[0],d1,d2);
				  if(e.noOfDay()<1){
					 al.add(arr[0]);
				  }
		}
		System.out.println("1-day Events:");
	   boolean c=false;
	   for(String a:al) {
		   if(al.size()>=1) {
			   System.out.println(a);
			   c=true;
		   }
	   }
	   if(!c) {
		   System.out.println("No Events");
	   }
	}

}
