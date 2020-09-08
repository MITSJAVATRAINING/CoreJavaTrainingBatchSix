package javabasic;

import java.util.ArrayList;

public class ArrayExample {
	
	public static void main(String args[]) {
		int[] a = new int[3];
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		
		
		String[] names = new String[] {"Shaleen", "Ramya", "Naveen"};
		//System.out.println(names[1]);
		
		for (int i=0;i<a.length;i++) {
			System.out.println(names[i]);
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		int element = 35;
		
		boolean isPresent = list.contains(element);
		System.out.println(isPresent);
		
		int sum = 0;
		for (Integer i: list) {
			sum = sum + i;
		}
		
		int avg = sum/ list.size();
		//System.out.println("Average is " + avg);
	}
}
