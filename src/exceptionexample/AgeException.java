package exceptionexample;

public class AgeException extends Exception {

	String msg;

	public AgeException(String msg) {
		super();
		this.msg = msg;
	}
	
}
