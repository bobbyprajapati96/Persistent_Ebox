package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetPractice {
public static void main(String[] args) {
	Set<String> set=new HashSet<>();
	
System.out.println("--------------------------------------------Add()");
	set.add("Red");
	set.add("blue");
	set.add("white");
	set.add("yellow");
	set.add("purple");
	
	System.out.println("--------------------------------------------Iterate on set");
	
	Iterator it=set.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	System.out.println("--------------------------------------------Size() of set");
	System.out.println(set.size());
	
	System.out.println("--------------------------------------------removeAll()");
//	set.removeAll(set);
//	System.out.println(set);
	
	System.out.println("--------------------------------------------isEmpty()");
	if(set.isEmpty()) {
		System.out.println("set is Empty");
	}else {
		System.out.println("Not empty");
	}
	
	System.out.println("--------------------------------------------convert set to array using toArray()");
     String[] arr=new String[set.size()];
     set.toArray(arr);
     for(String a:arr) {
    	 System.out.println(a);
     }
     
     System.out.println("--------------------------------------------contains()");
     if(set.contains("white")){
    	 System.out.println("It contains");
     }else {
    	 System.out.println("does not contains");
     }
     
     System.out.println("--------------------------------------------retainAll()");
     
     Set<String> set2=new HashSet<>();
     set2.add("Red");
 	set2.add("blue");
 	set2.add("Pink");
 	set2.add("yellow");
 	set2.add("Green");
 	
 	System.out.println("set-1 : "+set);
 	System.out.println("After retain");
 	set.retainAll(set2);
 	System.out.println("set-1 : "+set);
 	
}
}
