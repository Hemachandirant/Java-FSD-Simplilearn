package Multithreading;

public class MultithreadingDemo extends Thread {

	public static void main(String[] args) {
		for(int i=0;i<=5;i++) {
		MultithreadingDemo thread1 = new MultithreadingDemo(1);
		MultithreadingDemo thread2 = new MultithreadingDemo(1);
		thread1.start();
		thread2.start();
		}

	}
	public int thread;
	public MultithreadingDemo(int thread) {
		this.thread = thread;
	}
	@Override
	public void run() {
		for (int i = 0; i <=5; i++) {
			System.out.println(i+" from thread "+thread);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
			
		}
	}

}
