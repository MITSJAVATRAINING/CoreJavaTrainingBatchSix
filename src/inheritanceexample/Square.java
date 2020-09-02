package inheritanceexample;

public class Square extends Shape { // Represents """IS-A"" Relationship
	
	int a = 10; 
	
	void calculateArea() {
		
	}
	void calculateArea(int side) {
		int area = side * side;
		System.out.println("The area for shape " + this.getShapeName() + " is " + area);
	}

	public static void main(String args[]) {
		Square sq = new Square();
		sq.setShapeName("Sqaure");
		sq.calculateArea(10);
	}

}
