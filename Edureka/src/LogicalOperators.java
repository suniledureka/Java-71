
public class LogicalOperators {

	public static void main(String[] args) {
		int a=10,b=20,c=30;
		
		//boolean result = ((a>b) && (a>c++));
		boolean result = ((a>b) & (a>c++));
		System.out.println(result);
		System.out.println(c);
	}
}
