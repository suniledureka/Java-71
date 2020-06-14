
public class Circle extends Shape 
{
	int radius;
	Circle(String color, int rad){
		super(color);
		this.radius = rad;		
	}
	@Override
	void area() {
		System.out.println("Area of Circle = "+(Math.PI*this.radius*this.radius));
	}
}
