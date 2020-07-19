package co.edureka;

public class Bank {
 public void deposit() {
	 System.out.println("A Generic Deposit method");
 }
 
 public void deposit(String acno, float amt) {
	 System.out.println("Rs."+amt+" Credited to A/C: "+acno);
 }
}
