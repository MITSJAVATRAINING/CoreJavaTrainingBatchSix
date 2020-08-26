package inheritanceexample;

public class Rectangle extends Shape {
	
	void calculateArea(int length, int bredth) {
		int area = length * bredth;
		System.out.println("The area for shape " + this.getShapeName() + " is " + area);
	}
	
	public static void main(String args[]) {
		Rectangle rec = new Rectangle();
		rec.setShapeName("Rectangle");
		System.out.println(rec.getShapeName());
		rec.calculateArea(5, 7);
	}

}
