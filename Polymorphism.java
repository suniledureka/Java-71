class A{
	void display() {
		System.out.println("Inside class A");		
	}
}

class B extends A{
	void display() {
		System.out.println("Inside class B");
	}	
}

class C extends A{
	void display() {
		System.out.println("Inside class C");
	}	
}

public class Polymorphism {
	public static void main(String[] args) {		
		//A obj = new A();
		//B obj = new B();
		A obj = null;

		obj = new C();
		obj.display();

		obj = new B();
		obj.display();

		obj = new A();
		obj.display();
	}
}
