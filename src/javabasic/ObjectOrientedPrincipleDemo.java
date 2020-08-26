package javabasic;
/**
 * 1.) Polymorphism
 * 
 * Representation of data in more than one form.
 * 
 * Real time horse (Several Steps) and chess board horse (2.5 Steps) -- > Run()
 * 
 * 			a). static polymorphism or method overloading or compile time polymorphism.
 * 			b)  dynamic polymorphism or method overriding or run time polymorphism.
 * 
 * 2.) Encapsulation. Wrapping of data and behaviour in to a single entity. Example:- Class
 * 
 * 3.) Abstraction :- Access Modifier
 * 
 * 4.) Inheritance :- 
 * 
 * 
 * **/
public class ObjectOrientedPrincipleDemo {
	
	
	private int sum(int a, int b) {
		int c = a + b;
		return c;
		//System.out.println("The value of c is " + c);
	}
	
	protected void sum(int a, int b, int c) {
		int d = a + b + c;
		System.out.println("The value of d is " + d);
	}
	
	public static void main(String args[]) {
		ObjectOrientedPrincipleDemo obj = new ObjectOrientedPrincipleDemo();
		int d = obj.sum(10, 20);
		System.out.println("the valus of d is " + d);
	}

}
