package MAP;

import java.util.HashMap;
import java.util.Map;

public class Print {
public static void main(String[] args) {
	Map<Integer,String> map=new HashMap<>();
	map.put(1, "Tushar");
	map.put(2, "abhay");
	map.put(3, "Eshan");
	System.out.println("Elements:");
	for(Map.Entry x:map.entrySet()) {
		System.out.println(x.getKey()+" "+x.getValue());
	}
	System.out.println("-----------------------------------------------------------Size()");
	System.out.println("size"+map.size());
	
	System.out.println("-----------------------------------------------------------PutAll()");
	
	
	Map<Integer,String> map2=new HashMap<>();
	map2.put(4, "Red");
	map2.put(5,"Blue");
	map2.put(6,"Green");
	
	map.putAll(map2);
	System.out.println("Map 2 Elements");
	for(Map.Entry y:map2.entrySet()) {
		System.out.println(y.getKey()+" "+y.getValue());
	}
	System.out.println("--------------------------------------------");
	System.out.println("After PutAll");
	for(Map.Entry y:map.entrySet()) {
		System.out.println(y.getKey()+" "+y.getValue());
	}
	
	System.out.println("-------------------------------------------- Remove All mappings -> Clear()");
	
	map2.clear();
	System.out.println(map2);
	
	System.out.println("-------------------------------------------- check isEmpty()");
	
	System.out.println("Map is Empty : "+map2.isEmpty());
	
	System.out.println("-------------------------------------------- containsKey()");
	
	if(map.containsKey(3)) {
		System.out.println("Yes it contains : "+map.get(3));
	}else {
		System.out.println("No it does not contains this key");
	}
}
}
