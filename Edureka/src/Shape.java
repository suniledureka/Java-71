
abstract public class Shape {
	String color;
	
	Shape(String color){
		this.color = color;
	}
	
	String getColor() {
		return this.color;
	}
	
	void setColor(String color) {
		this.color = color;
	}
	
	abstract void area();
}
