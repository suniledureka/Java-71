
public class MultidimensionalArrayInitialization {

	public static void main(String[] args) {
		int[][] n = {{1,2,3},{4,5},{6,7,8,9}};
		System.out.println("Size of Array = "+ n.length);
		
		/*-- to display each inner array size --*/
		for(int i=0;i<n.length;i++) {
			System.out.println("Size of n["+i+"] = "+ n[i].length);
		}
		
		/*--- display array contents in a matrix form ---*/
		for(int[] x : n) {
			for(int y : x) {
				System.out.print(y+"   ");
			}
			System.out.println();
		}

	}

}
