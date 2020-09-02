package collectionexample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {

	public static void main(String args[]) {
		int[] array = new int[5];
		
		List<Integer> list = new ArrayList<Integer>(3); //default size is 10
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(30);
		list.add(30);
		list.add(30);
		list.add(30);
		list.add(40);
		list.add(40);
		list.add(50);
		
		
		System.out.println("Iterate list using for loop");
//		
//		for(Integer a : list) {
//			System.out.println(a);
//		}
//		
		System.out.println("The value of list at index 4 is " + list.get(4));
		
		System.out.println("Iterating list using iterator");
		
		Iterator<Integer> iter = list.iterator();
		
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
