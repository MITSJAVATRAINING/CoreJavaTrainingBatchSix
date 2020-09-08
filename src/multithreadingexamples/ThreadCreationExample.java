package multithreadingexamples;

public class ThreadCreationExample extends Thread {
	
	public synchronized void printNumbers() {
		for (int i = 1; i<=10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void run() {
		printNumbers();
	}
	
	public static void main(String args[]) {
		

		ThreadCreationExample obj1 = new ThreadCreationExample();
		obj1.start();
		//obj1.printNumbers();
		
		ThreadCreationExample obj2 = new ThreadCreationExample();
		//obj2.printNumbers();
		obj2.start();
		try {
			obj2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ThreadCreationExample obj3 = new ThreadCreationExample();
		obj3.start();
	}

}
