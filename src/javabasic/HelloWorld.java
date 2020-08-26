package javabasic;

public class HelloWorld {
	
	int age = 25;
	String name = "Shaleen";
	
	public static void main(String args[]) {
		
		int a = 10;
		int b = 10;
		
		
		int c;
		c = a + b;
		
		System.out.println("the sum of a and b is " + c);
		
		boolean isPerson = true;
		System.out.println("Hello World");
		
		System.out.println("The value of variable a and b are " + a + " and  " + b);
		
		if (a < b) {
			System.out.println("a is lesser");
		} else if (a == b) {
			System.out.println("a is equals to b");
		} else {
			System.out.println("a is greater");
		}
		
		
		for (int i = 1; i<=10 ;i=i+1) {
			System.out.println(i);
		}
		
		System.out.println("While Loop.....");
		int i = 1;
		while (i<=10) {
			System.out.println(i);
			i++;
		}
	}

}
