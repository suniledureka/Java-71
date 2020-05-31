
public class Largest {

	public static void main(String[] args) {
		int x=10, y=20, z=30, lar;
		
		if(x>y) {
			if(x>z) {
				lar = x;
			}
			else {
				lar = z;
			}
		}
		else {
			if(y>z) {
				lar = y;
			}
			else {
				lar = z;
			}
		}
		
		System.out.println("Largest = "+ lar);
	}
}
