package co.edureka.threads;

class MyTask2 extends Thread
{   
   public void run() {
	 Thread t = Thread.currentThread();
	 System.out.println(t);
   }	
}

public class ThreadTest2 {

	public static void main(String[] args) {
		Thread mt = Thread.currentThread();		
		System.out.println("No of Threads = "+ Thread.activeCount());
		System.out.println(mt);
		
		MyTask2 ct = new MyTask2();
		ct.start();
		
		System.out.println("No of Threads = "+ Thread.activeCount());
	}

}
