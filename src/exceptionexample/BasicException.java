package exceptionexample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BasicException {

	public void readFile() throws FileNotFoundException, IOException {
		// checked exception or compile time exception.
		FileInputStream is = new FileInputStream("C:/abc.txt");
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
//			ex.printStackTrace();
			// System.out.println(ex.getMessage());
			System.out.println(ex);
		} catch (Exception e) {
			System.out.println("Parent class Handler");
		} finally {
			System.out.println("In finally block");
		}
	}

	public void divide(int a, int b) throws ArithmeticException{
		// unchecked exception or run time exception
		int c = a / b;
		System.out.println("The value of c is " + c);
	}
	
	public void checkAge(int age) throws AgeException {
		if (age >= 18) {
			System.out.println("User is eligible to vote");
		} else {
			throw new AgeException("User can not vote");
		}
	}

	public static void main(String args[]) {
		BasicException ex = new BasicException();
//		ex.divide(10, 0);
//		ex.calculateSize(null);
//		try {
//			ex.readFile();
//		} catch (Exception e) {
//			System.out.println("Handling file not found exception");
//		}

		try {
			ex.checkAge(17);
		} catch (AgeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
	}
}
