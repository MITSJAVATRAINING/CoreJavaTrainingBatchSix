package javabasic;

public class Fruit {

	String fruitName;
	String taste;
	String measuringUnit;
	
	public void printFruit() {
		System.out.println(fruitName);
	}
	
	public static void main(String args[]) {
		Fruit mango = new Fruit();
		mango.fruitName = "Mango";
		mango.taste = "sweet";
		mango.measuringUnit = "kg";
		System.out.println(mango.fruitName);
		mango.printFruit();
		Fruit orange = new Fruit();
		orange.fruitName = "Orange";
		orange.taste = "sweet";
		orange.measuringUnit = "kg";
	}
}
