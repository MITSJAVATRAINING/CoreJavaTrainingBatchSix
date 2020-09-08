package multithreadingexamples;

public class ThreadCreationRunnableExample implements Runnable {
	
	public void printNumbers() {
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
		ThreadCreationRunnableExample obj1 = new ThreadCreationRunnableExample();
		ThreadCreationRunnableExample obj2 = new ThreadCreationRunnableExample();
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		t2.start();
	}



}
