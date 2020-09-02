package exceptionexample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BasicException {
	
	public void readFile() {
		// checked exception or compile time exception.
		try {
			FileInputStream is = new FileInputStream("C:/abc.txt");
		} catch (FileNotFoundException e) {
			System.out.println("Handling File Not found excpetion");
		}
	}
	
	public void calculateSize(String name) {
		try {
			int i = Integer.parseInt(name);
			int size = name.length();
			System.out.println("The length of name is " + size);
		} catch (NullPointerException e) {
			System.out.println("Handling null pointer exception");
		} catch (NumberFormatException ex) {
			System.out.println("Handling Number format exception");
		} catch (Exception e) {
			System.out.println("Parent class Handler");
		}
	}
	
	public void divide(int a, int b) {
		// unchecked exception or run time exception
		try {
			int c = a/b;
			System.out.println("The value of c is " + c);
		} catch(ArithmeticException e) {
			System.out.println("Handling your arithmatic exception");
		}
	}

	public static void main(String args[]) {
		BasicException ex = new BasicException();
		ex.divide(10, 0);
		ex.calculateSize(null);
	}
}
