import java.util.Scanner;

public class AbsTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Shape shape = null;
		System.out.print("enter the type of shape [1.Rect | 2. Circle] : ");
		int type= sc.nextInt();
		
		if(type==1) {
			System.out.print("enter length: ");
			int len = sc.nextInt();
			System.out.print("enter breadth: ");
			int bre = sc.nextInt();
			shape = new Rectangle("Red",len,bre);
		}
		else if(type==2) {
			System.out.print("enter radius: ");
			int rad = sc.nextInt();
			shape = new Circle("Red",rad);
		}
		else {
			System.out.println("Invalid Shape");
			return;
		}
		System.out.println("Color = "+ shape.getColor());
		shape.setColor("Blue");
		
		shape.area();
		sc.close();
	}
}
