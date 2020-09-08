package jabaeightexamples;

public interface Operation {
	
	public int calculate(int x, int y);
	
	public default int square(int x) {
		return x*x;
	}
	
	public static int cube (int x) {
		return x*x*x;
	}

}
