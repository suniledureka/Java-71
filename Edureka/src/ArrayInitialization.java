
public class ArrayInitialization {

	public static void main(String[] args) {
		String[] subjects = {"English","II Lang","Maths","Chemistry","Biology","Computers"};
		int[] marks = {98,96,83,71,69,90};
		
		System.out.println("No of Subjects = "+ marks.length);
		
		/* -- array iteration using a normal for loop -- */
		for(int i=0;i<marks.length;i++) {
			//System.out.println("Mark for Subject-"+(i+1)+"= "+ marks[i]);
			System.out.println("Mark for "+ subjects[i] + "= "+ marks[i]);
		}
		
		System.out.println("--- marks obtained ------");
		/*-- array iteration using enhanced for loop --*/
		for(int x : marks) {
			System.out.print(x+" | ");
		}
		System.out.println();
		
		System.out.println(marks[marks.length-1]);
		System.out.println(marks[10]); //java.lang.ArrayIndexOutOfBoundsException
	}
}
