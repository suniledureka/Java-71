package co.edureka.threads;

public class MainThread {

	public static void main(String[] args) {
		int noOfThreads = Thread.activeCount();
		System.out.println("No of Active Threads = "+ noOfThreads);
		
		Thread mt = Thread.currentThread();
		System.out.println(mt); //[main,5,main]
		
		System.out.println(mt.getName());
		System.out.println(mt.getPriority());
		ThreadGroup tgp = mt.getThreadGroup();
		System.out.println(tgp);
		
		mt.setName("edureka");
		mt.setPriority(10);
		System.out.println(mt);
	}
}
