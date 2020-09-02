package collectionexample;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

	public static void main(String args[]) {
		
		Queue<Integer> queue = new PriorityQueue<Integer>();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.add(50);
		
		System.out.println("Element poll" + queue.poll()); // 10 removed it [20,30,40,50] 
		System.out.println("Element peak" + queue.peek()); // 20 [20,30,40,50]
		System.out.println("Element poll" + queue.poll()); // 20 [30,40,50]
		
		System.out.println("Iteration using extednded for loop");
		for (Integer a: queue) {
			System.out.println(a);
		}
		
		System.out.println("Iteration using iterable");
		
		Iterator<Integer> iter = queue.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}
}
