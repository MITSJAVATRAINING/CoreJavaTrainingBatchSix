package inheritanceexample;

public class Operation extends AdvanceMathOperation implements MathOperation  { // Has-a Relationship

	public int add(int a, int b) {
		return a+b;
	}
	
	static int add(int a, int b, int c) {
		return a + b + c;
	}

	public int substract(int a, int b) {
		return a-b;
	}

	public int multiply(int a, int b) {
		return a*b;
	}

	public double divide(int a, int b) {
		return a/b;
	} 
	
	public static void main(String args[]) {
		Operation op = new Operation();
		System.out.println("The addition of 10 and 5 is " + Operation.add(10, 5, 4));
		System.out.println("The substraction of 10 and 5 is " + op.substract(10, 5));
		System.out.println("The multiplication of 10 and 5 is " + op.multiply(10, 5));
		System.out.println("The division of 10 and 5 is " + op.divide(10, 5));
		System.out.println("The square of no 10 is " + op.square(10));
		System.out.println("The cube of no 10 is " + op.cube(10));
	}

}
