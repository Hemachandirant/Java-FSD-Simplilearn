package Multithreading;

public class MulithreadingusingRunnable implements Runnable{

	@Override
	public void run() {
		for(int i = 0 ;i<=10;i++) {
		System.out.println("Program is Running ");
		
	}
		}
	
	public static void main(String[] args) {
		MulithreadingusingRunnable threads1 = new MulithreadingusingRunnable();
		MulithreadingusingRunnable threads2 = new MulithreadingusingRunnable();
		MulithreadingusingRunnable threads3= new MulithreadingusingRunnable();
		Thread t1 = new Thread(threads1);
		Thread t2 = new Thread(threads2);
		Thread t3 = new Thread(threads3);
		t1.start();
		t2.start();
		t3.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		
		}
	}

}
