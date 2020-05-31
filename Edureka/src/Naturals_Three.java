
public class Naturals_Three {

	public static void main(String[] args) {
		
		printNaturals(10); // method call
		printNaturals(15);
	}
	
	/* --- method definition --- */
	static void printNaturals(int n) {
		System.out.println("First "+n+" Natural Numbers are:");
		for(int i=1;i<=n;i++) {
			System.out.print(i+"   ");
		}				
		System.out.println("\n");
	}
}
