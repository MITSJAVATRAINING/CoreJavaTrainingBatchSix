package collectionexample;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapExamples {

	public static void main(String args[]) {
		
//		HashMap<Integer, String> map = new HashMap<Integer, String>();
//		map.put(100, "Shaleen");
//		map.put(200, "Ramya");
//		map.put(300, "Naveen");
//		map.put(200, "Vaibhav");
//		
//		System.out.println("The value with key 200 is " + map.get(200));
//		
//		for (Integer a: map.keySet()) {
//			System.out.println(a + "---->"+map.get(a));
//		}
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("Shaleen", 25);
		map.put("Vaibhav", 26);
		map.put("Naveen", 27);
		
		Iterator<String> iterator = map.keySet().iterator();
		
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println("Name and age of person is " + name + " and " + map.get(name));
		}
	}
}
