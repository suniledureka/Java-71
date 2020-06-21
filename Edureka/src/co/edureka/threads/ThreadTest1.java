package co.edureka.threads;
class MyTask1 implements Runnable
{
 public void run() {
	 Thread t = Thread.currentThread();
	 System.out.println("Inside run() - "+t);		 
 }
}

public class ThreadTest1 {
	public static void main(String[] args) {		
		Thread mt = Thread.currentThread();		
		System.out.println("No of Threads = "+ Thread.activeCount());
		System.out.println(mt);
		
		MyTask1 obj = new MyTask1();
		Thread ct = new Thread(obj);
		ct.start();
		
		System.out.println("No of Threads = "+ Thread.activeCount());
	}
}
