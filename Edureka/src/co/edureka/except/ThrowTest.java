package co.edureka.except;

import java.util.Scanner;

public class ThrowTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("enter first no: ");
			int x = sc.nextInt();
			
			System.out.print("enter second no: ");
			int y = sc.nextInt();
			
			if(y==0) {
				//create an Exception object
				//ArithmeticException aex = new ArithmeticException();
				//ArithmeticException aex = new ArithmeticException("cannot divide by 0");
				//throw aex;
				throw new Exception("cannot divide a number by 0");
			}
			
			int res = x/y;
			System.out.println(x+" / "+y+" = "+res);
		}
		catch(Exception ex) {
			System.out.println("Message = "+ ex.getMessage());
		}
		System.out.println("** DONE ** ");
	}

}
