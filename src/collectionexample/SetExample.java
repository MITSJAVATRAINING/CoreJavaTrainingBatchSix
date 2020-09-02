package collectionexample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

	public static void main(String args[]) {
		int[] array = new int[5];
		
		array[0] = 10;
		
		Set<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(40);
		set.add(40);
		set.add(50);
		
		Iterator<Integer> iter = set.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("the element at 4th index  is " + set.contains(60));
		System.out.println("the element at 4th index  is " + set.remove(30));
		
		
		
		System.out.println("Iterating set using for loop");
		
		for (Integer a: set) {
			System.out.println(a);
		}
	}
}
