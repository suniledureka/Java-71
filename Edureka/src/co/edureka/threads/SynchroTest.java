package co.edureka.threads;
class PrintTable{
	//public void mTable(int n)
	synchronized public void mTable(int n)
	{
		try {
			for(int i=1;i<=10;i++) {
				int p = n * i;
				System.out.println(n+" x "+i+" = "+p);
				Thread.sleep(1000);
			}//for
			System.out.println("-----------------------");
			Thread.sleep(4000);
		}
		catch(Exception ex) {}
	}
}


class MyThread1 extends Thread{
   	PrintTable pt;
   	MyThread1(PrintTable t){
   		this.pt = t;
   	}
   	public void run() {
   		pt.mTable(5);
   	}
}

class MyThread2 extends Thread{
   	PrintTable pt;
   	MyThread2(PrintTable t){
   		this.pt = t;
   	}   	
   	public void run() {
   		pt.mTable(6);
   	}
}

public class SynchroTest {

	public static void main(String[] args) {
		PrintTable table = new PrintTable();
		MyThread1 t1 = new MyThread1(table);
		MyThread2 t2 = new MyThread2(table); 
		
		t1.start();
		t2.start();
	}
}
