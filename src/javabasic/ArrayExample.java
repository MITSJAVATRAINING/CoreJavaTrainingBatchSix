package javabasic;

public class ArrayExample {
	
	public static void main(String args[]) {
		int[] a = new int[3];
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		
		String[] names = new String[] {"Shaleen", "Ramya", "Naveen"};
		
		
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]);
			System.out.println(names[i]);
		}
	}
}