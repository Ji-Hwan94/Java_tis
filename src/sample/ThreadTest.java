class Thread1 extends Thread{
		@Override
	public void run() {
		while(true) {
			System.out.println("Thread 1¹ø");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				return;
			}
		}
	}	
}
	
class Thread2 extends Thread {
		@Override
	public void run() {
		while(true) {
			System.out.println("Thread 2¹ø");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				return;				
			}
		}
	}
}

public class ThreadTest {
	
	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		t1.start();
		
		Thread2 t2 = new Thread2();
		t2.start();
	}

}
