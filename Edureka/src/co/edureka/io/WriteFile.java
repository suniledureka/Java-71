package co.edureka.io;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class WriteFile {

	public static void main(String[] args) throws Exception {
		FileOutputStream fout = new FileOutputStream("src/co/edureka/io/edureka.txt");
		
		String str = "Edureka is an online training provider with the most effective learning system in the world. We help professionals learn trending technologies for career growth.";
		byte[] b = str.getBytes(); //to convert String to bytes
		fout.write(b);
		
		
		PrintStream ps = new PrintStream(System.out);
		ps.println("file created!");
		
		fout.close();
	}
}
