class Thread1 extends Thread {

	@Override
	public void run() {
		for(int i=0; i<100; i++) {
		System.out.println("Thread1");
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//			}
		}

	}
		
}

class Thread2 extends Thread {

	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println("Thread2");
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
		}
	}
	
}

public class ThreadTest {

	public static void main(String[] args) {
		Thread1 th1=new Thread1();
		th1.start();
		Thread2 th2=new Thread2();
		th2.start();
	}

}
