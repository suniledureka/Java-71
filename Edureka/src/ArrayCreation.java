
public class ArrayCreation {

	public static void main(String[] args) {
		int[] marks = new int[7];
		marks[0] = 98;
		marks[1] = 87;
		System.out.println("Size of Array = "+ marks.length);
		for(int i=0;i<marks.length;i++) {
			System.out.print(marks[i]+"   ");
		}
		System.out.println();
		
		float[] salaries = new float[10];
		for(float x : salaries) {
			System.out.print(x+"   ");
		}
		System.out.println();
		
		boolean[] status = new boolean[8];
		for(boolean x : status) {
			System.out.print(x+"   ");
		}
		System.out.println();
		
		
		String[] names = new String[5];
		for(String name : names) {
			System.out.print(name+"   ");
		}
	}
}
