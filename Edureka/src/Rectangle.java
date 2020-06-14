
public class Rectangle extends Shape 
{
	int length, breadth;
	Rectangle(String color, int len, int bre){
		super(color);
		this.length = len;
		this.breadth = bre;
	}
	@Override
	void area() {
		System.out.println("Area of Rectangle = "+(this.length*this.breadth));
	}
}
