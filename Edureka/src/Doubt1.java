
public class Doubt1 {

	public static void main(String[] args) {
		String[] names={"sam","rani", "vani"};
		for(String x : names) {
			System.out.println(x);
		}
		
		double[] salary={20,30,40};
		for(double x : salary) {
			System.out.println(x);
		}
		
		for(int i=0;i<names.length ;i++) {
			System.out.println(names[i]+" : "+salary[i]);
		}
	}	

}
