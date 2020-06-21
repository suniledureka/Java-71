package co.edureka.except;

import java.util.Scanner;

public class FinallyTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("enter first no: ");
			int x = sc.nextInt();
			
			System.out.print("enter second no: ");
			int y = sc.nextInt();
			
			int res = x/y;
			System.out.println(x+" / "+y+" = "+res);
		}
		catch(ArithmeticException aex) {
			System.out.println("Exception: "+ aex.getMessage());
		}
		finally {
			/*--- all cleanup code to be written here --- */
			System.out.println("Application Designed & Developed by");
			System.out.println("team @ edureka");		
			sc.close();
		}
		System.out.println("** DONE **");
	}
}
