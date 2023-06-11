package w3resource_java.Employee_Que;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Main {
     public static void main(String[] args) throws NumberFormatException, IOException, ParseException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("how many Employees you want to add!");
		int n=Integer.parseInt(br.readLine());
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		ArrayList<Employee> al=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the details (Name,Salary,HireDate) in comma separated format");
			String inp=br.readLine();
			String [] arr=inp.split(",");
			String name=arr[0];
			double sal=Double.parseDouble(arr[1]);
			Date d=(Date) sdf.parse(arr[2]);
			Employee e=new Employee(name,sal,d);
			al.add(e);
		}
		System.out.println("Enter Employee name to find years of service");
		String search=br.readLine();
		Employee e=new Employee();
		int no=e.calculateService(search,al);
		System.out.println(no);
	}
}
