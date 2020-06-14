interface Bank
{
	int n =12;
	void deposit(float amt);
	void withdraw(float amt);
	default void gst(){
		System.out.println("GST Calculations...");
	}
	default void gst(int n){
		System.out.println("GST Calculations...");
	}
}