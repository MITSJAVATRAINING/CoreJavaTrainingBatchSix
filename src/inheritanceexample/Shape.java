package inheritanceexample;
/**
 * final :- 
 * 1) variable name :- value can not be changed 
 * 2) method name :- can not override a method
 * 3) class name :- can not extend a class
 * 
 * 
 * 
 * **/
public class Shape {
	
	private String shapeName;
	
	
	public String getShapeName() {
		return shapeName;
	}
	
	public void setShapeName(String name) {
		this.shapeName = name;
	}
	
	void calculateArea() {
		
	}

}
