package iasses3rd_Collection;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of address:");
	int n=sc.nextInt();
	sc.nextLine();
	Map<String,Map<String,Integer>> stateCityMap=new TreeMap<>();
	for(int i=0;i<n;i++)
	{
		  System.out.println("Enter the address:");
          String addressLine = sc.nextLine();
          String[] addressParts = addressLine.split(",");
          String city = addressParts[1];
          String state = addressParts[2];
          if(!stateCityMap.containsKey(state)) {
        	  stateCityMap.put(state, new TreeMap<>());
          }
          Map<String,Integer> cityCountMap=stateCityMap.get(state);
          cityCountMap.put(city, cityCountMap.getOrDefault(city, 0)+1);
	}
	
	 System.out.println("Number of entries in city/state wise:\n");
	 for(Map.Entry<String, Map<String,Integer>> stateEntry:stateCityMap.entrySet()) {
		 String state=stateEntry.getKey();
		 System.out.println("State: " + state);
		 Map<String, Integer> cityCountMap = stateEntry.getValue();
         for (Map.Entry<String, Integer> cityEntry : cityCountMap.entrySet()) {
             String city = cityEntry.getKey();
             int count = cityEntry.getValue();
             System.out.println("City: " + city + " Count: " + count);
         }

         System.out.println();
	 }
}
}
